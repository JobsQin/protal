package cn.qiantongmuseum.pojo;

import java.util.Date;

public class Postulant {
    private Long id;

    private String name;

    private String sexName;

    private Long cardID;

    private Long zYZXL;

    private String mobile;

    private String eMail;

    private String linkman;

    private String linMobile;

    private String nowAddress;

    private String workUndergo;

    private Long auditingID;

    private Date applyForDate;

    private Long ifStart;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public Long getCardID() {
        return cardID;
    }

    public void setCardID(Long cardID) {
        this.cardID = cardID;
    }

    public Long getzYZXL() {
        return zYZXL;
    }

    public void setzYZXL(Long zYZXL) {
        this.zYZXL = zYZXL;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinMobile() {
        return linMobile;
    }

    public void setLinMobile(String linMobile) {
        this.linMobile = linMobile == null ? null : linMobile.trim();
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress == null ? null : nowAddress.trim();
    }

    public String getWorkUndergo() {
        return workUndergo;
    }

    public void setWorkUndergo(String workUndergo) {
        this.workUndergo = workUndergo == null ? null : workUndergo.trim();
    }

    public Long getAuditingID() {
        return auditingID;
    }

    public void setAuditingID(Long auditingID) {
        this.auditingID = auditingID;
    }

    public Date getApplyForDate() {
        return applyForDate;
    }

    public void setApplyForDate(Date applyForDate) {
        this.applyForDate = applyForDate;
    }

    public Long getIfStart() {
        return ifStart;
    }

    public void setIfStart(Long ifStart) {
        this.ifStart = ifStart;
    }
    
}