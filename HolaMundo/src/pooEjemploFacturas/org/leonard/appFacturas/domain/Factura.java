package pooEjemploFacturas.org.leonard.appFacturas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[this.indiceItems++] = item;
        }
    }

    public Float calcularTotal() {
        Float total = 0f;
        for (int i = 0; i < this.indiceItems; i++) {
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {

        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(this.folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tNIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("\nFecha Emision: ")
                .append(sdf.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i = 0; i < this.indiceItems; i++) {

            sb.append(this.items[i])
                    .append("\n");
        }
        sb.append("\nTotal: ")
                .append(this.calcularTotal());

        return sb.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }

}
