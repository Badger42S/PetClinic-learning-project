package sfgpetclinic.Reposirories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinic.model.Pet;

public interface PetReposytory extends CrudRepository<Pet,Long> {
}
