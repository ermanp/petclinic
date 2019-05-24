package com.junique.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Pet
{

    private Long id;
    private String name;
    private Date birthDate;
    private Owner owner;


}
