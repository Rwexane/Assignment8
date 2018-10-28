package cput.ac.za.dogpound.repository.rest.adoption;

import java.util.List;

import cput.ac.za.dogpound.domain.Adoption;

public interface RestAPI<S, ID> {

    S get(ID id);

    String post(S entity);

    String put(Adoption entity);

    String delete(Adoption entity);
    List<S> getAll();
}

