package sfgpetclinic.services.springjpadata;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.Reposirories.SpecialtyRepository;
import sfgpetclinic.model.Speciality;
import sfgpetclinic.services.SpecialitiesService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springJPA")
public class SpecialtySDjpaServ implements SpecialitiesService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDjpaServ(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities=new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality saveObject) {
        return specialtyRepository.save(saveObject);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
