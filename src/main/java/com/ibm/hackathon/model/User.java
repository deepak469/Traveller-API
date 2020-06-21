package com.ibm.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name = "user_master")
public class User {

    @Id @Column(name ="user_id") @GeneratedValue(strategy = GenerationType.IDENTITY) private long userId;
    @Column(name="user_type") private String userType;
    @Column(name="first_name") private String firstName;
    @Column(name="last_name") private String lastName;
    @Column(name="image") private String userImage;
    @Column(name="email") private String email;
    @Column(name="gender") private String gender;


    public User() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
