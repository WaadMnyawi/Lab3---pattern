/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author waadl
 */
public class Brochure implements Document { 
   
     @Override 
      public Document clone() { 
         return new Brochure(); 
     } 
   
     @Override 
     public void edit() { 
        System.out.println("Editing brochure..."); 
    } 
 }