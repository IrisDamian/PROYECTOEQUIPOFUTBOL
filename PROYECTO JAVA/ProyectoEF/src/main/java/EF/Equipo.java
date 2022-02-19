/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EF;




/**
 *
 * @author Iris Damian
 */
public class Equipo {
  private String EQUIPO;
    private int PJU;
    private int PGA;
    private int PEM;
    private int PPE;
    private int GFA;
    private int GCO;

    public int CALCULARPUN() {
        return PJU * 3 + PEM;
    }
    
    public String toString()  {
        return String.format("NOMBRE: PUNTO: %-10d", EQUIPO, CALCULARPUN());
    }  
    
     public static Equipo CREAREQ( String equipo, int jug, int gan, int emp, int per, int golf, int gole ) {
        Equipo TAB = new Equipo();
        TAB.EQUIPO = equipo;
        TAB.PJU = jug;
        TAB.PGA = gan;
        TAB.PEM = emp;
        TAB.PPE = per;
        TAB.GFA = golf;
        TAB.GCO = gole;
        return TAB;
    } 
}


