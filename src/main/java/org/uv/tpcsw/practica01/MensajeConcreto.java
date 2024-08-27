package org.uv.tpcsw.practica01;

public class MensajeConcreto {

    private String name = "";

    public MensajeConcreto(String name) {
        this.name = name;
    }

    public MensajeConcreto() {
        this.name = " nombre";
        System.out.println("Se ejecuta el Constructor");
    }

    public void imprimir() {
        System.out.println(name + ":" + "Mensaje...");
    }

}
