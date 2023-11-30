package ClinicExample.PetClinic.Services.map;

import ClinicExample.PetClinic.Model.Pet;
import ClinicExample.PetClinic.Services.CRUDservices;
import ClinicExample.PetClinic.Services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        this.findByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteByObject(object);
    }

    @Override
    public Pet findByID(Long id) {
      return   this.findByID(id);
    }
}
