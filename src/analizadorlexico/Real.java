/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorlexico;

/**
 *
 * @author barce
 */
public class Real extends Token{
    public final float valor;
    public Real(float v) {super(Etiqueta.REAL); valor = v; }
    public String toString() {return "" + valor; }
}
