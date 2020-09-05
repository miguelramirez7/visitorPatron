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
public class VisitorConcretTocarClaxon implements IVisitor{
    
    
    @Override
    public void visitar(ElementConcretAuto auto) {
        System.out.println("AUTO toco claxon");
    }

    @Override
    public void visitar(ElementConcretMoto moto) {
        System.err.println("MOTO toco claxon");
    }
    

    @Override
    public void visitar(ArrayList<IElemento> movilidades) {
        for (IElemento movilidade : movilidades) {
            movilidade.accept(this);
        }
    }
   
}
