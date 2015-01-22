/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sklep_gry ;

/**
 *
 * @author Mitrut Maciej, Radosław Kowalik, Jakub Cieślak
 */
public class Sklepz_grami {

    private Gra gra ;
    private Gatunek gatunek;
    private Platforma platforma;
    private Cena cena;
    private Uzytkownik uzytkownik;
    
    
    public Sklepz_grami(){
        gra = new Gra();
        gatunek = new Gatunek();
        platforma = new Platforma();
        cena = new Cena();
        uzytkownik = new Uzytkownik();
    }
    public static void main(String[] args) {
        
    }
    
}
