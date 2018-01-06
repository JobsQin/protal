package cn.qiantongmuseum.pojo;

public class Collect {
    private Long id;

    private String collName;

    private String collYears;

    private String collSize;

    private String collSource;

    private String collText;

    private String collFile;

    private Long collType;
    
    private String collTypeStr;

    public String getCollTypeStr() {
		return collTypeStr;
	}

	public void setCollTypeStr(String collTypeStr) {
		this.collTypeStr = collTypeStr;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName == null ? null : collName.trim();
    }

    public String getCollYears() {
        return collYears;
    }

    public void setCollYears(String collYears) {
        this.collYears = collYears == null ? null : collYears.trim();
    }

    public String getCollSize() {
        return collSize;
    }

    public void setCollSize(String collSize) {
        this.collSize = collSize == null ? null : collSize.trim();
    }

    public String getCollSource() {
        return collSource;
    }

    public void setCollSource(String collSource) {
        this.collSource = collSource == null ? null : collSource.trim();
    }

    public String getCollText() {
        return collText;
    }

    public void setCollText(String collText) {
        this.collText = collText == null ? null : collText.trim();
    }

    public String getCollFile() {
        return collFile;
    }

    public void setCollFile(String collFile) {
        this.collFile = collFile == null ? null : collFile.trim();
    }

    public Long getCollType() {
        return collType;
    }

    public void setCollType(Long collType) {
        this.collType = collType;
    }
}