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
public class Calculador_Karol_Palma {
    private String Operacion;
    private int Resultado;
    private String Signo;
    
    public Calculador_Karol_Palma() {
        this.Operacion = "";
        this.Resultado = 0;
        this.Signo = "";
    }
    
    public Calculador_Karol_Palma(String Operacion, int Resultado, String Signo) {
        this.Operacion = Operacion;
        this.Resultado = Resultado;
        this.Signo = Signo;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String Signo) {
        this.Signo = Signo;
    }
}
