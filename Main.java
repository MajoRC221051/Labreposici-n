import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
      
        Controlador controlador = new Controlador();
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Controlador> c = new ArrayList<Controlador>();
             
             
            int opcion = 0;
            while(opcion !=3){
                System.out.println("Bienvenido a Electrónica Centroaméricana :)" );
                System.out.println("¿Qué deseas hacer el día de hoy?");
                System.out.println("1. Ingresar información");
                System.out.println("2. Ver usuarios posibles para un proyecto");
                System.out.println("3. salir");
                opcion = scanner.nextInt();
                if(opcion ==1){   
                    System.out.println(controlador.pedir_usuario());
                    System.out.println(controlador.preguntar_proyecto());
                    System.out.println(controlador.preguntar_profesion());
                    System.out.println(controlador.proyecto());




        }

        if(opcion == 2){
        System.out.println(controlador.preguntar_proyecto());
        System.out.println(controlador.random_persona());



        }
        if(opcion == 3){
            break;
        }
            }
        }
    }
}