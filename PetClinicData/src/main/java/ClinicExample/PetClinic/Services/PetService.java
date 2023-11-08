package ClinicExample.PetClinic.Services;

import ClinicExample.PetClinic.Model.Owner;
import ClinicExample.PetClinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();


}
