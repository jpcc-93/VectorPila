/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaclase;

import java.util.Random;

/**
 *
 * @author jpcc-
 */
public class VectorPila {
    
    int Tmax;
    int pila[];
    int tope;

    public VectorPila() {
        tope = -1;
        Tmax = 100;
        int[] pila = new int[Tmax];
    }
    
    public VectorPila(int Tmax) {
        tope = -1;
        this.Tmax = Tmax;
        int[] pila = new int[Tmax];
    }
    
    public void llenar(){
        while(tope != 100){
            Random aleatorio = new Random();
            int aux = aleatorio.nextInt(0,9);
            apilar(aux);
            System.out.println(aux);
        }
    }
    
    public boolean Pilallena(){
        if (Tmax -1 == tope){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean pilavacia(){
        if (tope == -1){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public int apilar(int dato){
        if (Pilallena()){
            return -1;
        }else{
            tope = tope +1;
            System.out.println(tope);
            pila[tope] = dato;
            
            return 1;
            
        }
    }
    
    
    public int desapilar(){
        if (pilavacia()){
            return -1;
        }else{
            int dato = pila[tope];
            tope =- 1;
            return dato;
        }
        
    }
    
    
    public VectorPila resize(){
        VectorPila lista = new VectorPila(Tmax +1);
        VectorPila aux = new VectorPila();
        while(tope != -1){
            aux.apilar(desapilar());
        }
        while(aux.getTope() != -1){
            lista.apilar(aux.desapilar());
        }
        return lista;
    
    }
    
    
    public int getTmax() {
        return Tmax;
    }

    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }

    public int[] getPila() {
        return pila;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
    
    
    
}
