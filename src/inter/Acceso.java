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
public class Acceso extends Op{
    public Id arreglo;
    public Expr indice;
    public Acceso(Id a, Expr i, Tipo p) { // p es el tipo de elemento despues de
        super(new Palabra("[]", Etiqueta.INDEX), p);// aplanar el arreglo
        arreglo = a; indice = i;
    }
    public Expr gen() { return new Acceso(arreglo, indice.reducir(), tipo); }
    public void salto(int t,int f) { emitirsaltos(reducir().toString(),t,f); }
    public String toString() {
        return arreglo.toString() + " [ " + indice.toString() + " ]";
    }
}
