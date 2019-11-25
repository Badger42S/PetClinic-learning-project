package sfgpetclinic.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Vet;
import sfgpetclinic.model.services.OwnerService;
import sfgpetclinic.model.services.VetServise;
import sfgpetclinic.model.services.map.OwnerServiceMap;
import sfgpetclinic.model.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetServise vetService;

    public DataLoader(OwnerService ownerService, VetServise vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sasha");
        owner1.setLastName("Ivanov");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Yri");
        owner2.setLastName("Ury");

        ownerService.save(owner2);
        System.out.println("Owners save");

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ira");
        vet1.setLastName("Totoro");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Myka");
        vet1.setLastName("Kolos");

        vetService.save(vet2);
        System.out.println("Vets save");
    }
}
