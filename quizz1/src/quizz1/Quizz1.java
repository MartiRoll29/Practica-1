/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class Quizz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String salario; // inicializa la variable salario
        salario = JOptionPane.showInputDialog(null, "Ingrese el salario del empleado en colones para calcular los rebajos: "); // ingresa el salario bruto del empleado 
        
        double sal = Integer.parseInt(salario); //cambia 
        
        double revajo_SEM = (sal*0.0925); // calcula las revajas de SEM
        double revajo_IVN = (sal*0.0508); // calcula las rebaas de IVN

      
        double rebajos_CCSS = (revajo_IVN + revajo_SEM); // suma los rebjos 
        
        double salario_post_rebajos_ccss = (sal - rebajos_CCSS); // calcula el salario despues de los rebajos
        double asociacion = (salario_post_rebajos_ccss*0.025); // calcula los rebajos de la asociacion 

        JOptionPane.showMessageDialog(null,"La empresa debe abonar a la CCSS el monto de: "+rebajos_CCSS+ " colones"); // imprime los renajos  de CCSS
        JOptionPane.showMessageDialog(null,"Para la asociacion de la empresa se le asigna un valor de: "+asociacion+" colones"); // imprime los rebajos de la asociacion

        
    }
    
}
