package com.junique.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Owner
{
    private Long id;
    private String firstName;
    private String lastName;

    private Set<Pet> pets = new HashSet<>();


}
