package sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinic.model.Visit;
import sfgpetclinic.services.VisitServise;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VisitMap extends AbstractMapService<Visit,Long> implements VisitServise{

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner()==null || visit.getPet().getId()==null ||
                visit.getPet().getOwner().getId()==null){
            throw new RuntimeException("NULLLL");

        }
        return super.save(visit);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
