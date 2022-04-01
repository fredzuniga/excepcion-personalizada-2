/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author osx
 */
public class ExcepcionLetras {

    /**
     * @param args the command line arguments
     */
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String letra;
        int salir = 0;
        do{
            System.out.println("Indica una letra");
            try {
                letra = entrada.readLine();
                if(esNumero(letra)){
                    throw new esNumero("Error,el valor es un número");
                }
                salir = 1;
            } catch (esNumero ex) {
                System.out.println("---> " + ex.getMessage());
                salir = 0;
            }catch (IOException ex) {

            }
        }while(salir == 0);
    }
    
    public static boolean esNumero(String letra){
        try{
            int validar_numero = Integer.parseInt(letra);
            // r -> numberFormatException
            // 4 -> se conviete a entero
        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
    
}
