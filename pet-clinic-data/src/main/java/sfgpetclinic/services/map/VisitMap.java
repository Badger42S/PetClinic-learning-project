package sfgpetclinic.services.map;

import sfgpetclinic.model.Visit;
import sfgpetclinic.services.VisitServise;

import java.util.Set;

public class VisitMap extends AbstractMapService<Visit,Long>{
    private final VisitServise visitServise;

    public VisitMap(VisitServise visitServise) {
        this.visitServise = visitServise;
    }

    @Override
    Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner()==null || visit.getPet().getId()==null ||
                visit.getPet().getOwner().getId()==null){
            throw new RuntimeException("NULLLL");

        }
        return super.save(visit);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Visit object) {
        super.delete(object);
    }
}
