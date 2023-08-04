
package lab3p2_fernandopadilla;

import java.awt.Color;
import java.util.Date;


public class Motocicleta extends Vehiculo {
    private double velocidadM,peso,consumo;

    public Motocicleta() {
    }

    public Motocicleta(double velocidadM, double peso, double consumo, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.velocidadM = velocidadM;
        this.peso = peso;
        this.consumo = consumo;
    }

    public double getVelocidadM() {
        return velocidadM;
    }

    public void setVelocidadM(double velocidadM) {
        this.velocidadM = velocidadM;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "velocidadM=" + velocidadM + ", peso=" + peso + ", consumo=" + consumo + '}';
    }
    
    
    
    
}
