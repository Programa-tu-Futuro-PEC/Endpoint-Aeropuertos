package cl.uchile.dcc.vuelos.model;

public class Aeropuerto {

    final private long id;
    final private String nombre;
    final private String ciudad;
    final private String pais;
    final private String iata;
    final private String icao;

    public Aeropuerto(long id, String nombre, String ciudad, String pais, String iata, String icao) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.iata = iata;
        this.icao = icao;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }
}
