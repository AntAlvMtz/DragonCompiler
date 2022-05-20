/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import simbolos.*;
/**
 *
 * @author barce
 */
public class If extends Instr{
    Expr expr; Instr instr;
    public If(Expr x, Instr s) {
        expr = x; instr = s;
        if( expr.tipo != Tipo.Bool ) expr.error("se requiere booleano en if");
    }
    public void gen(int b, int a) {
        int etiqueta = nuevaEtiqueta(); // etiqueta para el codigo de instr
        expr.salto(0, a); // pasa por alto en true, va hacia a en false
        emitirEtiqueta(etiqueta); instr.gen(etiqueta, a);
    }
}
