package com.tavisca.irctc.models;

import com.tavisca.irctc.enums.Gender;
import com.tavisca.irctc.enums.Role;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private  int id;
    private String name;
    private int age;
    private Gender gender;
    @Column(unique = true)
    private String email;
    private String password;
    private Role role;

    public User() {
    }

    public User( String name, int age, Gender gender, String email, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.role=Role.GeneralUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
