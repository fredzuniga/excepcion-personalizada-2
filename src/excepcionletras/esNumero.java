/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionletras;

/**
 *
 * @author osx
 */
class esNumero extends Exception{
    public esNumero(String mensaje){
        super(mensaje);
    }
    // getMensaje
    // static getInformacion()
}
/*
x = new esNumero(); --> BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in))
x.getMensaje();   ---> entrada.readLine()

esNumero.getInformacion   --->  Integer.parseInt();


*/
