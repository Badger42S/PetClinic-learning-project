package sfgpetclinic.model.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.model.PetType;
import sfgpetclinic.model.services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType saveObject) {
        return super.save(saveObject);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
