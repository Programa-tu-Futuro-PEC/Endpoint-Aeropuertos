package cl.uchile.dcc.vuelos.dao;

import cl.uchile.dcc.vuelos.model.User;

import java.security.InvalidParameterException;
import java.util.List;

public class UserDAO {

    static public List<User> obtenerUsers(){
        List<User> resultado = MockUser.listaUsuarios();
        return resultado;
    }

    static public User obtenerUserPorCorreo(String correo){

        List<User> resultado = MockUser.listaUsuarios();
        for(User user : resultado){
            if (user.getCorreo().equals(correo)){
                return user;
            }
        }
        return null;

    }

    public static User agregarUser(User usuario) {
        List<User> usuarios = MockUser.listaUsuarios();

        if(usuario.getCorreo() != null && !usuario.getCorreo().equals("")){
            if(obtenerUserPorCorreo(usuario.getCorreo()) == null) {
                MockUser.listaUsuarios().add(usuario);
            }else{
                throw new InvalidParameterException("Usuario ya existe");
            }
        }else{
            throw new InvalidParameterException("Correo no puede ser vacio");
        }

        return usuario;
    }

    public static boolean borrarUser(String correo) {
        return MockUser.listaUsuarios().remove(new User(correo));
    }

    public static boolean modificar(User a) {
        MockUser.listaUsuarios().remove(a);
        return MockUser.listaUsuarios().add(a);
    }
    
    
}
