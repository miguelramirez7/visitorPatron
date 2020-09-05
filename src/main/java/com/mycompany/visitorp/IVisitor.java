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
public interface IVisitor {
     public void visitar(ElementConcretAuto auto);
     public void visitar(ElementConcretMoto moto);
     public void visitar(ArrayList<IElemento> movilidades);
}
