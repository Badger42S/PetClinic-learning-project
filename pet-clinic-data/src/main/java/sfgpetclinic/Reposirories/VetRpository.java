package sfgpetclinic.Reposirories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinic.model.Vet;

public interface VetRpository extends CrudRepository<Vet,Long> {
}
