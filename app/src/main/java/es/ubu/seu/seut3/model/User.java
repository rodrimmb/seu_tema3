package es.ubu.seu.seut3.model;

/**
 * Created by rodrigo on 23/04/17.
 */

public class User {
    private Long id;
    private String name;
    private String surname;
    private String position;
    private String company;

    public User(Long id, String name, String surname, String position, String company){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
