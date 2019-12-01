package sfgpetclinic.model.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.model.Speciality;
import sfgpetclinic.model.Vet;
import sfgpetclinic.model.services.SpecialitiesService;
import sfgpetclinic.model.services.VetServise;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetServise {
    private final SpecialitiesService specialitiesService;

    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

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
        if(saveObject.getSpecialities().size()>0){
            saveObject.getSpecialities().forEach(specialty->{
                if(specialty.getId() == null){
                    Speciality saveSpecialty = specialitiesService.save(specialty);
                    specialty.setId(saveSpecialty.getId());
                }
            });
        }
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
