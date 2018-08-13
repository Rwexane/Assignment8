package cput.ac.za.dogpound.dogpound.repositories.schedule;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.Set;

import cput.ac.za.dogpound.domain.Schedule;
import cput.ac.za.dogpound.repository.schedule.ScheduleRepository;
import cput.ac.za.dogpound.repository.schedule.impl.ScheduleRepositoryImpl;

public class ScheduleTest extends AndroidTestCase{
    private static final String TAG="SETTINGS TEST";
    private Long id;
    // private Context getContext;

    public void testCreateReadUpdateDelete() throws Exception {
        ScheduleRepository repo = new ScheduleRepositoryImpl(this.getContext());
        // CREATE

        Schedule createEntity = new Schedule.Builder()
                .scheduleId(Long.parseLong("54324"))
                .time("evening")
                .activity("to Adopt an Dog")
                .build();
        Schedule insertedEntity = repo.save(createEntity);
        id = insertedEntity.getScheduleId();
        Assert.assertNotNull(TAG + " CREATE", insertedEntity);

        //READ ALL
        Set<Schedule> settings = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", settings.size() > 0);

        //READ ENTITY
        Schedule entity = repo.findById(id);
        Assert.assertNotNull(TAG + " READ ENTITY", entity);


        //UPDATE ENTITY
        Schedule updateEntity = new Schedule.Builder()
                .copy(entity)
                .scheduleId(Long.parseLong("54324"))
                .build();
        repo.update(updateEntity);
        Schedule newEntity = repo.findById(id);
        Assert.assertEquals(TAG + " UPDATE ENTITY", "54324", newEntity.getScheduleId());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Schedule deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + " DELETE", deletedEntity);
    }
}
