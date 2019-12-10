package sfgpetclinic.Reposirories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
