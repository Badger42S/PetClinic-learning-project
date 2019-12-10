package sfgpetclinic.Reposirories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
