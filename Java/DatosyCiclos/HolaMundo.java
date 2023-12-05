package DatosyCiclos;//import java.util.scanner;

public class HolaMundo {
    public static void main( String[] args){
//Aca el for esta diciendo que mientras i sea menor a diez repeti el mensaje de el numero es i
      for (int i = 0; i <= 10; i++){
          System.out.println("El numero es "+ i);
      }
//aca el while no se inicializa porque nunca entra en el ciclo pero si le cambio el valor a 6 se repite infinitamente.
      int id = 5;
    while (id == 6){
        System.out.println("Su numero es menor a 6");
    }

       // Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");


    }
}
