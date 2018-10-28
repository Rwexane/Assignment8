//package cput.ac.za.dogpound.dogpound.repositories.dogRepoTest;
//
//import cput.ac.za.dogpound.domain.Dog;
//import cput.ac.za.dogpound.repository.dog.DogRepository;
//import cput.ac.za.dogpound.repository.dog.Impl.DogRepositoryImpl;
//import android.test.AndroidTestCase;
//import junit.framework.Assert;
//
//
//import java.util.Set;
//
//public class DogTest extends AndroidTestCase {
//    private static final String TAG="SETTINGS TEST";
//    private Long id;
//   // private Context getContext;
//
//    public void testCreateReadUpdateDelete() throws Exception {
//        DogRepository repo = new DogRepositoryImpl(this.getContext());
//        // CREATE
//
//         Dog createEntity = new Dog.Builder()
//                .dogId(Long.parseLong("234324"))
//                .breed("Dog")
//                .weight(324)
//                .build();
//        Dog insertedEntity = repo.save(createEntity);
//        id=insertedEntity.getDogId();
//        Assert.assertNotNull(TAG+" CREATE",insertedEntity);
//
//        //READ ALL
//        Set<Dog> settings = repo.findAll();
//        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);
//
//        //READ ENTITY
//        Dog entity = repo.findById(id);
//        Assert.assertNotNull(TAG+" READ ENTITY",entity);
//
//
//
//        //UPDATE ENTITY
//        Dog updateEntity = new Dog.Builder()
//                .copy(entity)
//                .dogId(Long.parseLong("234324"))
//                .build();
//        repo.update(updateEntity);
//        Dog newEntity = repo.findById(id);
//        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getDogId());
//
//        // DELETE ENTITY
//        repo.delete(updateEntity);
//        Dog deletedEntity = repo.findById(id);
//        Assert.assertNull(TAG+" DELETE",deletedEntity);
//
//    }
//
//}
