package cput.ac.za.dogpound.repository.rest.dog;

import java.util.List;

import cput.ac.za.dogpound.domain.Dog;

public interface DogRestAPI<S, ID> {

    S get(ID id);

    String post(S entity);

    String put(Dog entity);

    String delete(Dog entity);       //

        List<S> getAll();
}

