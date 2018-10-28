package cput.ac.za.dogpound.factories.dog;

import cput.ac.za.dogpound.domain.Dog;

public class DogFactory {
    private long id;
    private String breed;
    private String name;
    private String livingArea;

    public static Dog getAdoption(long id, String breed, String livingArea, String name)
    {
        {
            Dog dog = new Dog.Builder()
                    .id(id)
                    .breed(breed)
                    .livingArea(livingArea)
                    .name(name)
                    .livingArea(livingArea)
                    .build();
            return dog;
        }
    }
}
