//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArchivoLectura {

    private Scanner in;
    private String linea;

    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de lectura, no se encuentra el archivo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()) {
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }

    public String linea() {
        return linea;
    }

    public void cerrar() {
        in.close();
    }

    public void lecturaDatos(Rotiseria modelo) {
        int opcion = 1; //Variable que avanza según el tipo de dato que se lee, 
                        //primero clientes, luego categorias y por ultimo productos
        this.hayMasLineas();
        while (opcion <= 3) {
            String[] veces = this.linea().split(";");  
            int numVeces = Integer.parseInt(veces[0]); //Cantidad de datos(lineas) que hay de ese tipo

            while (this.hayMasLineas() && numVeces > 0) {
                String[] datos = this.linea().split(";");
                switch (opcion) {   //Evaluamos cómo leer según el tipo de dato que estamos leyendo
                    case 1 ->
                        modelo.nuevoCliente(datos[0], datos[1], datos[2]);
                    case 2 -> {
                        int prioridad = Integer.parseInt(datos[2]);
                        modelo.nuevaCategoria(datos[0], prioridad, datos[1]);
                    }
                    default -> {
                        float precio = Float.parseFloat(datos[1]);
                        ArrayList<Categoria> categoria = new ArrayList();
                        for (int i = 2; i < datos.length; i++) {
                            categoria.add(modelo.buscarCategoria(datos[i]));
                        }
                        modelo.nuevoProducto(datos[0], precio, categoria);
                    }
                }
                numVeces--;
            }
            opcion++;
        }
    }
}
