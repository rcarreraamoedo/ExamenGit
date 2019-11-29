/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * Se crea una clase llamada Mouse, con su atributo
 * @author rcarreraamoedo
 */
public class Mouse {

    private String mouse;

    /**
     * Método constructor sen parámetros
     */
    public Mouse() {
    }

    /**
     *  Método público contructor con parámetros de mouse se asigna los
     * atributos mouse
     * @param mouse 
     */
    public Mouse(String mouse) {
        this.mouse = mouse;
    }
    //metodos de acceso

    /**
     * Método público vacío, muestra valor string de Mouse
     * @param mouse
     */
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    /**
     * Método String, devuelve el valor marca
     * @return
     */
    public String getMouse() {
        return mouse;
    }
}
