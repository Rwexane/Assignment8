//package cput.ac.za.dogpound.services.Adoption.impl;
//
//import java.util.List;
//
//import cput.ac.za.dogpound.domain.Adoption;
//import cput.ac.za.dogpound.repository.rest.adoption.RestAdoption;
//import cput.ac.za.dogpound.services.Adoption.AdoptionService;
//
//public class AdoptionImpl implements AdoptionService {
//    final RestAdoption rest = new RestAdoption();
//
//    @Override
//    public Adoption findById(Long id) {
//        return rest.get(id);
//    }
//
//    @Override
//    public String save(Adoption entity) {
//        return rest.post(entity);
//    }
//
//    @Override
//    public String update(Adoption entity) {
//        return rest.put(entity);
//    }
//
//    @Override
//    public String delete(Adoption entity) {
//
//        return rest.delete(entity);
//    }
//
//    @Override
//    public List<Adoption> findAll() {
//        return rest.getAll();
//    }
//
//}

package cput.ac.za.dogpound.services.Adoption.impl;

import java.util.List;

import cput.ac.za.dogpound.domain.Adoption;
import cput.ac.za.dogpound.repository.rest.adoption.RestAPI;
import cput.ac.za.dogpound.repository.rest.adoption.RestAdoption;
import cput.ac.za.dogpound.services.Adoption.AdoptionService;

public class AdoptionImpl
        implements AdoptionService
{

    final RestAPI rest = new RestAdoption();

    public AdoptionImpl()
    {
    }

    public String delete(Adoption adoption)
    {
        return rest.delete(adoption);
    }

    public List findAll()
    {
        return rest.getAll();
    }

    public volatile Object findById(Object obj)
    {
        return findById((Long)obj);
    }

    public Adoption findById(Long long1)
    {
        return (Adoption)rest.get(long1);
    }

    public volatile String save(Object obj)
    {
        return save((Adoption)obj);
    }

    public String save(Adoption adoption)
    {
        return rest.post(adoption);
    }

    public String update(Adoption adoption)
    {
        return rest.put(adoption);
    }
}
