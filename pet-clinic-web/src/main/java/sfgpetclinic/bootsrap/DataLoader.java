package sfgpetclinic.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinic.model.Owner;
import sfgpetclinic.model.PetType;
import sfgpetclinic.model.Vet;
import sfgpetclinic.model.services.OwnerService;
import sfgpetclinic.model.services.PetTypeService;
import sfgpetclinic.model.services.VetServise;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetServise vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetServise vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        dog.setName("Dog");
        PetType saveDogPetType= petTypeService.save(dog);
        PetType cat=new PetType();
        cat.setName("Cat");
        PetType saveCatPetType= petTypeService.save(cat);

        Owner owner1=new Owner();
        owner1.setFirstName("Sasha");
        owner1.setLastName("Ivanov");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Yri");
        owner2.setLastName("Ury");

        ownerService.save(owner2);
        System.out.println("Owners save");

        Vet vet1=new Vet();
        vet1.setFirstName("Ira");
        vet1.setLastName("Totoro");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Myka");
        vet2.setLastName("Kolos");

        vetService.save(vet2);
        System.out.println("Vets save");
    }
}
