package repository.impl;

import model.Employee;
import model.IPersonFactory;
import model.Person;
import repository.IRepository;
import utils.FileIo;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;

public class PersonRepository implements IRepository<Person> {
    private final String filePath;
    private IPersonFactory factory;

    public PersonRepository(String filePath, IPersonFactory factory) {
        this.filePath = filePath;
        this.factory = factory;
    }
    @Override
    public Person get(String id) {
        ArrayList<Person> list = getAll();
        for (Person e : list) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Person> getAll() {
        ArrayList<Person> personList = new ArrayList<>();
        FileIo fileIo = new FileIo(filePath);
        ArrayList<String> list = fileIo.readList();
        for (String line : list) {
            if (!line.isEmpty()) {
                personList.add(factory.createPerson(line.split(";")));
            }
        }
        return personList;
    }

    @Override
    public void add(Person person) {
        FileIo fileIo = new FileIo(filePath);
        if (get(person.getId())==null) {
            fileIo.writeLine(person.toCsvLine(), true);
        }
    }
    @Override
    public void delete(String id) {
        FileIo fileIo = new FileIo(filePath);
        ArrayList<Person> list = getAll();
        Person p = get(id);
        if (p!=null) {
            list.remove(p);
        }
        fileIo.writeList(listToCsv(list),false);

    }

    @Override
    public void update(Person person) {
        FileIo fileIo = new FileIo(filePath);

        ArrayList<Person> list = getAll();
        for (int i = 0; i < list.size(); i++)  {
            if (list.get(i).getId().equals(person.getId())) {
                list.set(i,person);
            }
        }
        fileIo.writeList(listToCsv(list),false);

    }

    @Override
    public ArrayList<String> listToCsv(ArrayList<Person> list) {
        ArrayList<String> csvList =new ArrayList<>() ;
        for (Person person : list) {
            csvList.add(person.toCsvLine());
        }
        return  csvList;
    }






}


