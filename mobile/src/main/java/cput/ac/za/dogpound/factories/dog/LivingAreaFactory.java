package cput.ac.za.dogpound.factories.dog;

import java.util.List;

import cput.ac.za.dogpound.domain.Dog;
import cput.ac.za.dogpound.domain.LivingArea;

public class LivingAreaFactory {

    //singleton
    private static LivingAreaFactory instance=null;

    public LivingAreaFactory(){}

    public static LivingAreaFactory getInstance(){
        if (instance == null) {
            instance = new LivingAreaFactory();
        }
        return instance;
    }
    public static LivingArea createLivingArea(Long livingAreaId,
                                              String leavingAreaName,
                                              List<Dog> dogs){
        return new LivingArea.Builder()
                .livingAreaId(livingAreaId)
                .livingAreaName(leavingAreaName)
                .dogs(dogs)
                .build();
    }
}
