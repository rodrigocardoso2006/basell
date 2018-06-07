package br.com.basell.ecm;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

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

import br.com.basell.entity.DocumentExtent;
import br.com.basell.utils.BancoConnection;

public class FornecedorController extends BancoConnection {
	public static int parent = 320;
	private FolderServiceService folderService = new FolderServiceService();
	private FolderService serviceFolder = this.folderService.getFolderServicePort();
	private DocumentServiceService documentService = new DocumentServiceService();
	private DocumentService service = this.documentService.getDocumentServicePort();

	public FornecedorController() {
		BindingProvider bp = (BindingProvider) this.service;
		bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", DocumentController.url + "DocumentService");
		BindingProvider bpFolder = (BindingProvider) this.serviceFolder;
		bpFolder.getRequestContext().put("javax.xml.ws.service.endpoint.address",
				DocumentController.url + "FolderService");
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public List<DocumentDto> getDocumentByProvider(Integer pai) {
		ArrayList<DocumentDto> r = new ArrayList<DocumentDto>();
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select nr_documento, ds_principal_documento, ds_comentario_adicional, ds_palavra_chave, versao_ativa, (select count(d.nr_documento) from documento d where d.cod_empresa = doc.cod_empresa and d.nr_documento_pai = doc.nr_documento and d.versao_ativa = 1 and d.nr_versao = (select max(l.nr_versao) from documento l where l.cod_empresa = d.cod_empresa and l.nr_documento = d.nr_documento)) as total from documento doc where doc.nr_documento_pai = "
				+ pai + " and doc.tp_documento = '1' order by doc.ds_principal_documento";
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				DocumentDto d = new DocumentDto();
				d.setDocumentId(Integer.valueOf(rs.getInt("nr_documento")));
				d.setDocumentDescription(rs.getString("ds_principal_documento"));
				d.setActiveVersion(Boolean.valueOf(rs.getBoolean("versao_ativa")));
				d.setAccessCount(Integer.valueOf(rs.getInt("total")));
				d.setDocumentKeyWord(rs.getString("ds_palavra_chave"));
				d.setAdditionalComments(rs.getString("ds_comentario_adicional"));
				r.add(d);
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

	public int create(DocumentDto document) {
		DocumentController dc = new DocumentController();
		System.out.println("\nM\u00e9todo publishFolder\n");
		Integer folder = dc.getDocumentByDescription(document.getDocumentDescription(), parent, "1");
		System.out.println("folder:" + folder);
		if (folder != 0) {
			return folder;
		}
		try {
			DocumentDtoArray documentDtoArray = new DocumentDtoArray();
			DocumentSecurityConfigDtoArray documentSecurityConfigDtoArray = new DocumentSecurityConfigDtoArray();
			ApproverDtoArray approverDtoArray = new ApproverDtoArray();
			WebServiceMessageArray webServiceMessageArray = new WebServiceMessageArray();
			document.setApprovalAndOr(Boolean.valueOf(true));
			document.setApproved(Boolean.valueOf(true));
			document.setApprovedDate(dc.getDate());
			document.setAtualizationId(Integer.valueOf(1));
			document.setColleagueId(DocumentController.matricula);
			document.setCompanyId(1);
			document.setCreateDate(dc.getDate());
			document.setDeleted(Boolean.valueOf(false));
			document.setDocumentType("1");
			document.setDownloadEnabled(Boolean.valueOf(true));
			document.setExpirationDate(dc.getDate());
			document.setExpires(Boolean.valueOf(true));
			document.setInheritSecurity(true);
			document.setLastModifiedDate(dc.getDate());
			document.setParentDocumentId(Integer.valueOf(parent));
			document.setPrivateDocument(Boolean.valueOf(false));
			document.setPublisherId(DocumentController.matricula);
			document.setValidationStartDate(dc.getDate());
			document.setUpdateIsoProperties(true);
			document.setUserNotify(Boolean.valueOf(false));
			document.setVersionOption("0");
			document.setDocumentPropertyNumber(Integer.valueOf(0));
			document.setDocumentPropertyVersion(Integer.valueOf(0));
			document.setVolumeId("Default");
			document.setIconId(Integer.valueOf(0));
			document.setLanguageId("pt");
			document.setIndexed(Boolean.valueOf(false));
			document.setActiveVersion(Boolean.valueOf(true));
			document.setTranslated(false);
			document.setTopicId(Integer.valueOf(1));
			document.setDocumentTypeId("");
			document.setExternalDocumentId("");
			document.setDatasetName("");
			document.setColleagueName("");
			document.setImutable(Boolean.valueOf(false));
			document.setProtectedCopy(Boolean.valueOf(false));
			document.setAccessCount(Integer.valueOf(0));
			documentDtoArray.getItem().add(document);
			webServiceMessageArray = this.serviceFolder.createFolder(DocumentController.matricula,
					DocumentController.senha, DocumentController.company.intValue(), documentDtoArray,
					documentSecurityConfigDtoArray, approverDtoArray);
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

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public void delete(int document) {
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update documento set versao_ativa = 0 where nr_documento = " + document;
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			sql = "update documento set versao_ativa = 0 where nr_documento_pai = " + document;
			System.out.println("SQL:" + sql);
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
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
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public void active(int document) {
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update documento set versao_ativa = 1 where nr_documento = " + document;
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
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
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public void change(int document, String grupo, int ativo) {
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update documento set versao_ativa = " + ativo + ", ds_palavra_chave = '" + grupo
				+ "' where nr_documento = " + document;
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
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
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public String search(String word) {
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String r = "";
		String sql = "select nr_documento from documento where nr_documento_pai = " + parent
				+ " and UPPER(ds_comentario_adicional) like '%" + word.toUpperCase() + "%'";
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				if (r.equals("")) {
					r = rs.getString("nr_documento");
					continue;
				}
				r = r + "," + rs.getString("nr_documento");
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

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public List<DocumentExtent> getAllDocuments(Integer pai) {
		ArrayList<DocumentExtent> r = new ArrayList<DocumentExtent>();
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select doc.nr_documento, doc.nr_documento_pai, doc.ds_principal_documento, doc.ds_comentario_adicional, doc.ds_versao, doc.versao_ativa, doc.dt_criacao, doc.nr_versao, doc.dt_expiracao, doc.log_docto_expira,  (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DATA_PENDENTE') as dataPendente, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DES_PENDENTE') as descricaoPendente, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'PENDENTE') as logPendente, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DATA_PROVISORIO') as dataProvisorio, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DES_PROVISORIO') as descricaoProvisorio, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'PROVISORIO') as logProvisorio, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DATA_RENOVACAO') as dataRenovacao, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'DES_RENOVACAO') as descricaoRenovacao, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'EXTRA') as extra, (select c.cod_valor from docto_campo_custom c where c.cod_empresa = doc.cod_empresa and c.nr_documento = doc.nr_documento and c.nr_versao = doc.nr_versao and c.cod_campo_custom = 'RENOVACAO') as logRenovacao from documento as doc where doc.cod_empresa = 1 and doc.nr_documento_pai = "
				+ pai + " and doc.tp_documento = '2' order by doc.ds_principal_documento";
		System.out.println("SQL:" + sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				DocumentExtent d = new DocumentExtent();
				d.setDocumentId(Integer.valueOf(rs.getInt("nr_documento")));
				d.setParentDocumentId(Integer.valueOf(rs.getInt("nr_documento_pai")));
				d.setDocumentDescription(rs.getString("ds_principal_documento"));
				d.setAdditionalComments(rs.getString("ds_comentario_adicional"));
				d.setVersionDescription(rs.getString("ds_versao"));
				d.setActiveVersion(Boolean.valueOf(rs.getBoolean("versao_ativa")));
				System.out.println("LOG EXPIRA:" + rs.getBoolean("log_docto_expira"));
				d.setExpires(Boolean.valueOf(rs.getBoolean("log_docto_expira")));
				GregorianCalendar gregory = new GregorianCalendar();
				gregory.setTime(rs.getDate("dt_criacao"));
				XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
				d.setCreateDate(calendar);
				d.setVersion(rs.getInt("nr_versao"));
				GregorianCalendar gregoryExpires = new GregorianCalendar();
				gregoryExpires.setTime(rs.getDate("dt_expiracao"));
				XMLGregorianCalendar calendarExpires = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(gregoryExpires);
				d.setExpirationDate(calendarExpires);
				System.out.println("EXPIRES:" + d.getExpirationDate());
				d.setDatePending(rs.getString("dataPendente"));
				d.setDateProvisory(rs.getString("dataProvisorio"));
				d.setDateRenovation(rs.getString("dataRenovacao"));
				d.setNotificationPending(rs.getString("descricaoPendente"));
				d.setNotificationProvisory(rs.getString("descricaoProvisorio"));
				d.setNotificationRenovation(rs.getString("descricaoRenovacao"));
				if (rs.getString("logPendente") != null && rs.getString("logPendente").equalsIgnoreCase("true")) {
					d.setPending(Boolean.valueOf(true));
				} else {
					d.setPending(Boolean.valueOf(false));
				}
				if (rs.getString("logProvisorio") != null && rs.getString("logProvisorio").equalsIgnoreCase("true")) {
					d.setProvisory(Boolean.valueOf(true));
				} else {
					d.setProvisory(Boolean.valueOf(false));
				}
				if (rs.getString("logRenovacao") != null && rs.getString("logRenovacao").equalsIgnoreCase("true")) {
					d.setRenovation(Boolean.valueOf(true));
				} else {
					d.setRenovation(Boolean.valueOf(false));
				}
				if (rs.getString("extra") != null && rs.getString("extra").equalsIgnoreCase("true")) {
					d.setExtra(Boolean.valueOf(true));
				} else {
					d.setExtra(Boolean.valueOf(false));
				}
				r.add(d);
			}
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
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

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public void delete(int doc, int version) {
		Connection conn = this.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "";
			sql = "update documento set versao_ativa = 0 where cod_empresa = 1 and nr_documento = " + doc
					+ " and nr_versao = " + version;
			System.out.println("SQL:" + sql);
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				conn.close();
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception se) {
			}
		}
	}

	public WebServiceMessageArray publish(int doc, int version, DocumentExtent document, File f, byte[] content) {
		System.out.println("\nMetodo createDocument:" + doc + ":" + DocumentController.matricula);
		System.out.println("\nDOC OK:");
		DocumentController dc = new DocumentController();
		try {
			DocumentDtoArray documentDtoArray = new DocumentDtoArray();
			AttachmentArray attachmentArray = new AttachmentArray();
			DocumentSecurityConfigDtoArray documentSecurityConfigDtoArray = new DocumentSecurityConfigDtoArray();
			ApproverDtoArray approverDtoArray = new ApproverDtoArray();
			RelatedDocumentDtoArray relatedDocumentDtoArray = new RelatedDocumentDtoArray();
			WebServiceMessageArray webServiceMessageArray = new WebServiceMessageArray();
			document.setApprovalAndOr(Boolean.valueOf(true));
			document.setApproved(Boolean.valueOf(true));
			document.setApprovedDate(dc.getDate());
			document.setAtualizationId(Integer.valueOf(1));
			document.setColleagueId(DocumentController.matricula);
			document.setCompanyId(1);
			document.setDeleted(Boolean.valueOf(false));
			document.setDownloadEnabled(Boolean.valueOf(true));
			document.setInheritSecurity(true);
			document.setLastModifiedDate(dc.getDate());
			document.setPrivateDocument(Boolean.valueOf(false));
			document.setPublisherId(DocumentController.matricula);
			document.setValidationStartDate(dc.getDate());
			document.setUpdateIsoProperties(false);
			document.setUserNotify(Boolean.valueOf(false));
			document.setDocumentPropertyNumber(Integer.valueOf(0));
			document.setDocumentPropertyVersion(Integer.valueOf(0));
			document.setVolumeId("Default");
			document.setIconId(Integer.valueOf(2));
			document.setLanguageId("pt");
			document.setIndexed(Boolean.valueOf(false));
			document.setActiveVersion(Boolean.valueOf(true));
			document.setTranslated(false);
			document.setTopicId(Integer.valueOf(1));
			document.setDocumentTypeId("");
			document.setExternalDocumentId("");
			document.setDatasetName("");
			document.setColleagueName("");
			document.setImutable(Boolean.valueOf(false));
			document.setProtectedCopy(Boolean.valueOf(false));
			document.setAccessCount(Integer.valueOf(0));
			document.setDocumentType("2");
			System.out.println("DATE:" + dc.getDate() + ":" + document.getDocumentKeyWord());
			documentDtoArray.getItem().add(document);
			Attachment attachment = new Attachment();
			if (f != null && f.exists()) {
				attachment.setFileName(f.getAbsoluteFile().getName());
				attachment.setPrincipal(Boolean.valueOf(true));
				attachment.setFilecontent(content);
			} else if (doc != 0) {
				DocumentDtoArray v = this.service.getActiveDocument(DocumentController.matricula,
						DocumentController.senha, DocumentController.company.intValue(), doc,
						DocumentController.matricula);
				DocumentDto va = (DocumentDto) v.getItem().get(0);
				byte[] c = this.service.getDocumentContent(DocumentController.matricula, DocumentController.senha,
						DocumentController.company.intValue(), doc, DocumentController.matricula, version,
						va.getPhisicalFile());
				attachment.setFileName(va.getPhisicalFile());
				attachment.setPrincipal(Boolean.valueOf(true));
				attachment.setFilecontent(c);
			}
			attachmentArray.getItem().add(attachment);
			if (doc == 0) {
				System.out.println("create: " + doc);
				webServiceMessageArray = this.service.createDocument(DocumentController.matricula,
						DocumentController.senha, DocumentController.company.intValue(), documentDtoArray,
						attachmentArray, documentSecurityConfigDtoArray, approverDtoArray, relatedDocumentDtoArray);
			} else {
				System.out.println("update: " + doc);
				document.setDocumentId(Integer.valueOf(doc));
				webServiceMessageArray = this.service.updateDocument(DocumentController.matricula,
						DocumentController.senha, DocumentController.company.intValue(), documentDtoArray,
						attachmentArray, documentSecurityConfigDtoArray, approverDtoArray, relatedDocumentDtoArray);
			}
			if (((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId() > 0) {
				document.setDocumentId(
						Integer.valueOf(((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId()));
				document.setVersion(((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getVersion());
				this.createFields(document, doc);
				System.out.println(
						"Documento " + ((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getDocumentId()
								+ " foi publicado!");
			} else {
				System.out
						.println(((WebServiceMessage) webServiceMessageArray.getItem().get(0)).getWebServiceMessage());
			}
			return webServiceMessageArray;
		} catch (DatatypeConfigurationException e1) {
			System.out.println("DatatypeConfigurationException: " + e1);
		} catch (Exception_Exception e) {
			System.out.println("Exception_Exception: " + (Object) e);
		}
		return null;
	}

	/*
	 * WARNING - Removed try catching itself - possible behaviour change.
	 */
	public void createFields(DocumentExtent doc, int numero) {
		Connection conn = this.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "";
			if (numero == 0) {
				sql = "insert into docto_campo_custom (cod_empresa, nr_documento, nr_versao, cod_campo_custom, cod_valor) ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion()
						+ ", 'DATA_PENDENTE', '' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'DES_PENDENTE', '"
						+ doc.getNotificationPending() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'PENDENTE', '"
						+ doc.getPending() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion()
						+ ", 'DATA_PROVISORIO', '' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'DES_PROVISORIO', '"
						+ doc.getNotificationProvisory() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'PROVISORIO', '"
						+ doc.getProvisory() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion()
						+ ", 'DATA_RENOVACAO', '' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'DES_RENOVACAO', '"
						+ doc.getNotificationRenovation() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'EXTRA', '"
						+ doc.getExtra() + "' union all ";
				sql = sql + " select 1, " + doc.getDocumentId() + ", " + doc.getVersion() + ", 'RENOVACAO', '"
						+ doc.getRenovation() + "'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
			} else {
				sql = "update docto_campo_custom set cod_valor = '" + doc.getNotificationPending()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'DES_PENDENTE'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
				sql = "update docto_campo_custom set cod_valor = '" + doc.getPending()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'PENDENTE'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
				sql = "update docto_campo_custom set cod_valor = '" + doc.getNotificationProvisory()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'DES_PROVISORIO'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
				sql = "update docto_campo_custom set cod_valor = '" + doc.getProvisory()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'PROVISORIO'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
				sql = "update docto_campo_custom set cod_valor = '" + doc.getNotificationRenovation()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'DES_RENOVACAO'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
				sql = "update docto_campo_custom set cod_valor = '" + doc.getRenovation()
						+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
						+ doc.getVersion() + " and cod_campo_custom = 'RENOVACAO'";
				System.out.println("SQL:" + sql);
				stmt = conn.prepareStatement(sql);
				stmt.executeUpdate();
			}
			System.out.println("EXPIRA:" + doc.isExpires());
			sql = "update documento set log_docto_expira = '" + doc.isExpires()
					+ "' where cod_empresa = 1 and nr_documento = " + doc.getDocumentId() + " and nr_versao = "
					+ doc.getVersion();
			System.out.println("SQL:" + sql);
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				conn.close();
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception se) {
			}
		}
	}
}