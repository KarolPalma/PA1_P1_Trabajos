/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.app.objetos;

import hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma;
import static hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma.lblValorCalculosRealizados;
import static hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma.lblValorResultado;

/**
 *
 * @author KP
 */
public class CalculadorController_Karol_Palma {
    
   public static void agregarOperacionSuma(String resul){
        String operacion = Frm_Calculador_Karol_Palma.txtA.getText()+" + "+Frm_Calculador_Karol_Palma.txtB.getText();
        int resultado = Integer.parseInt(lblValorResultado.getText());
        String signo = mostrarSigno(resul);
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, resultado, signo);
        Frm_Calculador_Karol_Palma.contenedor.add(calculo);
   }
   
   public static void agregarOperacionResta(String resul){
        String operacion = Frm_Calculador_Karol_Palma.txtA.getText()+" - "+Frm_Calculador_Karol_Palma.txtB.getText();
        int resultado = Integer.parseInt(lblValorResultado.getText());
        String signo = mostrarSigno(resul);
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, resultado, signo);
        Frm_Calculador_Karol_Palma.contenedor.add(calculo);
   }
   
   public static void agregarOperacionDividir(String resul){
        String operacion = Frm_Calculador_Karol_Palma.txtA.getText()+" / "+Frm_Calculador_Karol_Palma.txtB.getText();
        int resultado = Integer.parseInt(lblValorResultado.getText());
        String signo = mostrarSigno(resul);
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, resultado, signo);
        Frm_Calculador_Karol_Palma.contenedor.add(calculo);
   }
   
   public static void agregarOperacionMultiplicar(String resul){
        String operacion = Frm_Calculador_Karol_Palma.txtA.getText()+" * "+Frm_Calculador_Karol_Palma.txtB.getText();
        int resultado = Integer.parseInt(lblValorResultado.getText());
        String signo = mostrarSigno(resul);
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, resultado, signo);
        Frm_Calculador_Karol_Palma.contenedor.add(calculo);
   }
   
   public static void agregarOperacionPotencia(String resul){
        String operacion = Frm_Calculador_Karol_Palma.txtA.getText()+" ^ "+Frm_Calculador_Karol_Palma.txtB.getText();
        int resultado = Integer.parseInt(lblValorResultado.getText());
        String signo = mostrarSigno(resul);
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, resultado, signo);
        Frm_Calculador_Karol_Palma.contenedor.add(calculo);
   }
   
    
    public static String mostrarSigno(String resultado){
        String resul = "";
        int num = Integer.parseInt(resultado);
        if(num < 0){
            resul = "Negativo";
        }
        if(num > 0){
            resul = "Positivo";
        }
        if(num == 0){
            resul = "Neutro";
        }
        return resul;
    }
}
