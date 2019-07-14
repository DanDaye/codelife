package com.blog.entity;

public class User {
    private long user_id;
    private long visit_count;
    private String github;
    private String brief_introduction;

    public long getUser_id() {
        return user_id;
    }

    public long getVisit_count() {
        return visit_count;
    }

    public String getBrief_introduction() {
        return brief_introduction;
    }

    public String getGithub() {
        return github;
    }

    public void setBrief_introduction(String brief_introduction) {
        this.brief_introduction = brief_introduction;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setVisit_count(long visit_count) {
        this.visit_count = visit_count;
    }

    @Override
    public String toString() {
        return "User[user_id="+user_id+",visit_count="+visit_count+",github="+github+",brief_introduction="+brief_introduction+"]";
    }
}
