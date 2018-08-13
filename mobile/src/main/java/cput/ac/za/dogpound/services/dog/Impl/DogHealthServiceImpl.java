package cput.ac.za.dogpound.services.dog.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.DogHealth;
import cput.ac.za.dogpound.repository.dog.DogHealthRepository;
import cput.ac.za.dogpound.repository.dog.Impl.DogHealthRepositoryImpl;
import cput.ac.za.dogpound.services.dog.DogHealthService;

public class DogHealthServiceImpl extends IntentService implements DogHealthService {
    /*I'm using intent service to implement my services because my services don't send or
return anything back to the user, they just saves data to the database*/
    private final DogHealthRepository repository;

    private static final String ACTION_ADD = " www.cput.za.dogpound.services.dog.Impl.ADD";
    private static final String ACTION_REMOVE = " www.cput.za.dogpound.services.dog.Impl.REMOVE";

    private static final String EXTRA_ADD = " www.cput.za.dogpound.services.dog.Impl.extra.ADD";


    private static DogHealthServiceImpl service = null;

    public static DogHealthServiceImpl getInstance() {
        if (service == null)
            service = new DogHealthServiceImpl();
        return service;
    }

     public DogHealthServiceImpl(){
        super("DogHealthServiceImpl");
        repository = new DogHealthRepositoryImpl(App.getAppContext());

    }

    @Override
    public void addHealth(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_ADD);
        context.startService(intent);
    }

    @Override
    public void removeHealth(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_REMOVE);
        context.startService(intent);

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final DogHealth health = (DogHealth) intent.getSerializableExtra(EXTRA_ADD);
                saveHealth(health);
            } else if (ACTION_REMOVE.equals(action)) {
                removeAll();
            }
        }
    }

    private void removeAll() {
        repository.deleteAll();
    }

    public void saveHealth(DogHealth aHealth) {
        DogHealth dogHealth = new DogHealth.Builder()
                 .condition(aHealth.getCondition())
                 .build();
        DogHealth savedDogHealth = repository.save(dogHealth);

    }
}
