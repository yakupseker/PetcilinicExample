package com.javaegitimleri.petclinic.com.javaegitimleri.petclinic.service;

import java.util.List;

import com.javaegitimleri.petclinic.com.javaegitimleri.petclinic.model.Owner;

public interface PetClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
}
