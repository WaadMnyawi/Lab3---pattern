/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment2;

/**
 *
 * @author waadl
 */
public class LevelDesignTool {


public static void main(String[] args) {
    

    GameLevel levelPrototype = new StandardLevel ();
    
    GameLevel modifiedLevel = levelPrototype.clone ( );
    modifiedLevel.configureTerrain(); 
    modifiedLevel.placeObstacles(); 
    modifiedLevel.placeEnemies();
    
}
}
