/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.visitorp;

/**
 *
 * @author User
 */
public class ElementConcretAuto implements IElemento{
    

    @Override
    public void accept(IVisitor visitador) {
       visitador.visitar(this);
    }
    
}
