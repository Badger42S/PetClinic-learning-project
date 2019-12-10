package sfgpetclinic.services.springjpadata;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.Reposirories.OwnerRepository;
import sfgpetclinic.model.Owner;
import sfgpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springJPA")
public class OwnerSDjpa implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerSDjpa(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners= new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner saveObject) {

        return ownerRepository.save(saveObject);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
