package cput.ac.za.dogpound.repository.rest.dog;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import cput.ac.za.dogpound.domain.Dog;

public class RestDog implements DogRestAPI<Dog, Long> {

    final String BASE_URL = "localhost:8090/";


    final HttpHeaders requestHeaders = DogRestMethods.getHeaders();
    final RestTemplate restTemplate = DogRestMethods.getRestTemplate();

    public Dog get(Long id) {

        final String url = BASE_URL+"packageproducts/" +id.toString();

        HttpEntity<Dog> requestEntity = new HttpEntity<>(requestHeaders);
        //restTemplate.getMessageConverters();
        ResponseEntity<Dog> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Dog.class);

        Dog dogs = responseEntity.getBody();

        return dogs;
    }

    @Override
    public String post(Dog entity) {

        final String url = BASE_URL+"Adoptions/create";
        HttpEntity<Dog> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Dog entity) {

        String id = Long.toString(entity.getId());

        final String url = BASE_URL+"Adoptions/update/"+id; //.toString()
        HttpEntity<Dog> requestEntity = new HttpEntity<Dog>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;

    }

    @Override
    public String delete(Dog entity) {
        String id = Long.toString(entity.getId());
        final String url = BASE_URL+"Adoptions/delete/"+id;//.toString

        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);

        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Dog> getAll() {

        List<Dog> adoptions = new ArrayList<>();
        final String url = BASE_URL+"adoptions/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Dog[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Dog[].class);
        Dog[] results = responseEntity.getBody();

        for (Dog dog : results) {
            adoptions.add(dog);
        }
        return adoptions;

    }

}
