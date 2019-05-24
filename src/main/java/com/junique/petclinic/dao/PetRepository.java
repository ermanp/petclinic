package com.junique.petclinic.dao;

import com.junique.petclinic.model.Owner;
import com.junique.petclinic.model.Pet;

import java.util.List;

public interface PetRepository
{
    Pet findById(Long id);
    List<Pet> findByOwnerId(Long ownerId);
    void create(Pet pet);
    Pet update(Pet pet);
    void delete(Long id);
    void deleteByOwnerId(Long ownerId);


}
