package br.com.basell.entity;

import com.datasul.technology.webdesk.dm.ws.DocumentDto;

public class DocumentExtent
extends DocumentDto {
    private Boolean extra;
    private Boolean provisory;
    private Boolean pending;
    private Boolean renovation;
    private String dateProvisory;
    private String datePending;
    private String dateRenovation;
    private String notificationProvisory;
    private String notificationPending;
    private String notificationRenovation;

    public Boolean getExtra() {
        return this.extra;
    }

    public void setExtra(Boolean extra) {
        this.extra = extra;
    }

    public Boolean getProvisory() {
        return this.provisory;
    }

    public void setProvisory(Boolean provisory) {
        this.provisory = provisory;
    }

    public Boolean getPending() {
        return this.pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Boolean getRenovation() {
        return this.renovation;
    }

    public void setRenovation(Boolean renovation) {
        this.renovation = renovation;
    }

    public String getNotificationProvisory() {
        return this.notificationProvisory;
    }

    public void setNotificationProvisory(String notificationProvisory) {
        this.notificationProvisory = notificationProvisory;
    }

    public String getNotificationPending() {
        return this.notificationPending;
    }

    public void setNotificationPending(String notificationPending) {
        this.notificationPending = notificationPending;
    }

    public String getNotificationRenovation() {
        return this.notificationRenovation;
    }

    public void setNotificationRenovation(String notificationRenovation) {
        this.notificationRenovation = notificationRenovation;
    }

    public String getDateProvisory() {
        return this.dateProvisory;
    }

    public void setDateProvisory(String dataProvisory) {
        this.dateProvisory = dataProvisory;
    }

    public String getDatePending() {
        return this.datePending;
    }

    public void setDatePending(String dataPending) {
        this.datePending = dataPending;
    }

    public String getDateRenovation() {
        return this.dateRenovation;
    }

    public void setDateRenovation(String dataRenovation) {
        this.dateRenovation = dataRenovation;
    }
}