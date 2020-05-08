package cl.uchile.dcc.vuelos.dao;

import cl.uchile.dcc.vuelos.model.Aeropuerto;
import cl.uchile.dcc.vuelos.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockUser {

    private static List<User> listaUsuarios = new ArrayList<User>(
            Arrays.asList(
                    new User("usuario1@gmail.com","usuario1"),
                    new User("usuario2@gmail.com","usuario2"),
                    new User("usuario3@gmail.com","usuario2")
            )
    );

    public static List<User> listaUsuarios(){
        return listaUsuarios;
    }
}
