//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package prueba;
import dominio.*;
import interfaz.*;

public class Main {

    public static void main(String[] args) {
        Rotiseria rot = new Rotiseria();
        VentanaMenuPpal v = new VentanaMenuPpal(rot);
        v.setVisible(true);
    }
    
}
