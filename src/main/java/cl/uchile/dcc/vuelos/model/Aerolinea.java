package cl.uchile.dcc.vuelos.model;

public class Aerolinea {

    final private long id;
    final private String nombre;
    final private String iata;
    final private String icao;
    final private String pais;

    public Aerolinea(long id, String nombre, String iata, String icao, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.iata = iata;
        this.icao = icao;
        this.pais = pais;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }

    public String getPais() {
        return pais;
    }
}
