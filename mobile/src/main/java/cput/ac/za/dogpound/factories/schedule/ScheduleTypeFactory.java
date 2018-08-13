package cput.ac.za.dogpound.factories.schedule;

import java.util.List;

import cput.ac.za.dogpound.domain.Schedule;
import cput.ac.za.dogpound.domain.ScheduleType;

public class ScheduleTypeFactory {

    //singleton
    private static ScheduleTypeFactory instance=null;

    public ScheduleTypeFactory(){}

    public static ScheduleTypeFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleTypeFactory();
        }
        return instance;
    }
    public static ScheduleType createScheduleType(
            String code,
            boolean active,
            List<Schedule> schedules)
    {
        return new ScheduleType.Builder(code)
                .active(active)
                .schedules(schedules)
                .build();
    }
}
