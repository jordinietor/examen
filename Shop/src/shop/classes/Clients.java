package shop.classes;

import java.time.LocalDate;

public class Clients {

    private String dni, nom, cognom, tlf, població;
    private LocalDate aniv;

    public Clients(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getPoblació() {
        return població;
    }

    public void setPoblació(String població) {
        this.població = població;
    }

    public LocalDate getAniv() {
        return aniv;
    }

    public void setAniv(LocalDate aniv) {
        this.aniv = aniv;
    }

    public void showClient(){
        System.out.println("DNI: " + this.getDni());
        System.out.println("Nom: " + this.getNom());
        System.out.println("Cognom: " + this.getCognom());
        System.out.println("Telefon: " + this.getTlf());
        System.out.println("Població: " + this.getPoblació());
    }

}