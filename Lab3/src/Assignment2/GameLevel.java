/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

/**
 *
 * @author waadl
 */

public interface GameLevel extends Cloneable {
    
GameLevel clone();

void configureTerrain();
void placeObstacles();
void placeEnemies();

}