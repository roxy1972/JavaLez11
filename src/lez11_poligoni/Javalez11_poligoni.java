/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez11_poligoni;

/**
 *esempi di classi astratte
 *queste servono quando gli oggetti sono vaghi come ad esempio i poligoni
 * nelle classi astratte NON SI PUO'creare istanza e PUO' contenere metodi astratti
 */
public class Javalez11_poligoni {

    public static void main(String[] args) {
        Quadrato quadrato= new Quadrato((10));
        System.out.println(quadrato);
        System.out.println("perimetro-> " + quadrato.perimetro());
        System.out.println("area-> " + quadrato.area());

    }
}


abstract class Poligono {

    private final int numeroLati;

    public Poligono(int lati) {
        this.numeroLati = lati;
    }

    public final int getNumeroLati() {
        return numeroLati;
    }

    @Override
    public String toString() {
        return "lati-> " + numeroLati;
    }

    public abstract long perimetro();

    public abstract double area();

}

class Quadrato extends Poligono {

    private final int lato;

    public Quadrato(int lato) {
        super(4);
        this.lato = lato;
    }

    @Override
    public long perimetro() {
        return lato * this.getNumeroLati();

    }

    @Override
    public double area() {
        return Math.pow(lato, 2);
    }
    
    @Override
    public String toString() {
        return String.format("sono un quadrato \n %s \n lato-> %s", super.toString(),this.lato);
    }
    
    

}
