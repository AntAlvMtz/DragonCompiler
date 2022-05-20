/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author barce
 */
public class Instr extends Nodo{
    public Instr() { }
    public static Instr Null = new Instr();
    public void gen(int b, int a) {} // se llama con etiquetas inicio y despues
    int despues = 0; // almacena la etiqueta despues
    public static Instr Circundante = Instr.Null; // se utiliza para instrs break
}
