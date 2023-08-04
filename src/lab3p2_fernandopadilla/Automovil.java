
package lab3p2_fernandopadilla;

import java.awt.Color;
import java.util.Date;


public class Automovil extends Vehiculo {
    private String tipoC;
    private int numP;
    private String tipoT;
    private int numA;

    public Automovil() {
    }

    public Automovil(String tipoC, int numP, String tipoT, int numA, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.tipoC = tipoC;
        this.numP = numP;
        this.tipoT = tipoT;
        this.numA = numA;
    }


    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public String getTipoT() {
        return tipoT;
    }

    public void setTipoT(String tipoT) {
        this.tipoT = tipoT;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    @Override
    public String toString() {
        return "Automovil{" + "tipoC=" + tipoC + ", numP=" + numP + ", tipoT=" + tipoT + ", numA=" + numA + '}';
    }
    
    
}
