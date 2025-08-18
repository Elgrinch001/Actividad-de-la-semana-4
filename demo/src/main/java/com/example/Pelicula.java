package com.example;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion; 
    private double presupuesto;
    private int anioEstreno;
    private boolean disponible;
    private String fechaRegistro;
    private String genero;


    public Pelicula() {
        this.titulo = "Sin título";
        this.director = "Desconocido";
        this.duracion = 90;
        this.presupuesto = 1000000;
        this.anioEstreno = 2000;
        this.disponible = true;
        this.fechaRegistro = "2000-01-01";
        this.genero = "General";
    }


    public Pelicula(String titulo, String director, int duracion, double presupuesto,
            int anioEstreno, boolean disponible, String fechaRegistro, String genero) {
        setTitulo(titulo);
        setDirector(director);
        setDuracion(duracion);
        setPresupuesto(presupuesto);
        setAnioEstreno(anioEstreno);
        setDisponible(disponible);
        setFechaRegistro(fechaRegistro);
        setGenero(genero);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            this.titulo = "Sin título";
        } else if (titulo.length() < 2) {
            this.titulo = "Título inválido";
        } else {
            this.titulo = titulo;
        }
        System.out.println("Título asignado: " + this.titulo);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director == null || director.length() < 3) {
            this.director = "Desconocido";
        } else {
            this.director = director;
        }
        System.out.println("Director asignado: " + this.director);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0) {
            this.duracion = 90;
        } else if (duracion > 300) {
            this.duracion = 180;
        } else {
            this.duracion = duracion;
        }
        System.out.println("Duración asignada: " + this.duracion + " minutos");
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        if (presupuesto < 1000) {
            this.presupuesto = 1000;
        } else if (presupuesto > 100000000) {
            this.presupuesto = 50000000;
        } else {
            this.presupuesto = presupuesto;
        }
        System.out.println("Presupuesto asignado: $" + this.presupuesto);
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        if (anioEstreno < 1900) {
            this.anioEstreno = 1900;
        } else if (anioEstreno > 2025) {
            this.anioEstreno = 2025;
        } else {
            this.anioEstreno = anioEstreno;
        }

        if (this.anioEstreno < 1950) {
            System.out.println("Es un clásico del cine.");
        } else if (this.anioEstreno < 2000) {
            System.out.println("Es una película del siglo XX.");
        } else {
            System.out.println("Película moderna.");
        }
        System.out.println("Año de estreno asignado: " + this.anioEstreno);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        if (this.disponible) {
            System.out.println("La película está disponible para ver.");
        } else {
            System.out.println("La película no está disponible actualmente.");
        }
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        if (fechaRegistro == null || fechaRegistro.isEmpty()) {
            this.fechaRegistro = "2000-01-01";
        } else {
            this.fechaRegistro = fechaRegistro;
        }
        System.out.println("Fecha de registro asignada: " + this.fechaRegistro);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()) {
            this.genero = "General";
        } else {
            this.genero = genero;
        }
        System.out.println("Género asignado: " + this.genero);
    }



    public String toString() {
        return "Pelicula{" + "titulo='" + titulo + '\'' + ", director='" + director + '\'' + ", duracion=" + duracion
                + ", presupuesto=" + presupuesto + ", anioEstreno=" + anioEstreno + ", disponible=" + disponible
                + ", fechaRegistro='" + fechaRegistro + '\'' + ", genero='" + genero + '\'' + '}';
    }
}