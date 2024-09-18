package org.uv.tpcsw.practica01.inyeccion;

import org.uv.tpcsw.practica01.inyeccion.IMensajeID;
public class MensajeController {

    public void mostrar(IMensajeID mensaje) {
        mensaje.imprimir();
    }
}
