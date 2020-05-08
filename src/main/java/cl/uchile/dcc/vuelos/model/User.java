package cl.uchile.dcc.vuelos.model;

import java.util.Objects;

public class User {
    private String correo;
    private String password;

    public User(String correo ) {
        this.correo = correo;
    }

    public User(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User that = (User) o;
        if(correo == null) return false;
        return correo.equals(that.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo);
    }
}
