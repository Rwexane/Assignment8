//package cput.ac.za.dogpound.dogpound.repositories.customerRepoTest;
//
//import android.test.AndroidTestCase;
//import android.app.Application;
//import android.app.Instrumentation;
//import android.content.Context;
//
//import junit.framework.Assert;
//
//import java.util.Set;
//
//import cput.ac.za.dogpound.domain.Address;
//import cput.ac.za.dogpound.repository.customer.AddressRepository;
//import cput.ac.za.dogpound.repository.customer.Impl.AddressRepositoryImpl;
//
//public class AddressTest extends AndroidTestCase {
//    private static final String TAG="adress";
//    private Long id;
//    // private Context getContext;
//
//    public void testCreateReadUpdateDelete() throws Exception {
//        AddressRepository repo = new AddressRepositoryImpl(this.getContext());
//        // CREATE
//
//        Address createEntity = new Address.Builder()
//                .room("287")
//                .street("Watergang")
//                .surbub("Stellenbosch")
//                .zipCode("7600")
//                .build();
//       /* Address insertedEntity = repo.save(createEntity);
//        id=insertedEntity.getRoom();
//        Assert.assertNotNull(TAG+" CREATE",insertedEntity);*/
//
//        //READ ALL
//        Set<Address> settings = repo.findAll();
//        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);
//
//        //READ ENTITY
//        Address entity = repo.findById(id);
//        Assert.assertNotNull(TAG+" READ ENTITY",entity);
//
//
//
//        //UPDATE ENTITY
//        Address updateEntity = new Address.Builder()
//                .copy(entity)
//                .room(("287"))
//                .build();
//        repo.update(updateEntity);
//        Address newEntity = repo.findById(id);
//        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getRoom());
//
//        // DELETE ENTITY
//        repo.delete(updateEntity);
//        Address deletedEntity = repo.findById(id);
//        Assert.assertNull(TAG+" DELETE",deletedEntity);
//
//    }
//}
