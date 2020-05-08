package cl.uchile.dcc.vuelos.dao;

import cl.uchile.dcc.vuelos.model.Aeropuerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockAeropuerto {

    private static List<Aeropuerto> listaAeropuertos = new ArrayList<Aeropuerto>(
            Arrays.asList(
                    new Aeropuerto(0,"scl","santiago","chile","scli","sclo"),
                    new Aeropuerto(1,"axm","Barranquilla","colombia","axmi","axmo"),
                    new Aeropuerto(2,"bog","bogota","colombia","bogi","bogo")
            )
    );

    public static List<Aeropuerto> listaAeropuertos(){
        return listaAeropuertos;
    }
}
