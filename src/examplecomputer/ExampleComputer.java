/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class ExampleComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mouse-Type: ");
        String mouse = sc.next();
        System.out.print("Window-Brands: ");
        String brands = sc.next();
        System.out.print("Window-Brinch: ");
        float brinch = sc.nextFloat();
        System.out.print("CPU-Speed: ");
        int speed = sc.nextInt();
        System.out.print("CPU-Memory: ");
        int memory = sc.nextInt();
        Mouse rat = new Mouse(mouse);
        Window pan = new Window(brands, brinch);
        Memory proc = new Memory(speed, memory);
        Computer Or = new Computer(rat, pan, proc);
        //Amosar 1 lo descartamos para diferencia en la release
        /*System.out.println("*****Datos Validos1****");*/
        Or.amosar();
        //Amosar 2
        System.out.println("*****Datos Validos2*****");
        System.out.print("Rato-Tipo: " + Or.getMouse().getMouse() + "\nPantalla-marca: " + Or.getWindow().setbrands() + "\nPantalla-pulgadas: " + Or.getWindow().getbrinch());
        System.out.println("\nCPU-velocidade: " + Or.getCPU().setspeed() + "\nCPU-memoria: " + Or.getCPU().getmemory());
    }

}

