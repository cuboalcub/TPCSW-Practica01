/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abisai
 */
public class Saludo2 implements IMensaje {

    @Override
    public void imprimir() {
        Logger.getLogger(Saludo2.class.getName()). 
                log(Level.INFO, "Hola mundo");
        
    }
    
}
