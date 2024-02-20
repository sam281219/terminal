/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samus
 */
public class Alumno {
  private String alumno;
    private int [] n;
    
    public Alumno(){
        n = new int[5];
        Scanner t = new Scanner(System.in);
        System.out.println("Nombre: ");
        alumno = t.next();
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nota "+(i+1));
            n[i]=t.nextInt();
        }
    }
    public int mayor(){
        return Arrays.stream(n).max().orElse(0);
    }
    public int menor(){
        return Arrays.stream(n).min().orElse(0);
    }
    public void cero(){
        Arrays.fill(n, 0);
    }
    public int nota(int ne){
        Arrays.sort(n);
        return Arrays.binarySearch(n, ne);
    }
    public int [] mejores3(){
        int [] c = Arrays.copyOf(n, n.length);
        Arrays.sort(c);
        int [] d = Arrays.copyOfRange(c, n.length-3, n.length);
        return d;
    }

    @Override
    public String toString() {
        String c = "";
        for (int i = 0; i < n.length; i++) {
            c+=n[i]+"\n";
        }
        return "Alumno{" + "alumno=" + alumno + ", n=" + c + '}';
    }
    
}
