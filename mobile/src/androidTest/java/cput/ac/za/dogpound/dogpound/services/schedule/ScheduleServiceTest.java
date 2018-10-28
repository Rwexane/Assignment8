//package cput.ac.za.dogpound.dogpound.services.schedule;
//
//import android.test.AndroidTestCase;
//
//import cput.ac.za.dogpound.conf.App;
//import cput.ac.za.dogpound.domain.Schedule;
//import cput.ac.za.dogpound.services.schedule.Impl.ScheduleServiceImpl;
//
//public class ScheduleServiceTest extends AndroidTestCase {
//    private ScheduleServiceImpl scheduleService;
//
//    public void testSaveSchedule() throws Exception {
//
//        Schedule schedule = new Schedule.Builder()
//                .scheduleId(Long.parseLong("123213"))
//                .time("14:45")
//                .activity("To Adopt an dog")
//                .build();
//        scheduleService = new ScheduleServiceImpl();
//        scheduleService.addSchedule(App.getAppContext());
//        scheduleService.saveSchedule(schedule);
//        System.out.print("ScheduleSaved!!");
//    }
//}
