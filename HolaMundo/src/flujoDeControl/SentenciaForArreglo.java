package flujoDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Leonard", "Lubraska", "Anfres", "Pepe", "Maria", "Pepa"};

        int count = nombres.length;

        for(int i = 0; i < count; i++){

            if (nombres[i].equalsIgnoreCase("anfres") ||
                    nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i + ".-" +nombres[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i<count ; i++ ){

            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema");
        }


    }
}
