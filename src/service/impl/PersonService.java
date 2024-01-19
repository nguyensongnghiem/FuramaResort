package service.impl;

import model.Person;
import repository.IRepository;
import repository.impl.PersonRepository;
import service.IService;

import java.util.ArrayList;

public class PersonService implements IService<Person> {
    private IRepository<Person> personRepository;
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public ArrayList<Person> getAll() {
        return personRepository.getAll();
    }

    @Override
    public void add(Person person) {
        personRepository.add(person);
    }

    @Override
    public void delete(String id) {
        personRepository.delete(id);
    }

    @Override
    public void update(Person person) {
        personRepository.update(person);
    }

    @Override
    public Person get(String id) {
        return personRepository.get(id);
    }
}
