package com.mayab.patrones.factorymethod;


public abstract class TrianguloCreator {
    
    
    abstract Triangulo createTriangle(String nombre);
    
    public Triangulo CalcularMedidas(String nombre)
    {
     Triangulo triangulo = createTriangle(nombre);
     System.out.println("tipo:"  + triangulo.getNombre());
     return triangulo;
    }
    

    
}