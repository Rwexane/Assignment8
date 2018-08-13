package cput.ac.za.dogpound.factories.dog;

import cput.ac.za.dogpound.domain.Dog;
import cput.ac.za.dogpound.domain.Schedule;

import java.util.List;

public class DogFactory {

    //singleton
   private static DogFactory instance=null;

    public DogFactory(){}

    public static DogFactory getInstance(){
        if (instance == null) {
            instance = new DogFactory();
        }
        return instance;
    }
    public static Dog createDog(
            Long dogId,
            List<Schedule> schedules,
            String breed)
    {
        return new Dog.Builder()
                .dogId(dogId)
                .breed(breed)
                .schedules(schedules)
                .build();
    }
}
