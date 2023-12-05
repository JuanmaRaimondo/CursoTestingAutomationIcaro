package DatosyCiclos;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio1 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int i = sc.nextInt();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        while (i<=500){


                listaNumeros.add(i);
                i = sc.nextInt();
            System.out.println("su numero es" + i);

        }
        System.out.println("Su numero es mayor a 500");
        int it = 0;
        while(it < listaNumeros.size()){
            System.out.println( listaNumeros.get(it));
            it = it+1;
        } 
    };





}
