/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

/**
 *
 * @author waadl
 */
public class StandardLevel implements GameLevel {
    

    @Override
    public GameLevel clone() {
    return new StandardLevel ();
    }
    
    @Override
    public void configureTerrain() {
    System.out.println("Configuring Terrain...");
    }
    
    @Override
    public void placeObstacles(){
    System.out.println("Placing Obstacles...");
    }
    
    @Override
    public void placeEnemies() {
    System.out.println("Placing Enemies...");
    }
    
    }