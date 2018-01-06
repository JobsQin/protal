package cn.qiantongmuseum.pojo;

import java.util.Date;

public class Forms {
    private Long id;

    private Long postulantId;

    private Long extTimeId;

    private Long ifRegister;

    private Date registerData;

    private Long ifNew;

    private Date foundData;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostulantId() {
        return postulantId;
    }

    public void setPostulantId(Long postulantId) {
        this.postulantId = postulantId;
    }

    public Long getExtTimeId() {
        return extTimeId;
    }

    public void setExtTimeId(Long extTimeId) {
        this.extTimeId = extTimeId;
    }

    public Long getIfRegister() {
        return ifRegister;
    }

    public void setIfRegister(Long ifRegister) {
        this.ifRegister = ifRegister;
    }

    public Date getRegisterData() {
        return registerData;
    }

    public void setRegisterData(Date registerData) {
        this.registerData = registerData;
    }

    public Long getIfNew() {
        return ifNew;
    }

    public void setIfNew(Long ifNew) {
        this.ifNew = ifNew;
    }

    public Date getFoundData() {
        return foundData;
    }

    public void setFoundData(Date foundData) {
        this.foundData = foundData;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}