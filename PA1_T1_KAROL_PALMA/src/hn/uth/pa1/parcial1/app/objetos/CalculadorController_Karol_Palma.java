/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.app.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KP
 */
public class CalculadorController_Karol_Palma {
    private static Calculador_Karol_Palma opActual;
    private static List<Calculador_Karol_Palma> listaOperaciones = new ArrayList<>();
    
    public static void agregarOperacionLista(Calculador_Karol_Palma operacion){
        listaOperaciones.add(operacion);
    }
    
    public static Object[][] getListaOperacionComoArreglo(){
        Object arreglo[][]=new Object[listaOperaciones.size()][3];
        
        int indice=0;
        for (Calculador_Karol_Palma calcu : listaOperaciones) {
            arreglo[indice][0]=calcu.getOperacion();
            arreglo[indice][1]=calcu.getResultado();
            arreglo[indice][2]=calcu.getSigno();
            indice++;
        }
        return  arreglo;
    }
    
    public static void configurarOperacionActual(Calculador_Karol_Palma operacion){
        opActual = operacion;
    }
    
    public static void GuardarOperaciones(){
        String operacion = "";
        String resultado = "";
        String signo = "";
        String cont = "";
        
        Calculador_Karol_Palma calculo = new Calculador_Karol_Palma(operacion, Integer.parseInt(resultado), signo, Integer.parseInt(cont));
        
        CalculadorController_Karol_Palma.agregarOperacionLista(calculo);
    }
    
    public static void mostrarSigno(Calculador_Karol_Palma resultado){
        if (resultado.getResultado() > 0){
            
        }
    }
    
    
    
    public static Calculador_Karol_Palma getopActual(){
        return opActual;
    }
}
