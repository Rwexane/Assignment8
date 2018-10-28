package cput.ac.za.dogpound.rest.adoption;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import cput.ac.za.dogpound.domain.Adoption;

public class RestAdoption implements RestAPI<Adoption,Long> {

   final String BASE_URL = "http://localhost:8080/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    public Adoption get(Long id) {

        final String url = BASE_URL+"/adoptions/"+id.toString();

        HttpEntity<Adoption> requestEntity = new HttpEntity<>(requestHeaders);
        //restTemplate.getMessageConverters();
        ResponseEntity<Adoption> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Adoption.class);

        Adoption adoptions = responseEntity.getBody();

        return adoptions;
    }

    @Override
    public String post(Adoption entity) {

        final String url = BASE_URL+"adoption/create";
        HttpEntity<Adoption> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Adoption entity) {

        String id = Long.toString(entity.getId());

        final String url = BASE_URL+"adoption/update/"+id; //.toString()
        HttpEntity<Adoption> requestEntity = new HttpEntity<Adoption>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;

    }

    @Override
    public String delete(Adoption entity) {
        String id = Long.toString(entity.getId());
        final String url = BASE_URL+"adoption/delete/"+id;//.toString

        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);

        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Adoption> getAll() {

        List<Adoption> adoptions = new ArrayList<>();
        final String url = BASE_URL+"adoptions/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Adoption[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Adoption[].class);
        Adoption[] results = responseEntity.getBody();

        for (Adoption adoption : results) {
            adoptions.add(adoption);
        }
        return adoptions;

    }

}
