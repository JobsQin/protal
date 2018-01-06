package cn.qiantongmuseum.pojo;

public class Collecttype {
    private Long id;

    private String colltype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColltype() {
        return colltype;
    }

    public void setColltype(String colltype) {
        this.colltype = colltype == null ? null : colltype.trim();
    }
}