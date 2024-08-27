package org.uv.tpcsw.practica01;

public class TPCSWPractica01 {

    public static void main(String[] args) {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        System.out.println(s1);
//        System.out.println(s2);
//        
//        IMensaje msgV = null;
//
//        msgV = new Saludo2();
//        msgV.imprimir();
//
//        msgV = new Despedida2();
//        msgV.imprimir();
//
//        msgV = () -> {
//            System.out.println("Otro mensaje");
//        };
//        msgV.imprimir();

//        Mensaje msgV =null;
//        msgV = new Saludo();
//        msgV.imprimir();
//        msgV = new Despedida();
//        msgV.imprimir();
//        msgV = new Mensaje(){
//            @Override
//            protected void msg(){
//             System.out.println("Otro mensaje");
//            }
//        };
//        msgV.imprimir();
//        MensajeConcreto msg = null;
//        msg= new MensajeConcreto("otro");
//        msg.imprimir();
//        System.out.println("Hello World!");
    }

}
