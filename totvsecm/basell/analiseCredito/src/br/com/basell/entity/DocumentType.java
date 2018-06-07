package br.com.basell.entity;

public class DocumentType {
    private String code;
    private String description;
    private Boolean provisory;
    private Boolean renovation;
    private Boolean pending;
    private Boolean mandatory;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getProvisory() {
        return this.provisory;
    }

    public void setProvisory(Boolean provisory) {
        this.provisory = provisory;
    }

    public Boolean getRenovation() {
        return this.renovation;
    }

    public void setRenovation(Boolean renovation) {
        this.renovation = renovation;
    }

    public Boolean getPending() {
        return this.pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Boolean getMandatory() {
        return this.mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }
}