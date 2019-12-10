package sfgpetclinic.services.springjpadata;

import sfgpetclinic.Reposirories.VisitRepository;
import sfgpetclinic.model.Visit;
import sfgpetclinic.services.VisitServise;

import java.util.HashSet;
import java.util.Set;

public class VisitSDjpaServ implements VisitServise {
    private final VisitRepository visitRepository;

    public VisitSDjpaServ(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits=new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit saveObject) {
        return visitRepository.save(saveObject);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
