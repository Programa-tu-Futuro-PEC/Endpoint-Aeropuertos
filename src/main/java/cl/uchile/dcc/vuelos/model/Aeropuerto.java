package cl.uchile.dcc.vuelos.model;

import java.util.Objects;

public class Aeropuerto {

    private long id;
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

    public Aeropuerto(long id) {
        this.id=id;
        this.nombre = null;
        this.ciudad = null;
        this.pais = null;
        this.iata = null;
        this.icao = null;
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

    public void setId(long id) {
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aeropuerto)) return false;
        Aeropuerto that = (Aeropuerto) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
