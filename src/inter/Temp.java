/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import analizadorlexico.*; import simbolos.*;
/**
 *
 * @author barce
 */
public class Temp extends Expr{
    static int conteo = 0;
    int numero = 0;
    public Temp(Tipo p) { super(Palabra.temp, p); numero = ++conteo; }
    public String toString() { return "t" + numero; }
}
