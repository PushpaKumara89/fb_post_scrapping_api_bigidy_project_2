package com.wixis.bigidy.activity.modle;

import java.util.Objects;

public class Page {
    private long id;
    private String url;
    private String page_name;
    private String cover_image;
    private String user_saved;
    private boolean activate;
    private String activated_Time;

    public Page() {
    }

    public Page(String url, String page_name, String cover_image, String user_saved, boolean activate, String activated_Time) {
        this.url = url;
        this.page_name = page_name;
        this.cover_image = cover_image;
        this.user_saved = user_saved;
        this.activate = activate;
        this.activated_Time = activated_Time;
    }

    public Page(long id, String url, String page_name, String cover_image, String user_saved, boolean activate, String activated_Time) {
        this.setId(id);
        this.setUrl(url);
        this.setPage_name(page_name);
        this.setCover_image(cover_image);
        this.setUser_saved(user_saved);
        this.setActivate(activate);
        this.setActivated_Time(activated_Time);
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", page_name='" + page_name + '\'' +
                ", cover_image='" + cover_image + '\'' +
                ", user_saved='" + user_saved + '\'' +
                ", activate=" + activate +
                ", activated_Time='" + activated_Time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Page)) return false;
        Page page = (Page) o;
        return getId() == page.getId() && getUrl().equals(page.getUrl()) && getPage_name().equals(page.getPage_name()) && getCover_image().equals(page.getCover_image()) && getUser_saved().equals(page.getUser_saved());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUrl(), getPage_name(), getCover_image(), getUser_saved());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public String getUser_saved() {
        return user_saved;
    }

    public void setUser_saved(String user_saved) {
        this.user_saved = user_saved;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public String getActivated_Time() {
        return activated_Time;
    }

    public void setActivated_Time(String activated_Time) {
        this.activated_Time = activated_Time;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("PageENTT instance is deleted");
    }
}
