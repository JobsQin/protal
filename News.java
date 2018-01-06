package cn.qiantongmuseum.pojo;

import java.util.Date;

public class News {
    private Long id;

    private String newsTitle;

    private Date newsDate;

    private String newsFile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsFile() {
        return newsFile;
    }

    public void setNewsFile(String newsFile) {
        this.newsFile = newsFile == null ? null : newsFile.trim();
    }
}