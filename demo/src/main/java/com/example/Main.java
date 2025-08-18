package com.example;

public class Main {
    public static void main(String[] args) {

        // --- LIBROS ---
        Libro libro1 = new Libro(); 
        Libro libro2 = new Libro("Cien años de soledad", "García Márquez", 417, 200.0, 1967, true, "2025-08-17","Realismo mágico");
        Libro libro3 = new Libro("El principito", "Saint-Exupéry", 96, 50.0, 1943, true, "2025-08-17", "Fábula"); 


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());

        // --- PELÍCULAS ---
        Pelicula pelicula1 = new Pelicula(); 
        Pelicula pelicula2 = new Pelicula("Titanic", "James Cameron", 195, 200000000, 1997, true, "2025-08-17","Romance/Drama");
        Pelicula pelicula3 = new Pelicula("Avatar", "James Cameron", 162, 237000000, 2009, true, "2025-08-17", "Ciencia ficción"); 

        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());
        System.out.println(pelicula3.toString());

        // --- ALUMNOS ---
        Alumno alumno1 = new Alumno(); 
        Alumno alumno2 = new Alumno("María Gómez", 22, "B5678", 7.8, 2021, false, "2025-08-17", "Medicina");
        Alumno alumno3 = new Alumno("Carlos Ruiz", 19, "C9012", 8.9, 2023, true, "2025-08-17", "Arquitectura"); 

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());

        // --- DEMOSTRACIÓN DE CAMBIO ---
        System.out.println("--- Cambios en atributos ---");
        libro1.setPrecio(1200);
        pelicula1.setDuracion(250);
        alumno2.setActivo(true);

        // Mostrar de nuevo con cambios
        System.out.println(libro1.toString());
        System.out.println(pelicula1.toString());
        System.out.println(alumno2.toString());
    }
}
