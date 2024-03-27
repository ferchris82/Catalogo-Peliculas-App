package servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import dominio.Pelicula;

public class ServicioPeliculasArchivo implements IServicioPeliculas{

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            // Si ya existe el archivo, No se vuelve a crear
            if(archivo.exists()){
                System.out.println("El archivo ya existe!");
            }else {
                // Si no existe, se crea vacío
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al abrir archivo: " + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {
        // volvemos a abrir el 
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        
    }

}
