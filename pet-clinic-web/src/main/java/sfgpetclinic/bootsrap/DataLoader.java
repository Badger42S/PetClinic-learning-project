package sfgpetclinic.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Pet;
import sfgpetclinic.model.PetType;
import sfgpetclinic.model.Vet;
import sfgpetclinic.model.services.OwnerService;
import sfgpetclinic.model.services.PetTypeService;
import sfgpetclinic.model.services.VetServise;

import java.time.LocalDate;

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
        owner1.setAdrress("66 Bob Yuill");
        owner1.setCity("Myrom");
        owner1.setTelephone("1239089");

        Pet sashaPet=new Pet();
        sashaPet.setPetType(saveDogPetType);
        sashaPet.setOwner(owner1);
        sashaPet.setBirthDate(LocalDate.now());
        sashaPet.setName("Pufy");
        owner1.getPets().add(sashaPet);
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Yri");
        owner2.setLastName("Ury");
        owner2.setAdrress("66 Olev Hub");
        owner2.setCity("Pino");
        owner2.setTelephone("09839576");
        Pet YriPet=new Pet();
        YriPet.setPetType(saveCatPetType);
        YriPet.setOwner(owner2);
        YriPet.setBirthDate(LocalDate.now());
        YriPet.setName("Nomo");
        owner2.getPets().add(YriPet);
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
