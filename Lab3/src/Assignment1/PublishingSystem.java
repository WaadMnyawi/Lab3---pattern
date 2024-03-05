/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment1;

/**
 *
 * @author waadl
 */
public class PublishingSystem {
    
    public static void main(String[] args) { 
       Document article = new Article(); 
    
       Document editedArticle = article.clone(); 
       
       editedArticle.edit(); 
      } 
 } 
