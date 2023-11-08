package ClinicExample.PetClinic.Services;

import ClinicExample.PetClinic.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner fidByLastName(String lastname);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
