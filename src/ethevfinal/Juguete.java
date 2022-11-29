/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ethevfinal;

/**
 *
 * @author Diego
 */
import java.io.Serializable;
public abstract class Juguete implements Serializable{
    
    private String marca, nombrejuguete, util;
    private int coleccion, peso, tiempo,  id;
    
    public Juguete(){
        
    }

    public Juguete(String marca, String nombrejuguete, String util, int id, int coleccion, int peso, int tiempo) {
        this.marca = marca;
        this.nombrejuguete = nombrejuguete;
        this.util = util;
        this.id = id;
        this.coleccion = coleccion;
        this.peso = peso;
        this.tiempo = tiempo;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombrejuguete() {
        return nombrejuguete;
    }

    public void setNombrejuguete(String nombrejuguete) {
        this.nombrejuguete = nombrejuguete;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public int getColeccion() {
        return coleccion;
    }

    public void setColeccion(int coleccion) {
        this.coleccion = coleccion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
    
}