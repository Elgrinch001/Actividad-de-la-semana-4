package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;
    private double precio;
    private int anioPublicacion;
    private boolean disponible;
    private String fechaRegistro;
    private String generos;


    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 100;
        this.precio = 20.0;
        this.anioPublicacion = 2000;
        this.disponible = true;
        this.fechaRegistro = "2000-01-01";
        this.generos = "General";
    }


    public Libro(String titulo, String autor, int paginas, double precio, int anioPublicacion, boolean disponible,
            String fechaRegistro, String generos) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        setPrecio(precio);
        setAnioPublicacion(anioPublicacion);
        setDisponible(disponible);
        setFechaRegistro(fechaRegistro);
        setGeneros(generos);
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null) {
            this.titulo = "Desconocido";
        } else if (titulo.length() < 3) {
            this.titulo = "Titulo muy corto";
        } else if (titulo.length() > 30) {
            this.titulo = "Titulo demasiado largo";
        } else {
            this.titulo = titulo;
        }
        System.out.println("Titulo asignado: " + this.titulo);
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        if (autor == null) {
            this.autor = "Anonimo";
        } else if (autor.length() <= 2) {
            this.autor = "AutorX";
        } else if (autor.length() > 20) {
            this.autor = "Nombre invalido";
        } else {
            this.autor = autor;
        }
        System.out.println("Autor asignado: " + this.autor);
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0 && paginas < 2000) {
            this.paginas = paginas;
        } else if (paginas <= 0) {
            this.paginas = 100;
        } else if (paginas % 2 == 0) { 
            this.paginas = 500;
        } else {
            this.paginas = 300;
        }
        System.out.println("Paginas asignadas: " + this.paginas);
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0 && precio <= 1000) {
            this.precio = precio;
        } else if (precio <= 0) {
            this.precio = 20.0;
        } else if (precio > 1000 && precio < 2000) {
            this.precio = 999.9;
        } else {
            this.precio = 100.0;
        }

        if (this.precio < 30 && this.paginas > 500) {
            this.precio = this.precio + 10;
        }
        System.out.println("Precio asignado: " + this.precio);
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1500 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else if (anioPublicacion <= 1500) {
            this.anioPublicacion = 1501;
        } else if (anioPublicacion > 2025 && anioPublicacion < 3000) {
            this.anioPublicacion = 2025;
        } else {
            this.anioPublicacion = 2000;
        }

    
        if (this.anioPublicacion < 1900) {
            System.out.println("Este libro es muy antiguo.");
        } else if (this.anioPublicacion >= 1900 && this.anioPublicacion < 2000) {
            System.out.println("Este libro es del siglo XX.");
        } else {
            System.out.println("Este libro es moderno.");
        }

        System.out.println("Año de publicacion asignado: " + this.anioPublicacion);
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        if (this.disponible == true) {
            if (this.precio > 500 || this.paginas > 1000) {
                System.out.println("El libro está disponible, pero es raro encontrarlo.");
            } else {
                System.out.println("El libro está disponible.");
            }
        } else if (this.disponible == false) {
            if (this.anioPublicacion < 1900) {
                System.out.println("El libro no está disponible porque es muy antiguo.");
            } else {
                System.out.println("El libro no está disponible actualmente.");
            }
        }
    }

    public String getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        if (fechaRegistro == null || fechaRegistro.isEmpty()) {
            this.fechaRegistro = "2000-01-01";
        } else {
            this.fechaRegistro = fechaRegistro;
        }
        System.out.println("Fecha de registro asignada: " + this.fechaRegistro);
    }

    public String getGeneros() {
        return this.generos;
    }

    public void setGeneros(String generos) {
        if (generos == null || generos.isEmpty()) {
            this.generos = "General";
        } else {
            this.generos = generos;
        }
        System.out.println("Género asignado: " + this.generos);
    }

   
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", paginas=" + paginas + ", precio="
                + precio + ", anioPublicacion=" + anioPublicacion + ", disponible=" + disponible + ", fechaRegistro="
                + fechaRegistro + ", generos='" + generos + '\'' + '}';
    }
}
