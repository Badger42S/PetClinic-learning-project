package sfgpetclinic.services.springjpadata;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.Reposirories.PetReposytory;
import sfgpetclinic.model.Pet;
import sfgpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springJPA")
public class PetSDjpaServ implements PetService {
    private final PetReposytory petReposytory;

    public PetSDjpaServ(PetReposytory petReposytory) {
        this.petReposytory = petReposytory;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets=new HashSet<>();
        petReposytory.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petReposytory.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet saveObject) {
        return petReposytory.save(saveObject);
    }

    @Override
    public void delete(Pet object) {
        petReposytory.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petReposytory.deleteById(aLong);
    }
}
