/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaclase;

import java.util.Random;
import javax.swing.JOptionPane;

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
        this.pila = new int[Tmax];
    }
    
    public VectorPila(int Tmax) {
        tope = -1;
        this.Tmax = Tmax;
        this.pila = new int[Tmax];
    }
    
    public void mostrarpila(){
        int muestra;
        String datos = "";
        VectorPila aux = new VectorPila();
        while(tope != -1){
            muestra = desapilar();
            aux.apilar(muestra);
            
        }
            System.out.println("tope propio"+this.tope);
            System.out.println("tope auxiliar"+aux.getTope());
        
        while(aux.getTope() != -1){
            apilar(aux.desapilar());
            System.out.println(getPila());
            System.out.println(this.tope);
            System.out.println(aux.getTope());
            muestra = getPila();
            datos = datos + "\t" + String.valueOf(muestra);
            //System.out.println("dato :"+datos);
        }
        //System.out.println(datos);
        JOptionPane.showMessageDialog(null,datos);
        
    }
    
    public void llenar(){
        while(tope != 99){
            Random aleatorio = new Random();
            int aux = aleatorio.nextInt(0,9);
            apilar(aux);
            //System.out.println(aux);
        }
        System.out.println(this.tope);
            
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
            //System.out.println(tope);
            pila[tope] = dato;
            
            return 1;
            
        }
    }
    
    
    public int desapilar(){
        if (pilavacia()){
            return -1;
        }else{
            int dato = pila[tope];
            tope =  tope - 1;
            return dato;
        }
        
    }
    
    
    public VectorPila resize(int dato){
        VectorPila lista = new VectorPila(Tmax +1);
        VectorPila aux = new VectorPila();
        while(tope != -1){
            aux.apilar(desapilar());
        }
        while(aux.getTope() != -1){
            lista.apilar(aux.desapilar());
        }
        lista.apilar(dato);
        
        return lista;
    
    }
    
    
    public int getTmax() {
        return Tmax;
    }

    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }

    public int getPila() {
        return pila[this.tope];
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
