package controller;

import model.Person;
import service.impl.PersonService;

import java.util.ArrayList;

public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public String add(Person person) {
        if (personService.get(person.getId()) == null) {
            personService.add(person);
            return "Thêm mới thành công !";
        }
        return "Đã tồn tại !";
    }

    public ArrayList<Person> getAll() {
        return personService.getAll();
    }

    public String delete(String id) {
        if (personService.get(id) == null) {
            personService.delete(id);
            return "Xóa thành công !";
        }
        return "Không tồn tại !";

    }

    public String update(Person person) {
        if (personService.get(person.getId()) != null) {
            personService.update(person);
            return "Cập nhật thành công !";
        }
        return "Không tồn tại !";
    }

    public Person get(String id) {
        return personService.get(id);
    }
}
