package com.teapot.entity;

import com.teapot.enums.UserRole;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
@ToString
public class Account extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    @Column(name = "zip_code")
    private String zipCode;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @OneToOne(mappedBy = "account")
    private User user;


    public Account(String name, String address, String country, String state, String city, Integer age, String zipCode, UserRole role) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.state = state;
        this.city = city;
        this.age = age;
        this.zipCode = zipCode;
        this.role = role;
    }
}