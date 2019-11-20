package sfgpetclinic.model.services;

import sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName (String lastName);
    Owner findById (Long Id);
    Set<Owner> findAll();
    Owner save (Owner owner);
}
