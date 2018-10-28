//package cput.ac.za.dogpound.dogpound.repositories.customerRepoTest;
//
//import android.test.AndroidTestCase;
//
//import junit.framework.Assert;
//
//import java.util.Set;
//
//import cput.ac.za.dogpound.domain.Customer;
//import cput.ac.za.dogpound.repository.customer.CustomerRepository;
//import cput.ac.za.dogpound.repository.customer.Impl.CustomerRepositoryImpl;
//
//public class CustomerTest extends AndroidTestCase{
//    private static final String TAG="CUSTOMER TEST";
//    private Long id;
//    // private Context getContext;
//
//    public void testCreateReadUpdateDelete() throws Exception {
//        CustomerRepository repo = new CustomerRepositoryImpl(this.getContext());
//        // CREATE
//
//       Customer createEntity = new Customer.Builder()
//                .id(Long.parseLong("234324"))
//                .name("Bulelani")
//               .surname("Rwexane")
//               .build();
//       Customer insertedEntity = repo.save(createEntity);
//        id=insertedEntity.getId();
//        Assert.assertNotNull(TAG+" CREATE",insertedEntity);
//
//        //READ ALL
//        Set<Customer> settings = repo.findAll();
//        Assert.assertTrue(TAG+" READ ALL",settings.size()>0);
//
//        //READ ENTITY
//        Customer entity = repo.findById(id);
//        Assert.assertNotNull(TAG+" READ ENTITY",entity);
//
//
//
//        //UPDATE ENTITY
//          Customer updateEntity = new Customer.Builder()
//                .copy(entity)
//                .id(Long.parseLong("234324"))
//                .build();
//        repo.update(updateEntity);
//        Customer newEntity = repo.findById(id);
//        Assert.assertEquals(TAG+ " UPDATE ENTITY","234324",newEntity.getId());
//
//        // DELETE ENTITY
//        repo.delete(updateEntity);
//        Customer deletedEntity = repo.findById(id);
//        Assert.assertNull(TAG+" DELETE",deletedEntity);
//
//    }
//}
