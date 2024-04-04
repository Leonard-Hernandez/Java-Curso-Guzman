package poo;

public class Automovil {

    String fabricante;
    String model;
    String color = "blue";
    double cilindrada;

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto = " + this.fabricante);
        sb.append("\nauto.model = " + this.model);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return  sb.toString();
    }

}
