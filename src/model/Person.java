package model;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthday;
    private String sex;
    protected String citizenId;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, LocalDate birthday, String sex, String citizenId, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.citizenId = citizenId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", birthday='" + birthday + '\'' +
//                ", sex='" + sex + '\'' +
//                ", citizenId='" + citizenId + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
