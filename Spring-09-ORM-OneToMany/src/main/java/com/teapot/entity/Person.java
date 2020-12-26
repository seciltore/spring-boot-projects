package com.teapot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person")  //if mappedBy was not written that would create 3 tables
    private List<Address> addresses;

//    @OneToMany
//    @JoinColumn(name = "person_id")
//    private List<Address> addresses;


}
