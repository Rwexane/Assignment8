//package cput.ac.za.dogpound.dogpound.repositories.dogRepoTest;
//
//import android.test.AndroidTestCase;
//
//import junit.framework.Assert;
//
//import java.util.Set;
//
//import cput.ac.za.dogpound.domain.DogRecord;
//import cput.ac.za.dogpound.repository.dog.DogRecordRepository;
//import cput.ac.za.dogpound.repository.dog.Impl.DogRecordRepoImpl;
//
//public class DogRecordTest extends AndroidTestCase{
//    private static final String TAG="SETTINGS TEST";
//    private Long id;
//    // private Context getContext;
//
//    public void testCreateReadUpdateDelete() throws Exception {
//        DogRecordRepository repo = new DogRecordRepoImpl(this.getContext());
//        // CREATE
//
//        DogRecord createEntity = new DogRecord.Builder()
//                .id(Long.parseLong("234324"))
//                .arrivalDate("12/04/2015")
//                .leavingDate("Dog")
//                .build();
//        DogRecord insertedEntity = repo.save(createEntity);
//        id=insertedEntity.getId();
//        Assert.assertNotNull(TAG+" CREATE",insertedEntity);
//
//        //READ ALL
//        Set<DogRecord> settings = repo.findAll();
//        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);
//
//        //READ ENTITY
//        DogRecord entity = repo.findById(id);
//        Assert.assertNotNull(TAG+" READ ENTITY",entity);
//
//
//
//        //UPDATE ENTITY
//        DogRecord updateEntity = new DogRecord.Builder()
//                .copy(entity)
//                .id(Long.parseLong("234324"))
//                .build();
//        repo.update(updateEntity);
//        DogRecord newEntity = repo.findById(id);
//        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getId());
//
//        // DELETE ENTITY
//        repo.delete(updateEntity);
//        DogRecord deletedEntity = repo.findById(id);
//        Assert.assertNull(TAG+" DELETE",deletedEntity);
//
//    }
//
//}
