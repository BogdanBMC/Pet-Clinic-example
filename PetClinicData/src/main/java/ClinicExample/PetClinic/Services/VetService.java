package ClinicExample.PetClinic.Services;

import ClinicExample.PetClinic.Model.Owner;
import ClinicExample.PetClinic.Model.Vet;

import java.util.Set;

public interface VetService{


    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();


}
