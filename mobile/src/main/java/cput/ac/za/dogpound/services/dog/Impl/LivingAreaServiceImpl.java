package cput.ac.za.dogpound.services.dog.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.LivingArea;
import cput.ac.za.dogpound.repository.dog.Impl.LivingAreaRepositoryImpl;
import cput.ac.za.dogpound.repository.dog.LivingAreaRepository;
import cput.ac.za.dogpound.services.dog.LivingAreaService;

public class LivingAreaServiceImpl extends IntentService implements LivingAreaService {
    /*I'm using intent service to implement my services because my services don't send or
      return anything back to the user, they just saves data to the database*/

    private final LivingAreaRepository repository;

    private static final String ACTION_ADD = "www.cput.za.dogpound.services.Dog.LivingAreaService.ADD";
    private static final String ACTION_REMOVE = "www.cput.za.dogpound.services.Dog.LivingAreaServiceREMOVE";

    private static final String EXTRA_ADD = "zm.hashcode.hashdroidpvt.services.election.Impl.extra.ADD";

    private static LivingAreaServiceImpl service = null;

    public static LivingAreaServiceImpl getInstance() {
        if (service == null)
            service = new LivingAreaServiceImpl();
        return service;
    }

    public LivingAreaServiceImpl(){
        super("LivingAreaServiceImpl");
        repository = new LivingAreaRepositoryImpl(App.getAppContext());

    }

    @Override
    public void addLivingArea(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_ADD);
        context.startService(intent);
    }

    @Override
    public void removeLivingArea(Context context) {
        Intent intent = new Intent(context, DogRecordServiceImpl.class);
        intent.setAction(ACTION_REMOVE);
        context.startService(intent);

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final LivingArea livingArea = (LivingArea) intent.getSerializableExtra(EXTRA_ADD);
                saveLivingAra(livingArea);
            } else if (ACTION_REMOVE.equals(action)) {
                removeAll();
            }
        }
    }

    private void removeAll() {
        repository.deleteAll();
    }

   public void saveLivingAra(LivingArea lArea) {
        LivingArea livingArea = new LivingArea.Builder()
                .livingAreaId(lArea.getLivingAreaId())
                .livingAreaName(lArea.getName())
                .build();
        LivingArea savedDog = repository.save(livingArea);

    }
}
