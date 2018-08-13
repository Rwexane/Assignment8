package cput.ac.za.dogpound.domain;

import java.io.Serializable;
import java.util.List;

public class DogHealth implements Serializable{
    private Long healthID;
    private String condition;
    private String description;
    private List<Dog> dog;
    private List<Treatment> treatment;



    private DogHealth(Builder builder) {
        dog = builder.dog;
        condition = builder.condition;
        description = builder.description;
        healthID = builder.healthID;
        treatment = builder.treatment;

    }

    public static class Builder {

        String condition;
        String description;
        List<Dog> dog;
        List<Treatment> treatment;
        Long healthID;

        public Builder(){
        }

        public Builder condition(String condition){
            this.condition = condition;
            return this;
        }

        public Builder Treatment(List<Treatment> treatment) {
            this.treatment = treatment;
            return this;
        }

        public Builder id(Long value) {
            healthID = value;
            return this;
        }
        public Builder Description(String description) {
            this.description = description;
            return this;
        }

        public Builder dogs(List<Dog> dogs) {
            this.dog = dogs;
            return this;
        }


        public Builder dogHealth(DogHealth health) {
            dog = health.getDog();
            treatment = health.getTreatment();
            condition = health.getCondition();
            healthID = health.getHealthID();
            description = health.getDescription();
            return this;
        }

        public Builder copy(DogHealth val){
            this.condition = val.condition;
            this.description = val.description;
            this.healthID = val.healthID;
            return this;
        }

        public DogHealth build() {
            return new DogHealth(this);
        }

    }

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public Long getHealthID() {
        return healthID;
    }

    public List<Dog> getDog() {
        return dog;
    }

    public List<Treatment> getTreatment() {
        return treatment;
    }

}
