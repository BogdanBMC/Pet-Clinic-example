package ClinicExample.PetClinic.Services;

import ClinicExample.PetClinic.Model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDservices<Owner, Long> {

    Owner fidByLastName(String lastname);



}
