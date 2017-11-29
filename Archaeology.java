package cn.qiantongmuseum.pojo;

import java.util.Date;

public class Archaeology {
    private Long id;

    private String arc_Title;

    private Date arc_Time;

    private String arc_Synopsis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArc_Title() {
        return arc_Title;
    }

    public void setArc_Title(String arc_Title) {
        this.arc_Title = arc_Title == null ? null : arc_Title.trim();
    }

    public Date getArc_Time() {
        return arc_Time;
    }

    public void setArc_Time(Date arc_Time) {
        this.arc_Time = arc_Time;
    }

    public String getArc_Synopsis() {
        return arc_Synopsis;
    }

    public void setArc_Synopsis(String arc_Synopsis) {
        this.arc_Synopsis = arc_Synopsis == null ? null : arc_Synopsis.trim();
    }
}