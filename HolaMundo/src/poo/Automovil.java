package poo;

public class Automovil {

    String fabricante;
    String model;
    String color = "blue";
    double cilindrada;
    int capacidadTanque= 40;

    public String detalle(){
        return "auto = " + this.fabricante +
                "\nauto.model = " + this.model +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + model + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public  float calcularConsumo(int km, float porcentajeGasolina){
        return km/(this.capacidadTanque*porcentajeGasolina);
    }

    public  float calcularConsumo(int km, int porcentajeGasolina){
        return km/(this.capacidadTanque*(porcentajeGasolina/100f));
    }

}
