package com.teapot.entity;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    private Long id;

    private String street;
    private String zipCode;

    @ManyToOne    //foreign key comes from manytoOne
    private Person person;

}
