package com.ashish.spring.sample.demo;

import java.util.Objects;

public class Tweet {
    private Integer id;

    private String title;

    private String msg;

    public Tweet() {}

    public Tweet(Integer id, String title, String msg) {
        this.id = id;
        this.title = title;
        this.msg = msg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return Objects.equals(id, tweet.id) &&
                Objects.equals(title, tweet.title) &&
                Objects.equals(msg, tweet.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, msg);
    }
}
