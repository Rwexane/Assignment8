package cput.ac.za.dogpound.domain;

import java.io.Serializable;

public class Food implements Serializable{

    private String name;
    private String description;

    private Food(Builder build)
    {
        name = build.name;
        description = build.description;
    }
    private Food()
    {

    }

    public static class Builder{

        private String name;
        private String description;

        public Builder (String name)
        {
            this.name = name;

        }
        public Builder description(String descr)
        {
            this.description = descr;
            return this;
        }

        public Builder food(Food food)
        {
            this.description = food.description;
            this.name = food.name;
            return this;
        }
        public Food build()
        {
            return new Food(this);
        }

        public Builder copy(Food value)
        {
            this.name = value.name;
            this.description = value.description;
            return this;
        }


    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

}
