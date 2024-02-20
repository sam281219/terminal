/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio6;

/**
 *
 * @author samus
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Alumno a = new Alumno();
        System.out.println("Mayor nota: "+a.mayor());
        System.out.println("Menor nota: "+a.menor());
        System.out.println(a.toString());
        int [] e = a.mejores();
        //errores corregidos 
        //resuelto todo
        System.out.println("Mejores notas: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+"\n ");
        }
        System.out.println(a.nota(2));
        a.cero();
        System.out.println(a.toString());
        
    }
}
