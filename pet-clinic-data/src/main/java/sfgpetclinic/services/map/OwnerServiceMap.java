package sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Pet;
import sfgpetclinic.services.OwnerService;
import sfgpetclinic.services.PetService;
import sfgpetclinic.services.PetTypeService;

import java.util.List;
import java.util.Set;
@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner saveObject) {
        if(saveObject != null){
            if(saveObject.getPets() !=null){
                saveObject.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet type is required!");
                    }
                    if(pet.getId() == null){
                        Pet savedPet =petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(saveObject);
        }else{
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return null;
    }
}
