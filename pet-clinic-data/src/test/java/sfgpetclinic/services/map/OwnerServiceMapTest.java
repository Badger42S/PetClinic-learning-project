package sfgpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfgpetclinic.model.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    final Long ownerId=6L;
    final String lastName="Smith";
    @BeforeEach
    void setUp() {
        ownerServiceMap=new OwnerServiceMap(new PetTypeMap(),new PetServiceMap());
        Owner owner=new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners=ownerServiceMap.findAll();
        assertEquals(1L,owners.size());
    }

    @Test
    void findById() {
        Owner ownerToFind = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, ownerToFind.getId());
    }

    @Test
    void save() {
        ownerServiceMap.deleteById(ownerId);
        Owner saveOwner=new Owner();
        ownerServiceMap.save(saveOwner);
        assertNotNull(saveOwner.getId());
        assertNotEquals(ownerServiceMap.findAll().size(),0);
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(ownerServiceMap.findAll().size(),0);
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(ownerServiceMap.findAll().size(),0);
        assertNull(ownerServiceMap.findById(ownerId));
    }

    @Test
    void findByLastName() {
        Owner ownerToFind = ownerServiceMap.findById(ownerId);
        assertEquals(lastName, ownerToFind.getLastName());
    }
}