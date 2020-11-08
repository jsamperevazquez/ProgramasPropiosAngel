package Programas.Propios;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author angel
 * Clase para ver los jugadores que vam a participar el juego
 * @version 0.0.1
 */
public class RuletaRusa {

    public static void main(String[] args) {

        ArrayList listaPlayers = new ArrayList();
        int numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de jugadores"));


        if (numeroJugadores <= 1) {
            JOptionPane.showMessageDialog(null, "Numero mínimo de jugadores es de 2");
        } else {
            int contador = 1;
            for (int i = 0; i < numeroJugadores; i++) {
                String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre jugador" + contador);
                contador++;
                listaPlayers.add(nombre);
            }
        }

        JOptionPane.showMessageDialog(null, "EMPIEZA EL JUEGO,  MUCHA SUERTE");

        do {
            int contador2 = 0;
            for (int i = 0; i < listaPlayers.size(); i++) {

                JOptionPane.showMessageDialog(null, "Es tu turno " + listaPlayers.get(contador2) + " SUERTE");
                int aJugar = Integer.parseInt(JOptionPane.showInputDialog(null, "El tambor está abierto elige del 0 al 5 tu agujero"));
                while (aJugar < 0 || aJugar > 5) {
                    JOptionPane.showMessageDialog(null, "No seas cagón y mete la bala bien, no ves que estamos en un while");
                    aJugar = Integer.parseInt(JOptionPane.showInputDialog(null, "El tambor está abierto elige del 0 al 5 tu agujero"));
                }

                int balazo = (int) (Math.random() * 6);
                Pistola jugador = new Pistola(aJugar, balazo);
                jugador.girarTambor(aJugar, balazo);
                if (aJugar == balazo) {

                    listaPlayers.remove(contador2);
                    if (contador2 == 0) {
                        contador2 = 1;
                    }
                    contador2 = contador2 - 1;

                }
                if (listaPlayers.size() == 1) {

                    JOptionPane.showMessageDialog(null, listaPlayers.get(0) + " ha ganado la partida");
                    break;
                } else
                    System.out.println(contador2);
                contador2++;


            }
        }
        while (listaPlayers.size() > 1);
    }
}
