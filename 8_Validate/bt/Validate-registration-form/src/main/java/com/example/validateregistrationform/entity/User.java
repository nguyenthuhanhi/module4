package com.example.validateregistrationform.entity;


import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "First name không được để trống")
    @Size(min=5, max = 45,message = "tối thiểu 5 tối đa 45 ký tự")
    // String thì @Size
    // Int thì @Min or @Max, cả min và max @Range
    @Column(name = "first_name", columnDefinition = "varchar(50)")
    private String firstName;

    @NotBlank(message = "Last name không được để trống")
    @Size(min=5, max = 45,message = "tối thiểu 5 tối đa 45 ký tự")
    @Column(name = "last_name", columnDefinition = "varchar(50)")
    private String last_name;

    @Column(name = "phone_number")
    @Pattern(regexp = "^0\\d{9,10}$", message = "Số điện thoại không hợp lệ")
    private String phoneNumber;

    @Min(18)
    private int age;

//    @Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}",message = "Email k hợp lệ")
    @Email(message = "Email k hợp lệ")
    private String email;

    public User() {
    }

    public User(int id, String firstName, String last_name, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.last_name = last_name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
