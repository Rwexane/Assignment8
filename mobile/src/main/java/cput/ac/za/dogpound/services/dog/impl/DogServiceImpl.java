//package cput.ac.za.dogpound.services.dog.impl;
//
//import java.util.List;
//
//import cput.ac.za.dogpound.domain.Dog;
//import cput.ac.za.dogpound.repository.rest.dog.DogRestAPI;
//import cput.ac.za.dogpound.repository.rest.dog.RestDog;
//import cput.ac.za.dogpound.services.dog.DogService;
//
//public class DogServiceImpl implements DogService {
//    final DogRestAPI<Dog,Long> rest = new RestDog();
//
//    @Override
//    public Dog findById(Long id) {
//        return rest.get(id);
//    }
//
//    @Override
//    public String save(Dog entity) {
//        return rest.post(entity);
//    }
//
//    @Override
//    public String update(Dog entity) {
//        return rest.put(entity);
//    }
//
//    @Override
//    public String delete(Dog entity) {
//
//        return rest.delete(entity);
//    }
//
//    @Override
//    public List<Dog> findAll() {
//        return rest.getAll();
//    }
//
//}
