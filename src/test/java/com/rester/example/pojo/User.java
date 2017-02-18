package com.rester.example.pojo;

import com.rester.annotations.Attribute;
import com.rester.annotations.Id;
import com.rester.annotations.Resource;

/**
 * Example user Java Bean with private fields, full-fledged constructors, getters and setters.
 */
@Resource
public class User {

    @Id @Attribute private String username;
    @Attribute(exposed = false) private String password;
    @Attribute private String nickname;
    @Attribute private String phoneNum;

    /* No-arg constructor is required. */
    public User() {}

    public User(String username, String password, String nickname, String phoneNum) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phoneNum = phoneNum;
    }

    /* Getters and Setters */
    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getNickname() { return nickname; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getPhoneNum() { return phoneNum; }

    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
}
