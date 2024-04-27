package poo;

public class Automovil {

    private int id;
    private String fabricante;
    private String model;
    private Color color = Color.AZUL;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static String colorPatente = "Naranja";
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public Automovil(){
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String model){
        this();
        this.fabricante = fabricante;
        this.model = model;
    }

    public Automovil(String fabricante, String model, Color color) {
        this(fabricante, model);
        this.color = color;
    }

    public Automovil(String fabricante, String model, Color color,Motor motor) {
        this(fabricante, model, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String model, Color color, Motor motor, Estanque estanque) {
        this(fabricante, model, color, motor);
        this.estanque = estanque;
    }    

    public Automovil(String fabricante, String model, Color color, Motor motor, Estanque estanque, Persona conductor,
            Rueda[] ruedas) {
        this(fabricante, model, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return this.motor;        
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (this.estanque == null) {
            this.estanque = new Estanque();
        }
        return this.estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return this.conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }    

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
    public String detalle(){
         
        String detalles = "id = " + this.id +
                "\nauto = " + this.fabricante +
                "\nauto.model = " + this.model;
        if (this.getTipo() != null) {
                detalles += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
        detalles+="\nauto.color = " + this.color +
                "\ncolorPatente = " + Automovil.colorPatente;
        if (this.motor != null) {
            detalles += "\nauto.cilindrada = " + this.motor.getTipoMotor();
        }
        return detalles; 

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
        return km/(this.getEstanque().getCapacidad()*porcentajeGasolina);
    }

    public  float calcularConsumo(int km, int porcentajeGasolina){
        return km/(this.getEstanque().getCapacidad()*(porcentajeGasolina/100f));
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
        return id +" "+fabricante +" "+ model;
    }
}