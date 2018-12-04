package boletin3;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class Boletin3 {

    public static void main(String[] args) {

        Consumo obx = new Consumo();
        obx.setLitros(50);
        obx.setpGas(1.57);
        Consumo obx2 = new Consumo(600, 50, 120, 1.57);
        JOptionPane.showMessageDialog(null, "El cosumo medio es: " + obx2.consumoMedio());
        obx2.setLitros(35);
        JOptionPane.showMessageDialog(null, "La velocidad media es: " + obx2.getvMed());
    }

}
