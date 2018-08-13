package cput.ac.za.dogpound.services.schedule.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.Schedule;
import cput.ac.za.dogpound.repository.schedule.ScheduleRepository;
import cput.ac.za.dogpound.repository.schedule.impl.ScheduleRepositoryImpl;
import cput.ac.za.dogpound.services.customer.Impl.CustomerServiceImpl;
import cput.ac.za.dogpound.services.schedule.ScheduleIService;

public class ScheduleServiceImpl extends IntentService implements ScheduleIService {
    /*I'm using intent service to implement my services because my services don't send or
return anything back to the user, they just saves data to the database*/
    private final ScheduleRepository repository;

    private static final String ACTION_ADD = "package www.cput.za.animalpound.services.schedule.Impl.ADD";
    private static final String ACTION_REMOVE = "package www.cput.za.animalpound.services.schedule.Impl.REMOVE";

    private static final String EXTRA_ADD = "package www.cput.za.animalpound.services.schedule.Impl.ADD";

    private static ScheduleServiceImpl service = null;

    public static ScheduleServiceImpl getInstance() {
        if (service == null)
            service = new ScheduleServiceImpl();
        return service;
    }

    public ScheduleServiceImpl() {
        super("ScheduleServiceImpl");
        repository = new ScheduleRepositoryImpl(App.getAppContext());

    }

    @Override
    public void addSchedule(Context context) {
        Intent intent = new Intent(context, ScheduleServiceImpl.class);
        intent.setAction(ACTION_ADD);
        context.startService(intent);
    }

    @Override
    public void removeSchedule(Context context) {
        Intent intent = new Intent(context, CustomerServiceImpl.class);
        intent.setAction(ACTION_REMOVE);
        context.startService(intent);

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final Schedule schedule = (Schedule) intent.getSerializableExtra(EXTRA_ADD);
                saveSchedule(schedule);
            } else if (ACTION_REMOVE.equals(action)) {
                removeAll();
            }
        }
    }

    private void removeAll() {
        repository.deleteAll();
    }

    public void saveSchedule(Schedule schedule) {
        Schedule schdl = new Schedule.Builder()
                .scheduleId(schedule.getScheduleId())
                .activity(schedule.getActivity())
                .time(schedule.getTime())
                .build();
        Schedule savedSchedule = repository.save(schdl);

    }

}
