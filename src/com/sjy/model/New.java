package com.sjy.model;

import java.util.Date;

public class New {
    private Integer newsid;

    private String newstitle;

    private Integer typeid;

    private Date newsdate;

    private String newscontent;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

	@Override
	public String toString() {
		return "New [newsid=" + newsid + ", newstitle=" + newstitle
				+ ", typeid=" + typeid + ", newsdate=" + newsdate
				+ ", newscontent=" + newscontent + "]";
	}
    
    
}