package cl.uchile.dcc.vuelos.controller;

import cl.uchile.dcc.vuelos.dao.AeropuertoDAO;
import cl.uchile.dcc.vuelos.model.Aeropuerto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AeropuertoController {

    @RequestMapping(method = RequestMethod.GET, value = "/aeropuerto/")
    public List<Aeropuerto> obtenerAeropuertos(){
        return AeropuertoDAO.obtenerAeropuertos();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/aeropuerto/{id}")
    public Aeropuerto obtenerAeropuertoPorID(@PathVariable("id") long id){
        return AeropuertoDAO.obtenerAeropuertoPorID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/aeropuerto/")
    public int agregarAeropuerto(@RequestBody Aeropuerto a){
        return AeropuertoDAO.agregarAeropuerto(a);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/aeropuerto/{id}")
    public boolean borrarAeropuerto(@PathVariable("id") long id){
        return AeropuertoDAO.borrarAeropuerto(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/aeropuerto/")
    public boolean modificarAeropuerto(@RequestBody Aeropuerto a){
        return AeropuertoDAO.modificar(a);
    }

}
