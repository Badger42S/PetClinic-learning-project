package sfgpetclinic.model.services;

import sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetServise {
    Vet findById (Long Id);
    Set<Vet> findAll();
    Vet save (Vet owner);
}
