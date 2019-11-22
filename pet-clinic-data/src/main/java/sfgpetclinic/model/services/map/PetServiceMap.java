package sfgpetclinic.model.services.map;

import sfgpetclinic.model.Pet;
import sfgpetclinic.model.services.CrudService;
import sfgpetclinic.model.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet saveObject) {
        return super.save(saveObject.getId(),saveObject);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
