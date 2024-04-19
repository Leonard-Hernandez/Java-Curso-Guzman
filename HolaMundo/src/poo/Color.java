package poo;

public enum Color {

    ROJO("Rojo"),
    VERDE("Verde"),
    AZUL("Azul"),
    NARANJA( "Naranja"),
    VIOLETA("Violeta"),
    LILA("Lila"),
    AMBAR("Ambar"),
    AMARILLO("Amarillo");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return this.color;
    }

}
