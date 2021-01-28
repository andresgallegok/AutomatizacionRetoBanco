package com.utest.prueba.certificacion.models;

public class Persona {

    String nombre;
    String apellido;
    String email;
    String mesNacimiento;
    String diaNacimiento;
    String anioNacimiento;
    String idioma;
    String sistemaOperativo;
    String versionSO;
    String idiomaSO;
    String clave;
    String confirmarClave;

    public Persona(String nombre, String apellido, String email, String mesNacimiento, String diaNacimiento, String anioNacimiento, String idioma, String sistemaOperativo, String versionSO, String idiomaSO, String clave, String confirmarClave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.idioma = idioma;
        this.sistemaOperativo = sistemaOperativo;
        this.versionSO = versionSO;
        this.idiomaSO = idiomaSO;
        this.clave = clave;
        this.confirmarClave = confirmarClave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public String getIdiomaSO() {
        return idiomaSO;
    }

    public String getClave() {
        return clave;
    }

    public String getConfirmarClave() {
        return confirmarClave;
    }
}
