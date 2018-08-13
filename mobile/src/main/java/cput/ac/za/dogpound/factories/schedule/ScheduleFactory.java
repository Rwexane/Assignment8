package cput.ac.za.dogpound.factories.schedule;

import cput.ac.za.dogpound.domain.*;

public class ScheduleFactory {

    //singleton
    private static ScheduleFactory instance=null;

    public ScheduleFactory(){}

    public static ScheduleFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleFactory();
        }
        return instance;
    }

    public static Schedule createSchedule(String activity,
                                          Long scheduleId,
                                          String time)
    {
        return new Schedule.Builder()
                .scheduleId(scheduleId)
                .activity(activity)
                .time(time)
                .build();
    }

}
