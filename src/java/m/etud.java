/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

/**
 *
 * @author cash express
 */
public class etud {
    String nom;
    int note1;
    int note2;

    public etud(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }
  public float calcul (int note1,int note2)
  {return(note1+note2)/2;}  

}
