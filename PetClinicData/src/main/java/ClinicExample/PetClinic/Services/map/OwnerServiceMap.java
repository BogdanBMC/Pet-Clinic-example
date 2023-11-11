package ClinicExample.PetClinic.Services.map;

import ClinicExample.PetClinic.Model.Owner;
import ClinicExample.PetClinic.Services.CRUDservices;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CRUDservices<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteByID(Long id) {
         super.deleteByID(id);
    }
}
