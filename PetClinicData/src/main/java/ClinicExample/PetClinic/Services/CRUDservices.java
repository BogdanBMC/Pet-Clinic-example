package ClinicExample.PetClinic.Services;

import java.util.Set;


//mimic spring crud repository
public interface CRUDservices<T, ID> {


    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);

}
