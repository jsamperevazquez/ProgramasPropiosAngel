package Programas.Propios;

import javax.swing.*;
import java.util.Arrays;
/**
 * @author angel
 * Clase para ver los jugadores que vam a participar el juego
 * @version 0.0.1
 */
public class RuletaRusa {

    public static void main(String[] args) {

        int numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de jugadores"));
        String players[];
        players = new String[10];
        if (numeroJugadores <= 1) {
            JOptionPane.showMessageDialog(null, "Numero mínimo de jugadores es de 2");
        } else {
            int contador = 1;
            for (int i = 0; i < numeroJugadores; i++) {
                String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre jugador" + contador);
                contador++;
                players[i] = nombre;
            }
        }

        JOptionPane.showMessageDialog(null,"EMPIEZA EL JUEGO,  MUCHA SUERTE");

        do {
            int contador2=0;
            for (int i = 0; i < numeroJugadores; i++) {

                if (players==null){
                    contador2=0;
                }
                JOptionPane.showMessageDialog(null, "Es tu turno " + players[contador2] + " SUERTE");
                int aJugar = Integer.parseInt(JOptionPane.showInputDialog(null, "El tambor está abierto elige del 0 al 5 tu agujero"));
                while (aJugar < 0 || aJugar > 5) {
                    JOptionPane.showMessageDialog(null, "No seas cagón y mete la bala bien, no ves que estamos en un while");
                        aJugar = Integer.parseInt(JOptionPane.showInputDialog(null, "El tambor está abierto elige del 0 al 5 tu agujero"));
                }

                int balazo = (int) (Math.random() * 6);
                Pistola jugador = new Pistola(aJugar, balazo);
                jugador.girarTambor(aJugar, balazo);
                if (aJugar == balazo) {
                    numeroJugadores = numeroJugadores - 1;
                }
                if (numeroJugadores == 1) {
                    JOptionPane.showMessageDialog(null, "El jugador que ha quedado con vida ha ganado");
                    break;
                }
                else
                contador2 ++;


            }
        }
        while (numeroJugadores > 1);
    }
}
