/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_emilianourtecho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emili
 */
public class Carro {

    ArrayList<Jugador> jugadores;
    String Modelo;
    String Color; 
    double precio;
    String marca;
    List<String> mejorasVisuales;
    boolean Reconstruido;
    
    public Carro(String Modelo, String Color, double precio, String marca, List<String> mejorasVisuales, boolean Reconstruido){
        this.Modelo = Modelo;
        this.Color = Color;
        this.precio = precio;
        this.marca = marca;
        this.mejorasVisuales = mejorasVisuales;
        this.Reconstruido = Reconstruido;
    }
    
    
    //GETTERS
    
    public boolean getReconstruido(){
        return Reconstruido;
    }
    
    public String getModelo(){
        return Modelo;
    }
    public String getColor(){
        return Color;
    }
    public double getPrecio(){
        return precio;
    }
    public String getMarca(){
        return marca;
    }
    public List<String> getMejorasVisuales(){
        return mejorasVisuales;
    }
    public List<Carro> getCarros(String nombreJugador) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombreJugador)) {
                return jugador.getCarros();
            }
        }
        return null;
    }  
    
    
    //SETTERS
    public void setColor(String Color){
        this.Color = Color;
    }
    public void setPrecio(double Precio){
        this.precio = Precio;
    }
    public void setMejorasVisuales(List<String> mejorasVisuales){
        this.mejorasVisuales = mejorasVisuales;
    }    
}
