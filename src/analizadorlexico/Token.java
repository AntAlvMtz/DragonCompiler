/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorlexico;

/**
 *
 * @author barce
 */
public class Token {
    public final int etiqueta;
    public Token(int t) {etiqueta = t;}
    public String toString() {return "" + (char)etiqueta;}
}
