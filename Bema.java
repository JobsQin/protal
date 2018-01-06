package cn.qiantongmuseum.pojo;

import java.util.Date;

public class Bema {
    private Long id;

    private String bemaTitle;

    private Date bemaTime;

    private String bemaAdd;

    private String bemaMobile;

    private String bemaAge;

    private String bemaFile;

    private String bemaSynopsis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBemaTitle() {
        return bemaTitle;
    }

    public void setBemaTitle(String bemaTitle) {
        this.bemaTitle = bemaTitle == null ? null : bemaTitle.trim();
    }

    public Date getBemaTime() {
        return bemaTime;
    }

    public void setBemaTime(Date bemaTime) {
        this.bemaTime = bemaTime;
    }

    public String getBemaAdd() {
        return bemaAdd;
    }

    public void setBemaAdd(String bemaAdd) {
        this.bemaAdd = bemaAdd == null ? null : bemaAdd.trim();
    }

    public String getBemaMobile() {
        return bemaMobile;
    }

    public void setBemaMobile(String bemaMobile) {
        this.bemaMobile = bemaMobile == null ? null : bemaMobile.trim();
    }

    public String getBemaAge() {
        return bemaAge;
    }

    public void setBemaAge(String bemaAge) {
        this.bemaAge = bemaAge == null ? null : bemaAge.trim();
    }

    public String getBemaFile() {
        return bemaFile;
    }

    public void setBemaFile(String bemaFile) {
        this.bemaFile = bemaFile == null ? null : bemaFile.trim();
    }

    public String getBemaSynopsis() {
        return bemaSynopsis;
    }

    public void setBemaSynopsis(String bemaSynopsis) {
        this.bemaSynopsis = bemaSynopsis == null ? null : bemaSynopsis.trim();
    }
}
