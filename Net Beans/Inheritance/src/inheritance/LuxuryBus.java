/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class LuxuryBus extends Transport 
{

    @Override
    void calculateFare() {
        fare = (distance * 10) + 200;
    }
}