package cput.ac.za.dogpound.domain;

import java.io.Serializable;

public class DogRecord implements Serializable {

    private Long id;
    private String arrivalDate;
    private String leavingDate;

    private DogRecord(Builder build) {
        this.id = build.id;
        this.arrivalDate = build.arrivalDate;
        this.leavingDate = build.leavingDate;
    }

    public static class Builder {
        private Long id;
        private String arrivalDate;
        private String leavingDate;

        public Builder id(Long id){
            this.id = id;
            return this;
        }
        public Builder arrivalDate(String arrivalDate) {
            this.arrivalDate = arrivalDate;
            return  this;
        }

        public Builder leavingDate(String leavingDate) {
            this.leavingDate = leavingDate;
            return this;
        }

        public Builder DogRecord(DogRecord record) {
            this.arrivalDate = record.getarrivalDate();
            this.leavingDate= record.getleavingDate();
            this.id = record.getId();
            return this;
        }

        public Builder copy(DogRecord value)
        {
            this.arrivalDate = value.arrivalDate;
            this.leavingDate = value.leavingDate;
            this.id = value.id;
            return this;
        }


        public DogRecord build() {
            return new DogRecord(this);
        }

        }
        public String getarrivalDate() {
        return arrivalDate;
    }

        public String getleavingDate() {
        return leavingDate;
    }

        public Long getId(){
            return id;
        }

}


