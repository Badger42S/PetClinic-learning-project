package sfgpetclinic.model.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.model.Vet;
import sfgpetclinic.model.services.CrudService;
import sfgpetclinic.model.services.VetServise;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetServise {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet saveObject) {
        return super.save(saveObject);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
