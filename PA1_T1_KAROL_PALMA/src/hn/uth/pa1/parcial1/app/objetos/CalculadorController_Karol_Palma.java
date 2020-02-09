/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.app.objetos;

import hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma;
import static hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma.lblValorCalculosRealizados;
import static hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma.lblValorResultado;
import static hn.uth.pa1.parcial1.app.Frm_Calculador_Karol_Palma.tblHistorial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KP
 */
public class CalculadorController_Karol_Palma {
    
        public static List<Calculador_Karol_Palma> listaOperaciones = new ArrayList<>();
    
    public static void agregarOperacionLista(Calculador_Karol_Palma operacion){
        listaOperaciones.add(operacion);
    }
    
    public static Object[][] getListaOperadoresComoArreglo(){
        Object arreglo[][]=new Object[listaOperaciones.size()][3];
        
        int indice=0;
        for (Calculador_Karol_Palma opTmp : listaOperaciones) {
            arreglo[indice][0]=opTmp.getOperacion();
            arreglo[indice][1]=opTmp.getResultado();
            arreglo[indice][2]=opTmp.getSigno();
            indice++;
        }
        
        return  arreglo;
    }
    
    public static void EliminarOperacion(int fila){
        if(fila >= 0){
            listaOperaciones.remove(listaOperaciones.size()-(fila+1));
        }
    }
    
    public static int tamanioLista(){
        return listaOperaciones.size();
    }
    
    public static void actualizarTabla(){
        lblValorCalculosRealizados.setText(String.valueOf(tamanioLista()));
            tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            getListaOperadoresComoArreglo(),
            new String [] {
                "Operación", "Resultado", "Signo"
            }
        ));
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
