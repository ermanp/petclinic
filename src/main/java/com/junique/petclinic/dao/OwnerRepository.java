package com.junique.petclinic.dao;

import com.junique.petclinic.model.Owner;
import com.junique.petclinic.model.Pet;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface OwnerRepository
{
    List<Owner> findAll();
    Owner findById(Long id);
    List<Owner> findByLastName(String lastName);
    void create(Owner owner);
    Owner update(Owner owner);
    void delete(Long id);


}
