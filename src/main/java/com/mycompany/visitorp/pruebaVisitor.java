/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.visitorp;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class pruebaVisitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos elementos 
        IElemento carro = new ElementConcretAuto();
        IElemento moto = new ElementConcretMoto();
        
        /**[el visitor -> es la funcionalidad que no es parte de los elementos por q no usan mucho esa funcionalidda solo las visita de vez en cuando]*/
        //creamos un array q contendra a todos los elementos
        ArrayList<IElemento> movilidades = new ArrayList<IElemento>();
        movilidades.add(moto);
        movilidades.add(carro);
        
        //la funcionalidad visitadora
        IVisitor tocarClaxon = new VisitorConcretTocarClaxon();
        tocarClaxon.visitar(movilidades);
        
        //pero tambien podemos agregar la funcionalidad visitadora en uno de los elementos nomas
        ElementConcretAuto carro2 = new ElementConcretAuto();
        tocarClaxon.visitar(carro2);
        
        
        
    }
    
}
