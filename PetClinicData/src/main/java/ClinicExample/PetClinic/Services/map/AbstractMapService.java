package ClinicExample.PetClinic.Services.map;

import ClinicExample.PetClinic.Model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get((id));
    }

    T save(T object){

        if (object != null){
            if(object.getId()==null){
                object.setId(getNextId());
            }
            else throw new RuntimeException("object cannot be null");
            map.put(object.getId(), object);


        }


        return object;
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void deleteByObject(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }


    private long getNextId(){

        Long nextId=null;

        try {
            nextId = Collections.max(map.keySet()) +1;
        }
            catch (NoSuchElementException e){
                nextId =1L;
            }

        return nextId;
    }

}
