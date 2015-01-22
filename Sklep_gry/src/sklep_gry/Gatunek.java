/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sklep_gry;

/**
 *
 * @author Mitrut Maciej, Radosław Kowalik, Jakub Cieślak
 */
public class Gatunek {
    
    
    private String Kategoria;
   
    public Gatunek(String Kategoria){
        this.Kategoria  = Kategoria;
    }
     
    public Gatunek(){
        
        this("");
        System.out.println("[Sklep_gry.gatunek] Utworzono obiekt klasy gatunek");
   
    }
   
    public void SetKategoria(String N_Kategoria){
        this.Kategoria = N_Kategoria;
    }
     
    public String GetKategoria(){
        return this.Kategoria;
    }
    
    }

