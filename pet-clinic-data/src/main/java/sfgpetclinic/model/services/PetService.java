package sfgpetclinic.model.services;

import sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById (Long Id);
    Set<Pet> findAll();
    Pet save (Pet owner);
}
