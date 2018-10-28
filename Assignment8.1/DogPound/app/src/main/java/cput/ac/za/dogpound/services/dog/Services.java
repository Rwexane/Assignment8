/*
package cput.ac.za.dogpound.services.dog;

import java.util.List;

import cput.ac.za.dogpound.domain.Dog;

public interface Services<H, ID> {

    public H findById(ID id);

    public String save(H entity);

    public String update(Dog entity);

    public String delete(Dog entity); // Getter, GET implements Resource Support, Post Supports Entity model

    public List<H> findAll();

}*/

package cput.ac.za.dogpound.services.dog;

import java.util.List;

import cput.ac.za.dogpound.domain.Dog;

public interface Services
{

    public abstract String delete(Dog dog);

    public abstract List findAll();

    public abstract Object findById(Object obj);

    public abstract String save(Object obj);

    public abstract String update(Dog dog);
}
