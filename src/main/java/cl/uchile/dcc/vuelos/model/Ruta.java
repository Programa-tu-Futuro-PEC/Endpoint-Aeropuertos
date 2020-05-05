package cl.uchile.dcc.vuelos.model;

public class Ruta {

    final private String aerolinea;
    final private String origen;
    final private String destino;

    public Ruta(String aerolinea, String origen, String destino) {
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
