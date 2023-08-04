
package lab3p2_fernandopadilla;

import java.awt.Color;
import java.util.Date;


public class Autobus extends Vehiculo{
    private int numeroP, numeroE;
    private double longitud;

    public Autobus() {
    }

    public Autobus(int numeroP, int numeroE, double longitud, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.numeroP = numeroP;
        this.numeroE = numeroE;
        this.longitud = longitud;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public int getNumeroE() {
        return numeroE;
    }

    public void setNumeroE(int numeroE) {
        this.numeroE = numeroE;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Marca =" + getMarca() + ", modelo = "+ getModelo()+ ", placa = " + getPlaca() + ", tipo = " + getTipo();
    }
    
    
}
