package cl.uchile.dcc.vuelos.dao;

import cl.uchile.dcc.vuelos.model.Aeropuerto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AeropuertoDAO {

    static public List<Aeropuerto> obtenerAeropuertos(){
        List<Aeropuerto> resultado = MockAeropuerto.listaAeropuertos();
        return resultado;
       /*  try {
           Connection conn = ConnectionManager.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("select top 10 id, nombre, pais, ciudad, iata, icao from aeropuerto");
            List<Aeropuerto> resultado = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                long id = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String pais = rs.getString("pais");
                String ciudad = rs.getString("ciudad");
                String iata = rs.getString("iata");
                String icao = rs.getString("icao");
                Aeropuerto a = new Aeropuerto(id, nombre, ciudad, pais, iata, icao);
                resultado.add(a);
            }
            return resultado;
        } catch (SQLException e) {
            System.out.println("Error al consultar los aeropuertos");
            e.printStackTrace();
            return null;
        }*/
    }

    static public Aeropuerto obtenerAeropuertoPorID(long id){

        List<Aeropuerto> resultado = MockAeropuerto.listaAeropuertos();
        for(Aeropuerto aeropuerto : resultado){
            if (aeropuerto.getId() == id){
                return aeropuerto;
            }
        }
        return null;

      /*  try {
            Connection conn = ConnectionManager.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("select nombre, pais, ciudad, iata, icao from aeropuerto where id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String nombre = rs.getString("nombre");
            String pais = rs.getString("pais");
            String ciudad = rs.getString("ciudad");
            String iata = rs.getString("iata");
            String icao = rs.getString("icao");
            return new Aeropuerto(id, nombre, ciudad, pais, iata, icao);
        } catch (SQLException e) {
            System.out.println("Error al consultar el aeropuerto");
            return null;
        }*/
    }

}
