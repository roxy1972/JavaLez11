/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        
        /*
        ............ARRAYS........
        */
        System.out.println(".............ordinamento Arrays.............");
        Persona[] persone = {new Persona("mario", "rossi"),
            new Persona("marco", "bianchi"),
            new Persona("giuseppe", "verdi")};

        System.out.println(Arrays.toString(persone));
        Arrays.sort(persone);
        
        
        System.out.println(Arrays.toString(persone));

        System.out.println("....................................");

        Moto[] motos = {new Moto(1000),
            new Moto(500),
            new Moto(750)};

        System.out.println(Arrays.toString(motos));
        Arrays.sort(motos);
        
        System.out.println(Arrays.toString(motos));
        
               
        /*
        ........LISTE............
        */
        
        System.out.println(".............ordinamento Liste.............");
        List<Persona> listPersone=Arrays.asList(new Persona("mario", "rossi"),
            new Persona("marco", "bianchi"),
            new Persona("giuseppe", "verdi"));
        
        Collections.sort(listPersone);
        
        System.out.println(listPersone);
        
        
        /*
        ........STREAM............
        */
        System.out.println(".............ordinamento Stream.............");
        Stream.of(new Persona("mario", "rossi"),
            new Persona("marco", "bianchi"),
            new Persona("giuseppe", "verdi"))
                .sorted()
                .forEach(p->System.out.println(p.toString()));

    }

}

class Moto implements Comparable<Moto> {

    private final int cilindrata;

    public Moto(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        //serve per sovrascrivere un metodo già esistente.   
        return "cilindrata->" + cilindrata;
    }

    @Override
    public int compareTo(Moto o) {
        return this.cilindrata - o.getCilindrata();
    }
}

class Persona implements Comparable<Persona> {

    private final String nome, cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void vaiALavorare() {
        System.out.println("ok... ci vado!!");
    }

    @Override
    public String toString() {
        //serve per sovrascrivere un metodo già esistente.   
        return cognome + " " + nome;
    }

    @Override
    public int compareTo(Persona o) {
        return this.cognome.compareTo(o.getCognome());
    }
}
