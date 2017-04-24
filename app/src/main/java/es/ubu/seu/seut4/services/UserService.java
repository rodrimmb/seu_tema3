package es.ubu.seu.seut4.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ubu.seu.seut4.model.User;

/**
 * Created by rodrigo on 23/04/17.
 */

public class UserService {

    private List<User> users = new ArrayList<User>();

    public UserService(){
        users.addAll(Arrays.asList(
                new User[]{
                    new User(1L, "Raul", "Marticorena Sanchez", "Profesor titular", "Universidad de Burgos"),
                    new User(2L, "Rodrigo", "Manjon Martin", "Profesor asociado", "TuLotero"),
                    new User(3L, "Alejandro", "Merino Gomez", "Profesor titular", "Universidad de Burgos")
                }
        ));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
