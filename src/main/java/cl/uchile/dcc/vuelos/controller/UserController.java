package cl.uchile.dcc.vuelos.controller;

import cl.uchile.dcc.vuelos.dao.AeropuertoDAO;
import cl.uchile.dcc.vuelos.dao.UserDAO;
import cl.uchile.dcc.vuelos.model.Aeropuerto;
import cl.uchile.dcc.vuelos.model.User;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/user/")
    public List<User> obtenerUsuarios(){
        return UserDAO.obtenerUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{correo}")
    public User obtenerAeropuertoPorID(@PathVariable("correo") String correo){
        return UserDAO.obtenerUserPorCorreo(correo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/")
    public User agregarUsuario(@RequestBody User usuario){
        return UserDAO.agregarUser(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{correo}")
    public boolean borrarUsuario(@PathVariable("correo") String correo){
        return UserDAO.borrarUser(correo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/")
    public boolean modificarUsuario(@RequestBody User usuario){
        return UserDAO.modificar(usuario);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public User loginUsuario(@RequestBody User usuario){

        User usuarioBaseDatos = UserDAO.obtenerUserPorCorreo(usuario.getCorreo());
        if(usuarioBaseDatos != null){
            if (usuarioBaseDatos.getPassword().equals(usuario.getPassword())){
                return usuarioBaseDatos;
            }
        }
        throw new InvalidParameterException("El usuario no existe o la contraseña es invalida");
    }
}
