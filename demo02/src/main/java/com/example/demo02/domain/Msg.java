package com.example.demo02.domain;

/**
 * @description:
 * @author: Ann
 * @date: 2018/7/1
 */
public class Msg {

    private String title;
    private String content;
    private String extraInfo;


    public Msg(String title, String content, String extraInfo) {
        super();
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
