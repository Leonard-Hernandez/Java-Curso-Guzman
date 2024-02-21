package ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuInteractivo {
    public static void main(String[] args) {
        int opcionIndice = 0;
        // los Map (o mapas) los veremos mas adelante en el curso en profundidad
        // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
        // también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();
        ArrayList<String> productos = new ArrayList<>();

            bucle:
            while (true) {
                Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione un Opción",
                        "Mantenedor de Productos",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                if (opcion == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                } else {
                    opcionIndice = opciones.get(opcion.toString());

                switch (opcionIndice) {
                    case 1:
                        // Actualizar
                        String editprod = JOptionPane.showInputDialog("Escrina el producto a editar");
                        if (productos.contains(editprod)) {
                            int indice = productos.indexOf(editprod);

                            String nuevoProducto = JOptionPane.showInputDialog("Ingrese el nuevo producto");
                            productos.set(indice, nuevoProducto);

                            JOptionPane.showMessageDialog(null, "Su producto se a actualizado con exito");
                        }else {
                            JOptionPane.showMessageDialog(null,"No se encontro el producto");
                        }
                        break;
                    case 2:
                        // Eliminar
                        String deletprod = JOptionPane.showInputDialog("Escrina el producto a editar");
                        if (productos.contains(deletprod)) {
                            int indice = productos.indexOf(deletprod);

                            productos.remove(indice);

                            JOptionPane.showMessageDialog(null, "Su producto se a eleminado con exito");
                        }else {
                            JOptionPane.showMessageDialog(null,"No se encontro el producto");
                        }

                        break;
                    case 3:
                        // Ingresar producto
                        String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                        productos.add(producto);

                        JOptionPane.showMessageDialog(null, "El producto " + producto + " fue agragado con exito");

                        break;
                    case 4:
                        // Listar productos
                        System.out.println("Lista de productos");

                        StringBuilder listaProductos = new StringBuilder();

                        for (int i = 0; i < productos.size(); i++) {
                            listaProductos.append(i + " " + productos.get(i).toString().concat("\n"));

                        }
                        JOptionPane.showMessageDialog(null, listaProductos.toString());

                        break;
                    case 5:
                        break bucle;
                }
            }
        }
    }
}
