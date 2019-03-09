/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factorymethod;

/**
 *
 * @author Pamela De la torre
 */
public class IsocelesCreator extends TrianguloCreator{

    public IsocelesCreator() {
    }
    
   
    Triangulo createTriangle(String nombre)
    {
        if (nombre.equals("isoceles"))
        {
            return new Isoceles();
        }
        else return null;
    }
    
}
