package com.junique.petclinic.service;

import com.junique.petclinic.exception.OwnerNotFoundException;
import com.junique.petclinic.model.Owner;
import com.junique.petclinic.model.Pet;

import java.util.List;

public interface PetClinicService
{
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(Long id);


}
