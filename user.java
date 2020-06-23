package com.SE.java;

public class user {
    private int id;
    //真实姓名
    private String name;
    //身份证号
    private String user_id;
    private String username;
    private String password;
    private String email;
    private String phone;
    //user角色，0为系统管理员，1为普通管理员，2为普通用户
    private  int role;
    //密码提示问题
    private String question;
    //问题答案
    private  String answer;

    //get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public user() {
    }

    public user(int id, String username, String password, String email, String phone, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public user(int id, String name, String user_id, String username, String password, String email, String phone, int role, String question, String answer) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.question = question;
        this.answer = answer;
    }
}
