package com.example.demo01.domain.rep;

import java.util.List;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/26
 */
public class PageRep {

    private int total;

    private int currentNum;

    private List<UserRep> users;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public List<UserRep> getUsers() {
        return users;
    }

    public void setUsers(List<UserRep> users) {
        this.users = users;
    }
}
