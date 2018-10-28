//package cput.ac.za.dogpound.dogpound.repositories.dogRepoTest;
//
//import android.test.AndroidTestCase;
//
//import junit.framework.Assert;
//
//import java.util.Set;
//
//import cput.ac.za.dogpound.domain.DogHealth;
//import cput.ac.za.dogpound.repository.dog.DogHealthRepository;
//import cput.ac.za.dogpound.repository.dog.Impl.DogHealthRepositoryImpl;
//
//
//public class DogHealthTest {
//    private static final String TAG="SETTINGS TEST";
//    private Long id;
//    // private Context getContext;
//
//    public void testCreateReadUpdateDelete() throws Exception {
//        DogHealthRepository repo = new DogHealthRepositoryImpl(this.getContext());
//        // CREATE
//
//        DogHealth createEntity = new DogHealth.Builder()
//                .id(Long.parseLong("234324"))
//                .condition("Well")
//                .Description("N/A")
//                .build();
//        DogHealth insertedEntity = repo.save(createEntity);
//        id=insertedEntity.getHealthID();
//        Assert.assertNotNull(TAG+" CREATE",insertedEntity);
//
//        //READ ALL
//        Set<DogHealth> settings = repo.findAll();
//        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);
//
//        //READ ENTITY
//        DogHealth entity = repo.findById(id);
//        Assert.assertNotNull(TAG+" READ ENTITY",entity);
//
//
//
//        //UPDATE ENTITY
//        DogHealth updateEntity = new DogHealth.Builder()
//                .copy(entity)
//                .id(Long.parseLong("234324"))
//                .build();
//        repo.update(updateEntity);
//        DogHealth newEntity = repo.findById(id);
//        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getHealthID());
//
//        // DELETE ENTITY
//        repo.delete(updateEntity);
//        DogHealth deletedEntity = repo.findById(id);
//        Assert.assertNull(TAG+" DELETE",deletedEntity);
//
//    }
//}
