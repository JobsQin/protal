package cn.qiantongmuseum.pojo;

import java.util.List;

public class Function {
    private Long id;

    private String funcName;

    private String funcUrl;

    private Long parentId;
    
    
    
    public Function() {
		super();
	}

	public Function(Long id, String funcName, String funcUrl, Long parentId) {
		super();
		this.id = id;
		this.funcName = funcName;
		this.funcUrl = funcUrl;
		this.parentId = parentId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

	
    
    
}