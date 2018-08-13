package cput.ac.za.dogpound.services.dog.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.DogRecord;
import cput.ac.za.dogpound.repository.dog.DogRecordRepository;
import cput.ac.za.dogpound.repository.dog.Impl.DogRecordRepoImpl;
import cput.ac.za.dogpound.services.dog.DogRecordService;

public class DogRecordServiceImpl extends IntentService implements DogRecordService {
    /*I'm using intent service to implement my services because my services don't send or
return anything back to the user, they just saves data to the database*/
    private final DogRecordRepository repository;

    private static final String ACTION_ADD = "ADD";
    private static final String ACTION_REMOVE = "REMOVE";

    private static final String EXTRA_ADD = "zm.hashcode.hashdroidpvt.services.election.Impl.extra.ADD";

    private static DogRecordServiceImpl service = null;

    public static DogRecordServiceImpl getInstance() {
        if (service == null)
            service = new DogRecordServiceImpl();
        return service;
    }

    public DogRecordServiceImpl() {
        super("DogRecordServiceImpl");
        repository = new DogRecordRepoImpl(App.getAppContext());

    }

    @Override
    public void addDog(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_ADD);
        context.startService(intent);
    }

    @Override
    public void removeDog(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_REMOVE);
        context.startService(intent);

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final DogRecord dogRecord = (DogRecord) intent.getSerializableExtra(EXTRA_ADD);
                saveDog(dogRecord);
            } else if (ACTION_REMOVE.equals(action)) {
                removeAll();
            }
        }
    }

    private void removeAll() {
        repository.deleteAll();
    }

    public void saveDog(DogRecord dog) {
                 DogRecord animl = new DogRecord.Builder()
                 .id(dog.getId())
                 .arrivalDate(dog.getarrivalDate())
                 .leavingDate(dog.getleavingDate())
                 .build();
        DogRecord savedDog = repository.save(animl);

    }

}
