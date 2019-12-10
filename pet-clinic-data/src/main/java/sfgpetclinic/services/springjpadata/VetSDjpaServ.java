package sfgpetclinic.services.springjpadata;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.Reposirories.VetRpository;
import sfgpetclinic.model.Vet;
import sfgpetclinic.services.VetServise;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springJPA")
public class VetSDjpaServ implements VetServise {
    private final VetRpository vetRpository;

    public VetSDjpaServ(VetRpository vetRpository) {
        this.vetRpository = vetRpository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets=new HashSet<>();
        vetRpository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRpository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet saveObject) {
        return vetRpository.save(saveObject);
    }

    @Override
    public void delete(Vet object) {
        vetRpository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRpository.deleteById(aLong);
    }
}
