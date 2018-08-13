package cput.ac.za.dogpound.factories.dog;

import java.util.List;

import cput.ac.za.dogpound.domain.Dog;
import cput.ac.za.dogpound.domain.DogHealth;
import cput.ac.za.dogpound.domain.Treatment;

public class DogHealthFactory {

    //singleton
   private static DogHealthFactory instance=null;

    public DogHealthFactory(){}

    public static DogHealthFactory getInstance(){
        if (instance == null) {
            instance = new DogHealthFactory();
        }
        return instance;
    }

    public static DogHealth getHealth(String condition, String description, List<Dog> dog, List<Treatment> treatment)
    {
        DogHealth myHealth = new DogHealth
                .Builder()
                .condition(condition)
                .Description(description)
                .dogs(dog)
                .Treatment(treatment)
                .build();

        return myHealth;
    }





}

