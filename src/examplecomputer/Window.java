/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * Se crea una clase llamada Window, con los respectivos atributos
 *
 * @author rcarreraamoedo
 */
public class Window {

    private String brands;
    private float brinch;

    /**
     * Método constructor sen parámetros
     */
    public Window() {
    }

    /**
     * Método público contructor con parámetros de Pantalla se asigna los
     * atributos marca y brinch
     *
     * @param brands fabricante de la pantalla
     * @param brinch tamaño de la pantalla
     */
    public Window(String brands, float brinch) {
        this.brands = brands;
        this.brinch = brinch;
    }

    //metodos de acceso
    /**
     * Método público vacío, muestra valor string de marca
     *
     * @param brands
     */
    public void setbrands(String brands) {
        this.brands = brands;
    }

    /**
     * Método String, devuelve el valor marca
     *
     * @return
     */
    public String setbrands() {
        return brands;
    }

    /**
     * Método público vacío, muestra el valor float de brinch
     *
     * @param brinch
     */
    public void setbrinch(float brinch) {
        this.brinch = brinch;
    }

    /**
     * Método float, devuelve el valor brinch
     *
     * @return
     */
    public float getbrinch() {
        return brinch;
    }
}
