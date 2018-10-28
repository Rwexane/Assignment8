/*
package cput.ac.za.dogpound.domain;

import java.io.Serializable;
import java.util.Date;

public class Adoption implements Serializable{
    private Long adoptionId;
    private String comment;
    private Date adoptionDate;

    public Adoption(Builder value)
    {
        this.adoptionId = value.adoptionId;
        this.comment = value.comment;
        this.adoptionDate = value.adoptionDate;
    }

    public String getComment() {
        return comment;
    }

    public Long getAdoptionId() {
        return adoptionId;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public static class Builder{
        String comment;
        Long adoptionId;
        Date adoptionDate;

        public Builder() {

        }

        public Builder comment(String comment){
            this.comment = comment;
            return this;
        }

        public Builder adoptionId(Long adoptionId) {
            this.adoptionId = adoptionId;
            return this;
        }


        public Builder adoptionDate(Date adoptionDate) {
            this.adoptionDate = adoptionDate;
            return this;
        }

        public Builder copy(Adoption value)
        {
            this.adoptionId = value.adoptionId;
            this.comment = value.comment;
            this.adoptionDate = value.adoptionDate;
            return this;
        }

        public Adoption build(){
            return new Adoption(this);
        }
    }
}
*/
//package cput.ac.za.dogpound.domain;
//
//import java.io.Serializable;
//
//public class Adoption implements Serializable {
//
//    private long id;
//    private  String dogName;
//    private  String customerName;
//    private  String customerSurname;
//    private String phoneNumber;
//
//    public long getId() {
//        return id;
//    }
//
//    public String getDogName(){
//        return dogName;
//    }
//    public String getCustomerName(){
//        return customerName;
//    }
//    public String getCustomerSurname(){
//        return customerSurname;
//    }
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public Adoption()
//    {
//
//    }
//
//    public Adoption(Builder builder) {
//        id = builder.id;
//        dogName = builder.dogName;
//        customerName = builder.customerName;
//        customerSurname = builder.customerSurname;
//        phoneNumber = builder.phoneNumber;
//
//    }
//    public static class Builder {
//        //Equivalent to setters
//        private long id;
//        private String dogName;
//        private String customerName;
//        private String customerSurname;
//        private String phoneNumber;
//
//        public Builder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public Builder dogName(String dogName) {
//            this.dogName = dogName; //compulsary
//            return this;
//        }
//        public Builder customerName(String customerName) {
//            this.customerName = customerName;
//            return this;
//        }
//
//        public Builder customerSurname(String customerSurname) {
//            this.customerSurname = customerSurname;
//            return this;
//        }
//
//        public Builder phoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//
//        public Builder copy(Adoption adoption){
//            this.id = adoption.getId();
//            this.dogName = adoption.getDogName();
//            this.customerName = adoption.getCustomerName();
//            this.customerSurname = adoption.getCustomerSurname();
//            this.phoneNumber = adoption.phoneNumber;
//
//            return this;
//        }
//        public Adoption build() {
//            return new Adoption(this);
//        }
//    }
//
//    public String toString()
//    {
//        return String.format("Id : %d\ncustomerName :%s\ndogName :%s\ncustomerName :%s\ndate",id,customerName,customerSurname,phoneNumber);
//    }
//
//
//}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package cput.ac.za.dogpound.domain;

import java.io.Serializable;

public class Adoption
        implements Serializable
{
    public static class Builder
    {

        private String Dogname;
        private String customerName;
        private String customerSurname;
        private long id;
        private String phoneNumber;

        public Builder Dogname(String s)
        {
            Dogname = s;
            return this;
        }

        public Adoption build()
        {
            return new Adoption(this);
        }

        public Builder copy(Adoption adoption)
        {
            id = adoption.getId();
            Dogname = adoption.getDogname();
            customerName = adoption.getCustomerName();
            customerSurname = adoption.getCustomerSurname();
            phoneNumber = adoption.getPhoneNumber();
            return this;
        }

        public Builder customerName(String s)
        {
            customerName = s;
            return this;
        }

        public Builder customerSurname(String s)
        {
            customerSurname = s;
            return this;
        }

        public Builder id(Long long1)
        {
            id = long1.longValue();
            return this;
        }

        public Builder phoneNumber(String s)
        {
            phoneNumber = s;
            return this;
        }






        public Builder()
        {
        }
    }


    private String adoptername;
    private String adoptersurname;
    private String dogname;
    private long id;
    private String phonenumber;

    public Adoption()
    {
    }

    public Adoption(Builder builder)
    {
        id = builder.id;
        dogname = builder.Dogname;
        adoptername = builder.customerName;
        adoptersurname = builder.customerSurname;
        phonenumber = builder.phoneNumber;
    }

    public String getDogname()
    {
        return dogname;
    }

    public String getCustomerName()
    {
        return adoptername;
    }

    public String getCustomerSurname()
    {
        return adoptersurname;
    }

    public long getId()
    {
        return id;
    }

    public String getPhoneNumber()
    {
        return phonenumber;
    }

    public String toString()
    {
        return String.format("Id : %d\ncustomerName :%s\nDogname :%s\ncustomerName :%s\ndate", new Object[] {
                Long.valueOf(id), adoptername, adoptersurname, phonenumber
        });
    }
}

