/*
package cput.ac.za.dogpound.services.Adoption;

import java.util.List;

import cput.ac.za.dogpound.domain.Adoption;

public interface Services<H, ID> {

    public H findById(ID id);

    public String save(H entity);

    public String update(Adoption entity);

    public String delete(Adoption entity); // Getter, GET implements Resource Support, Post Supports Entity model

    public List<H> findAll();

}*/

package cput.ac.za.dogpound.services.Adoption;

import java.util.List;

import cput.ac.za.dogpound.domain.Adoption;


public interface Services {

    public abstract String delete(Adoption adoption);

    public abstract List findAll();

    public abstract Object findById(Object obj);

    public abstract String save(Object obj);

    public abstract String update(Adoption adoption);
}
