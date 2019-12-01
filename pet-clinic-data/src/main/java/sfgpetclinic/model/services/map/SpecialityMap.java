package sfgpetclinic.model.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.model.Speciality;
import sfgpetclinic.model.services.SpecialitiesService;

import java.util.Set;
@Service
public class SpecialityMap extends AbstractMapService<Speciality,Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality saveObject) {
        return super.save(saveObject);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
