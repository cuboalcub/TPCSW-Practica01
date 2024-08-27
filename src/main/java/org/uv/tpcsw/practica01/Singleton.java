package org.uv.tpcsw.practica01;

public class Singleton {
    
    private static Singleton sin = null;
    
    public static Singleton getInstance(){
        if (sin == null){
        sin = new Singleton();
        }
        return sin;
    }
    
    
    private Singleton(){
    }
    
    public void imprimir() {
        System.out.println("Hola mundo");
    }
}
