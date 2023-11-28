package ClinicExample.PetClinic.bootsrap;

import ClinicExample.PetClinic.Model.Owner;
import ClinicExample.PetClinic.Model.Vet;
import ClinicExample.PetClinic.Services.OwnerService;
import ClinicExample.PetClinic.Services.PetService;
import ClinicExample.PetClinic.Services.VetService;
import ClinicExample.PetClinic.Services.map.OwnerServiceMap;
import ClinicExample.PetClinic.Services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//load data on boot class


//spring dupa ce e contextu gata , vede comandlinerunner si o sa ruleze run()
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
       ownerService = new OwnerServiceMap();
       vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("owner1fn");
        owner1.setLastName("owner1ln");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("owner2fn");
        owner2.setLastName("owner2ln");
        ownerService.save(owner2);

        System.out.println("loaded owners");

        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("vet1fn");
        vet1.setLastName("vet1ln");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("vet2fn");
        vet2.setLastName("vet2ln");
        vetService.save(vet2);

        System.out.println("loaded vets");

    }
}
