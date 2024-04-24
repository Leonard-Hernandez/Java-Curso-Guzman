package poo;

public class Motor {

    private String cilindrada;
    private TipoMotor tipoMotor;

    public Motor() {
        
    }

    public Motor(String cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    

}
