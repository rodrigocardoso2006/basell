package br.com.basell.ecm;

import br.com.basell.utils.BancoConnection;
import com.datasul.technology.webdesk.dm.ws.ApproverDtoArray;
import com.datasul.technology.webdesk.dm.ws.Attachment;
import com.datasul.technology.webdesk.dm.ws.AttachmentArray;
import com.datasul.technology.webdesk.dm.ws.DocumentDto;
import com.datasul.technology.webdesk.dm.ws.DocumentDtoArray;
import com.datasul.technology.webdesk.dm.ws.DocumentSecurityConfigDtoArray;
import com.datasul.technology.webdesk.dm.ws.DocumentService;
import com.datasul.technology.webdesk.dm.ws.DocumentServiceService;
import com.datasul.technology.webdesk.dm.ws.Exception_Exception;
import com.datasul.technology.webdesk.dm.ws.FolderService;
import com.datasul.technology.webdesk.dm.ws.FolderServiceService;
import com.datasul.technology.webdesk.dm.ws.RelatedDocumentDtoArray;
import com.datasul.technology.webdesk.dm.ws.WebServiceMessage;
import com.datasul.technology.webdesk.dm.ws.WebServiceMessageArray;
import java.io.File;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

public class DocumentController extends BancoConnection {
	private DocumentServiceService documentService = new DocumentServiceService();
	private DocumentService service = this.documentService.getDocumentServicePort();
	FolderServiceService folderService = new FolderServiceService();
	FolderService serviceFolder = this.folderService.getFolderServicePort();
	public static Integer company = 1;
	private static Integer parent = 113;
	public static String matricula = "integrador";
	public static String senha = "integrador";
	public static String url = "http://pinasp2:8180/webdesk/";

	public DocumentController() {
		BindingProvider bp = (BindingProvider) this.service;
		bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", url + "DocumentService");
		BindingProvider bpFolder = (BindingProvider) this.serviceFolder;
		bpFolder.getRequestContext().put("javax.xml.ws.service.endpoint.address", url + "FolderService");
	}

	public Integer publish(Integer folderCustomer, String nome, File f, byte[] content) {
		System.out.println("\nM\ufffdtodo createDocument:" + folderCustomer + ":" + matricula);
		Integer doc = this.getDocumentByDescription(nome, folderCustomer, "2");
		System.out.println("\nDOC OK:" + doc);
		try {
			DocumentDto documentDto = new DocumentDto();
			DocumentDtoArray documentDtoArray = new DocumentDtoArray();
			AttachmentArray attachmentArray = new AttachmentArray();
			DocumentSecurityConfigDtoArray documentSecurityConfigDtoArray = new DocumentSecurityConfigDtoArray();
			ApproverDtoArray approverDtoArray = new ApproverDtoArray();
			RelatedDocumentDtoArray relatedDocumentDtoArray = new RelatedDocumentDtoArray();
			WebServiceMessageArray webServiceMessageArray = new WebServiceMessageArray();
			documentDto = new DocumentDto();
			documentDto.setApprovalAndOr(Boolean.valueOf(true));
			documentDto.setApproved(Boolean.valueOf(true));
			documentDto.setApprovedDate(this.getDate());
			documentDto.setAtualizationId(Integer.valueOf(1));
			documentDto.setColleagueId(matricula);
			documentDto.setCompanyId(1);
			documentDto.setCreateDate(this.getDate());
			documentDto.setDeleted(Boolean.valueOf(false));
			documentDto.setDownloadEnabled(Boolean.valueOf(true));
			documentDto.setExpirationDate(this.getDate());
			documentDto.setExpires(Boolean.valueOf(false));
			documentDto.setInheritSecurity(true);
			documentDto.setLastModifiedDate(this.getDate());
			documentDto.setParentDocumentId(folderCustomer);
			documentDto.setPrivateDocument(Boolean.valueOf(false));
			documentDto.setPublisherId(matricula);
			documentDto.setValidationStartDate(this.getDate());
			documentDto.setUpdateIsoProperties(false);
			documentDto.setUserNotify(Boolean.valueOf(false));
			documentDto.setVersionOption("0");
			documentDto.setDocumentPropertyNumber(Integer.valueOf(0));
			documentDto.setDocumentPropertyVersion(Integer.valueOf(0));
			documentDto.setVolumeId("Default");
			documentDto.setIconId(Integer.valueOf(2));
			documentDto.setLanguageId("pt");
			documentDto.setIndexed(Boolean.valueOf(false));
			documentDto.setActiveVersion(Boolean.valueOf(true));
			documentDto.setTranslated(false);
			documentDto.setTopicId(Integer.valueOf(1));
			documentDto.setDocumentTypeId("");
			documentDto.setExternalDocumentId("");
			documentDto.setDatasetName("");
			documentDto.setColleagueName("");
			documentDto.setVersionDescription("");
			documentDto.setKeyWord("");
			documentDto.setAdditionalComments("");
			documentDto.setImutable(Boolean.valueOf(false));
			documentDto.setProtectedCopy(Boolean.valueOf(false));
			documentDto.setAccessCount(Integer.valueOf(0));
			documentDto.setVersion(1000);
			documentDto.setParentDocumentId(folderCustomer);
			documentDto.setDocumentDescription(nome);
			documentDto.setDocumentType("2");
			documentDtoArray.getItem().add(documentDto);
			Attachment attachment = new Attachment();
			if (f != null && f.exists()) {
				attachment.setFileName(f.getAbsoluteFile().getName());
				attachment.setPrincipal(Boolean.valueOf(true));
				attachment.setFilecontent(content);
			}
			attachmentArray.getItem().add(attachment);
			if (doc == 0) {
				System.out.println("create: " + doc);
				webServiceMessageArray = this.service.createDocument(matricula, senha, company.intValue(),
						documentDtoArray, attachmentArray, documentSecurityConfigDtoArray, approverDtoArray,
						relatedDocumentDtoArray);
			} else {
				System.out.println("update: " + doc);
				documentDto.setDocumentId(doc);
				webServiceMessageArray = this.service.updateDocument(matricula, senha, company.intValue(),
						documentDtoArray, attachmentArray, documentSecurityConfigDtoArray, approverDtoArray,
						relatedDocumentDtoArray);
			}
			if (((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId() > 0) {
				System.out.println(
						"Documento " + ((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId()
								+ " foi publicado!");
				return ((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId();
			}
			System.out.println(((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getWebServiceMessage());
		} catch (DatatypeConfigurationException e1) {
			System.out.println("DatatypeConfigurationException: " + e1);
		} catch (Exception_Exception e) {
			System.out.println("Exception_Exception: " + (Object) e);
		}
		return 0;
	}

	public Integer publishFolder(String descricao) {
		System.out.println("\nM\ufffdtodo publishFolder\n");
		Integer folder = this.getDocumentByDescription(descricao, parent, "1");
		System.out.println("folder:" + folder);
		if (folder != 0) {
			return folder;
		}
		try {
			DocumentDto documentDto = new DocumentDto();
			DocumentDtoArray documentDtoArray = new DocumentDtoArray();
			DocumentSecurityConfigDtoArray documentSecurityConfigDtoArray = new DocumentSecurityConfigDtoArray();
			ApproverDtoArray approverDtoArray = new ApproverDtoArray();
			WebServiceMessageArray webServiceMessageArray = new WebServiceMessageArray();
			documentDto.setApprovalAndOr(Boolean.valueOf(true));
			documentDto.setApproved(Boolean.valueOf(true));
			documentDto.setApprovedDate(this.getDate());
			documentDto.setAtualizationId(Integer.valueOf(1));
			documentDto.setColleagueId(matricula);
			documentDto.setCompanyId(1);
			documentDto.setCreateDate(this.getDate());
			documentDto.setDeleted(Boolean.valueOf(false));
			documentDto.setDocumentDescription(descricao);
			documentDto.setDocumentType("1");
			documentDto.setDownloadEnabled(Boolean.valueOf(true));
			documentDto.setExpirationDate(this.getDate());
			documentDto.setExpires(Boolean.valueOf(true));
			documentDto.setInheritSecurity(true);
			documentDto.setLastModifiedDate(this.getDate());
			documentDto.setParentDocumentId(parent);
			documentDto.setPrivateDocument(Boolean.valueOf(false));
			documentDto.setPublisherId(matricula);
			documentDto.setValidationStartDate(this.getDate());
			documentDto.setUpdateIsoProperties(true);
			documentDto.setUserNotify(Boolean.valueOf(false));
			documentDto.setVersionOption("0");
			documentDto.setDocumentPropertyNumber(Integer.valueOf(0));
			documentDto.setDocumentPropertyVersion(Integer.valueOf(0));
			documentDto.setVolumeId("Default");
			documentDto.setIconId(Integer.valueOf(0));
			documentDto.setLanguageId("pt");
			documentDto.setIndexed(Boolean.valueOf(false));
			documentDto.setActiveVersion(Boolean.valueOf(true));
			documentDto.setTranslated(false);
			documentDto.setTopicId(Integer.valueOf(1));
			documentDto.setDocumentTypeId("");
			documentDto.setExternalDocumentId("");
			documentDto.setDatasetName("");
			documentDto.setColleagueName("");
			documentDto.setVersionDescription("");
			documentDto.setKeyWord("");
			documentDto.setAdditionalComments("");
			documentDto.setImutable(Boolean.valueOf(false));
			documentDto.setProtectedCopy(Boolean.valueOf(false));
			documentDto.setAccessCount(Integer.valueOf(0));
			documentDtoArray.getItem().add(documentDto);
			webServiceMessageArray = this.serviceFolder.createFolder(matricula, senha, company.intValue(),
					documentDtoArray, documentSecurityConfigDtoArray, approverDtoArray);
			System.out.println("Pasta " + ((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId()
					+ " foi publicado!");
			return ((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId();
		} catch (DatatypeConfigurationException e1) {
			e1.printStackTrace();
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public XMLGregorianCalendar getDate() throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		XMLGregorianCalendar expirationDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return expirationDate;
	}

	public XMLGregorianCalendar getDate(String date) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		XMLGregorianCalendar expirationDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		String[] d = date.split("/");
		expirationDate.setDay(Integer.parseInt(d[0]));
		expirationDate.setMonth(Integer.parseInt(d[1]) - 1);
		expirationDate.setYear(Integer.parseInt(d[2]));
		return expirationDate;
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public Integer getDocumentByDescription(String descricao, Integer pai, String tipo) {
		Integer r = 0;
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT nr_documento FROM documento where cod_empresa = " + company + " and nr_documento_pai = "
				+ pai + " and ds_principal_documento = '" + descricao + "' and versao_ativa = 1 and tp_documento = '"
				+ tipo + "'";
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				r = rs.getInt("nr_documento");
			}
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception se) {
			}
		}
		return r;
	}
}