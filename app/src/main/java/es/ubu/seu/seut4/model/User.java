package es.ubu.seu.seut4.model;

/**
 * Created by rodrigo on 23/04/17.
 */

public class User {
    private Long id;
    private String name;
    private String surname;
    private String position;

    public User(Long id, String name, String surname, String position){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
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
}
