package com.userservice.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userid;
    private String name;
    private String phone;

    List<Contacts> contactsList = new ArrayList<>();


    public User(Long userid, String name, String phone, List<Contacts> contactsList) {
        this.userid = userid;
        this.name = name;
        this.phone = phone;
        this.contactsList = contactsList;
    }


    public User(Long userid, String name, String phone) {
        this.userid = userid;
        this.name = name;
        this.phone = phone;
    }


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }
}
