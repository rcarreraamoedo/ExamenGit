/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * Se crea una clase llamada Computer, con sus atributos asociados a las clases
 * secundarias
 *
 * @author rcarreraamoedo
 */
public class Computer {

    private Mouse mouse;
    private Window Window;
    private Memory CPU;

    /**
     * Método constructor sin parámetros con contenido de los atributos
     * añadiendo objetos
     */
    public Computer() {
        mouse = new Mouse();
        Window = new Window();
        CPU = new Memory();
    }

    /**
     * Constructor con parámetros
     *
     * @param mouse
     * @param Window
     * @param cpu
     */
    public Computer(Mouse mouse, Window Window, Memory cpu) {
        this.mouse = mouse;
        this.Window = Window;
        this.CPU = cpu;
    }

    /**
     * Método público vacío, muestra valor de Mouse
     *
     * @param mouse
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Método de Mouse, devuelve el valor Mouse
     *
     * @return
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * Método público vacío, muestra valor de Window
     *
     * @param Window
     */
    public void setWindow(Window Window) {
        this.Window = Window;
    }

    /**
     * Método de Window, devuelve el valor Window
     *
     * @return
     */
    public Window getWindow() {
        return Window;
    }

    /**
     * Método público vacío, muestra valor de Memory
     *
     * @param CPU
     */
    public void setCPU(Memory CPU) {
        this.CPU = CPU;
    }

    /**
     * Método de Memory, devuelve el valor Memory
     *
     * @return
     */
    public Memory getCPU() {
        return CPU;
    }

    /**
     * Método público vacío llamado amosar, se visualiza los atributos llamando
     * con getters
     */
    public void amosar() {
        System.out.println("Rato: " + mouse.getMouse() + "\nPantalla marca: " + Window.setbrands() + "\nPantalla pulgadas: " + Window.getbrinch() + "\nCPU velocidade: " + CPU.setspeed() + "\nCPU memoria: " + CPU.getmemory());
    }
}
