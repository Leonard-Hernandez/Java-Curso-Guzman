package poo;

public class Automovil {

    private String fabricante;
    private String model;
    private String color = "blue";
    private double cilindrada;
    private int capacidadTanque= 40;

    private static String colorPatente = "Naranja";

    public Automovil(){}
    public Automovil(String fabricante, String model){
        this.fabricante = fabricante;
        this.model = model;
    }

    public Automovil(String fabricante, String model, String color){
        this(fabricante, model);
        this.color = color;
    }

    public Automovil(String fabricante, String model, String color, double cilindrada) {
        this(fabricante, model, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String model, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, model, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String detalle(){
        return "auto = " + this.fabricante +
                "\nauto.model = " + this.model +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada +
                "\ncolorPatente = " + Automovil.colorPatente;

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

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.model != null
                && this.fabricante.equals(a.getFabricante())
                && this.model.equals(a.getModel()));
    }

    @Override
    public String toString() {
        return fabricante +" "+ model;
    }
}