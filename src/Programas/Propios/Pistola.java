package Programas.Propios;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  06 nov., 2020
 * @version 0.0.1
 **/
public class Pistola {
    private int bala;
    private int tambor;


    public Pistola() {
    }

    public Pistola(int miBala, int tamborGirado) {
        bala = miBala;
    }

    public void girarTambor(int bala, int girarTambor) {
        if (bala == girarTambor) {
            JOptionPane.showMessageDialog(null, "No me manches el sillón porfavor");
        } else {
            JOptionPane.showMessageDialog(null, "Te has librado de esta amig@ mío");
        }
    }
}
