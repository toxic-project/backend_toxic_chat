package com.ucb.bo.ToxicChat.model;

import java.util.Date;

public class User extends Transactions {
    private Integer idUser;
    private String username;
    private String password;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String photo;
    private Integer status;

    public User() {
    }

    public User(Integer idUser, String username, String password, String name, String lastName, String email, String gender, String photo, Integer status) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.photo = photo;
        this.status = status;
    }

    public User(Integer txId, String txHost, Integer txUserId, Date txDate, Integer idUser, String username, String password, String name, String lastName, String email, String gender, String photo, Integer status) {
        super(txId, txHost, txUserId, txDate);
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.photo = photo;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", photo='" + photo + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
