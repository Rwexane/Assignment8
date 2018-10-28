package cput.ac.za.dogpound.dogpound.repositories.treatmentRepoTest;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.Set;

import cput.ac.za.dogpound.repository.treatment.Impl.TreatmentRepositoryImpl;
import cput.ac.za.dogpound.repository.treatment.TreatmentRepository;

public class TreatmentTest extends AndroidTestCase {
    private static final String TAG="TREATMENT TEST";
    private Long id;
    // private Context getContext;

    public void testCreateReadUpdateDelete() throws Exception {
        TreatmentRepository repo = new TreatmentRepositoryImpl(this.getContext());
        // CREATE

        Treatment createEntity = new Treatment.Builder()
                 .treatmentNO(Long.parseLong("234324"))
                 .Instructions("One every evening")
                 .ExpiryDate("23/04/2017")
                 .build();
        Treatment insertedEntity = repo.save(createEntity);
        id=insertedEntity.getTreatmentNO();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Treatment> settings = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);

        //READ ENTITY
        Treatment entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);


        //UPDATE ENTITY
        Treatment updateEntity = new Treatment.Builder()
                .copy(entity)
                .treatmentNO(Long.parseLong("234324"))
                .build();
        repo.update(updateEntity);
        Treatment newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getTreatmentNO());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Treatment deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);

    }
}
