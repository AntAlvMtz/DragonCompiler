/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author barce
 */
public class Sec extends Instr{
    Instr instr1; Instr instr2;
    public Sec(Instr s1, Instr s2) { instr1 = s1; instr2 = s2; }
    public void gen(int b, int a) {
        if ( instr1 == Instr.Null ) instr2.gen(b, a);
        else if ( instr2 == Instr.Null ) instr1.gen(b, a);
        else {
            int etiqueta = nuevaEtiqueta();
            instr1.gen(b,etiqueta);
            emitirEtiqueta(etiqueta);
            instr2.gen(etiqueta, a);
        }
    }
}
