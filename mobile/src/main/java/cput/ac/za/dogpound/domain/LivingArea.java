package cput.ac.za.dogpound.domain;

import java.io.Serializable;
import java.util.List;

public class LivingArea implements Serializable{
    private Long livingAreaId;
    private String name;
    private List<Dog> dogs;

    public LivingArea(Builder value)
    {
        this.livingAreaId = value.livingAreaId;
        this.dogs = value.dogs;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Long getLivingAreaId() {
        return livingAreaId;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        Long livingAreaId;
        String livingAreaName;
        List<Dog> dogs;

        public Builder() {
        }

        public Builder livingAreaName(String livingAreaName){
            this.livingAreaName = livingAreaName;
            return this;
        }

        public Builder livingAreaId(Long livingAreaId) {
            this.livingAreaId = livingAreaId;
            return this;
        }
        public Builder dogs(List<Dog> dogs) {
            this.dogs = dogs;
            return this;
        }


        public Builder copy(LivingArea value)
        {
            this.livingAreaId = value.livingAreaId;
            this.dogs = value.dogs;
            return this;
        }

        public LivingArea build()
        {
            return new LivingArea(this);
        }
    }
}
