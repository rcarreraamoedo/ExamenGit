/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * Se crea una clase llamada Memory, con sus atributos speed e Memory
 *
 * @author rcarreraamoedo
 */
public class Memory {

    private int speed;
    private int memory;

    /**
     * Método público vacío, muestra valor de mouse
     */
    public Memory() {
    }

    /**
     *Método público contructor con parámetros de memory se asigna los
     * atributos marca y brinch
     * @param speed
     * @param memory
     */
    public Memory(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }
    //metodos de acceso

    /**
     *
     * @param speed
     */
    public void setspeed(int speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     */
    public int setspeed() {
        return speed;
    }

    /**
     *
     * @param memory
     */
    public void setmemory(int memory) {
        this.memory = memory;
    }

    /**
     *
     * @return
     */
    public int getmemory() {
        return memory;
    }

}
