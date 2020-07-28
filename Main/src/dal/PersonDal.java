package dal;

import entities.Person;
import pattern.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonDal implements PersonRepository<Person> {

    List<Person> personList = new ArrayList<Person>();


    @Override
    public List<Person> listele() {
        return personList;
    }

    @Override
    public void add(Person name) {
        Person person = new Person();
        personList.add(person);
    }


    @Override
    public void delete(Person tc_no) {
        Person person = new Person();
        person.getTcno();
        personList.remove(person.getTcno());

    }

}
