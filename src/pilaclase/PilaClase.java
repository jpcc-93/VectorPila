/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaclase;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcc-
 */
public class PilaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        String menu = "1. llenar pila\n" +
        "2. preguntar si la pila esta vacia\n" +
        "3. preguntar si la pila esta llena\n" +
        "4. mostrar pila\n" +
        "5. Resize en nueva pila\n"
                +"0. salir"; 
        
        VectorPila vector1 = new VectorPila();
        
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                
                
                case 1:
                    vector1.llenar();
                    break;
                case 2:
                    boolean vacio = vector1.pilavacia();
                    if (vacio == false){
                        JOptionPane.showMessageDialog(null,"La pila tiene elementos");
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila no tiene elementos");
                    }
                    
                    break;
                    
                case 3:
                    
                    boolean lleno = vector1.Pilallena();
                    if (lleno == false){
                        JOptionPane.showMessageDialog(null,"La pila no esta llena");
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta llena");
                    }
                    break;
                    
                case 4:
                    vector1.mostrarpila();
                    break;
                    
                case 5:
                    break;
                
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 0: 
                    break;
            }
            
        
        }while(opcion != 0);
        
    }
    
}
