package cput.ac.za.dogpound.domain;

import java.io.Serializable;

public class Dog implements Serializable {
    private long id;
    private String breed;
    private String livingArea;
    private String name;


    public Dog() {

    }

    private Dog(Builder build) {
        this.breed = build.breed;
        this.livingArea = build.livingArea;
        this.name = build.name;
        this.id = build.id;
    }

    public long getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public String getlivingArea() {
        return livingArea;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private long id;
        private String breed;
        private String livingArea;
        private String name;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder livingArea(String livingArea) {
            this.livingArea = livingArea;
            return this;
        }

        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder dog(Dog dog) {
            name = dog.getName();
            breed = dog.getBreed();
            livingArea = dog.getlivingArea();
            id = dog.getId();
            return this;
        }

        public Builder copy(Dog value) {
            name = value.name;
            breed = value.breed;
            livingArea = value.livingArea;
            id = value.id;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }


    /*
    @Override
    public String toString()
    {
        return String.format("Id : %d\nName :%s\nSurname :%s\nAge :%s",id,name,surname,age);

    }

    */
}


