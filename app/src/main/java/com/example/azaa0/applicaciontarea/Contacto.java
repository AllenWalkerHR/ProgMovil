package com.example.azaa0.applicaciontarea;

import java.io.Serializable;

/**
 * Created by azaa0 on 06/09/2017.
 */
@SuppressWarnings("serial")
public class Contacto implements Serializable{
    private String usuario;
    private String twitter;
    private String email;
    private String phone;
    private String fechaNac;

    public Contacto(String usuario, String twitter, String email, String phone, String fechaNac) {
        this.usuario = usuario;
        this.twitter = twitter;
        this.email = email;
        this.phone = phone;
        this.fechaNac = fechaNac;
    }

    public Contacto(){

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
