package Programas.Propios;

import javax.swing.*;

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
        if (numeroJugadores <= 0) {
            JOptionPane.showMessageDialog(null, "Numero mínimo de jugadores es de 1");
        } else {
            int contador = 1;
            for (int i = 0; i < numeroJugadores; i++) {
                String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre jugador" + contador);
                contador++;
                players[i] = nombre;
            }
            int azarJugador = (int) (Math.random() * contador - 1);
            JOptionPane.showMessageDialog(null, "Empiezas a jugar " + players[azarJugador] + ". Mucha suerte!!!");
        }
        int aJugar = Integer.parseInt(JOptionPane.showInputDialog(null, "El tambor está abierto elige del 0 al 5 tu agujero"));
        while (aJugar < 0 || aJugar > 5) {
            JOptionPane.showMessageDialog(null, "No seas cagón y mete la bala bien, no ves que estamos en un while");
        }
        int balazo = (int) (Math.random() * 6);
        Pistola jugador1 = new Pistola(aJugar, balazo);
        jugador1.girarTambor(aJugar, balazo);

    }
}
