package ClinicExample.PetClinic.Services.map;

import ClinicExample.PetClinic.Model.Vet;
import ClinicExample.PetClinic.Services.CRUDservices;
import ClinicExample.PetClinic.Services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
       return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
