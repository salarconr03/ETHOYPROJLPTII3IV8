/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethevfinal;

import java.io.Serializable;
public abstract class Usuario implements Serializable{
    
    private String nombre;
    private String contrasena;
    private int alcaldia;
    private String correo;
    private int id;
    private String util;
    private int coleccion;

    public Usuario(){
        
    }

    public Usuario(String nombre, String contrasena, int alcaldia, String correo, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.alcaldia = alcaldia;
        this.correo = correo;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(int alcaldia) {
        this.alcaldia = alcaldia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}