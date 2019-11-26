package sfgpetclinic.model.services.map;

import sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntity, ID extends Long>{
    private Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById (ID id){
        return map.get(id);
    }
    T save (T object){
        if(object !=null){
            if(object.getId() == null){
                object.setId(nextId());
            }
            map.put( object.getId(),object);
        } else {
            throw new RuntimeException("Object is null");
        }
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete (T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
    private Long nextId(){
        Long getNextId;
        if(map.isEmpty()){
            getNextId=1L;
        } else{
            getNextId=Collections.max(map.keySet())+1;
        }
        return getNextId;
    }
}
