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
public class Or extends Logica{
    public Or(Token tok, Expr x1, Expr x2) { super(tok, x1, x2); }
    public void salto(int t, int f) {
        int etiqueta = t != 0 ? t : nuevaEtiqueta();
        expr1.salto(etiqueta, 0);
        expr2.salto(t,f);
        if( t == 0 ) emitirEtiqueta(etiqueta);
    }
}