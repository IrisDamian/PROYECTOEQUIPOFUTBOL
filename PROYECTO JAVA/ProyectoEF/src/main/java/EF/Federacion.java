/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EF;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Iris Damian
 */
public class Federacion {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String ... args) {
        int numeroEquipos = readInt("NUMERO DE EQUIPOS ");
        Equipo [] equipos = new Equipo[numeroEquipos];
        for ( int i = 0 ; i < numeroEquipos ; i++ ) {
            equipos[i] = Equipo.CREAREQ(
                readString("\n\nEQUIPO "),
                readInt("JUGADOS "),
                readInt("GANADOS "),
                readInt("EMPATADOS "),
                readInt("PERDIDOS "),
                readInt("GOLES A FAVOR "),
                readInt("GOLES EN CONTRA "));
        }
        for ( Equipo EQ : equipos ) {
            out.println( EQ );
        }
    }
    private static String readString( String message ) {
        System.out.print( message );
        return in.next();
    }
    private static int readInt(String message) {
        System.out.print(message);
        return in.nextInt();
    }
    
}
