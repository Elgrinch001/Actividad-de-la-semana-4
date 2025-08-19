package com.example;

public class Alumno {

    private String nombre;
    private int edad;
    private String matricula;
    private double promedio;
    private int anioIngreso;
    private boolean activo;
    private String fechaRegistro;
    private String carrera;

   
    public Alumno() {
        this.nombre = "Sin nombre";
        this.edad = 18;
        this.matricula = "0000";
        this.promedio = 8.0;
        this.anioIngreso = 2020;
        this.activo = true;
        this.fechaRegistro = "2000-01-01";
        this.carrera = "General";
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            this.nombre = "Sin nombre";
        } else if (nombre.length() < 3) {
            this.nombre = "Nombre muy corto";
        } else {
            this.nombre = nombre;
        }
        System.out.println("Nombre asignado: " + this.nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 15) {
            this.edad = 15;
        } else if (edad > 100) {
            this.edad = 100;
        } else {
            this.edad = edad;
        }
        System.out.println("Edad asignada: " + this.edad);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null) {
            this.matricula = "0000";
        } else if (matricula.length() < 4) {
            this.matricula = "XXXX";
        } else {
            this.matricula = matricula;
        }
        System.out.println("Matrícula asignada: " + this.matricula);
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0) {
            this.promedio = 0;
        } else if (promedio > 10) {
            this.promedio = 10;
        } else {
            this.promedio = promedio;
        }

        if (this.promedio >= 9) {
            System.out.println("Alumno de excelencia.");
        } else if (this.promedio < 6) {
            System.out.println("Alumno reprobado.");
        } else {
            System.out.println("Alumno regular.");
        }
        System.out.println("Promedio asignado: " + this.promedio);
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        if (anioIngreso < 1980) {
            this.anioIngreso = 1980;
        } else if (anioIngreso > 2025) {
            this.anioIngreso = 2025;
        } else {
            this.anioIngreso = anioIngreso;
        }
        System.out.println("Año de ingreso asignado: " + this.anioIngreso);
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
        if (this.activo) {
            System.out.println("El alumno está activo.");
        } else {
            System.out.println("El alumno está dado de baja.");
        }
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        if (fechaRegistro == null) {
            this.fechaRegistro = "2000-01-01";
        } else {
            this.fechaRegistro = fechaRegistro;
        }
        System.out.println("Fecha de registro asignada: " + this.fechaRegistro);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera == null) {
            this.carrera = "General";
        } else {
            this.carrera = carrera;
        }
        System.out.println("Carrera asignada: " + this.carrera);
    }



    public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", matricula='" + matricula + '\''
                + ", promedio=" + promedio + ", anioIngreso=" + anioIngreso + ", activo=" + activo + ", fechaRegistro='"
                + fechaRegistro + '\'' + ", carrera='" + carrera + '\'' + '}';
    }
}
