package poo;

public class Motor {

    private Double cilindrada;
    private TipoMotor tipoMotor;

    public Motor() {
        
    }

    public Motor(Double cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    

}
