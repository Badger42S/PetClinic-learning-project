package sfgpetclinic.services.springjpadata;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.Reposirories.PetTypeRepository;
import sfgpetclinic.model.PetType;
import sfgpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springJPA")
public class PetTypeSDjpaServ implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDjpaServ(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes=new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType saveObject) {
        return petTypeRepository.save(saveObject);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
