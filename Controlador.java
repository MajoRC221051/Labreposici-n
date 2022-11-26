
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador implements Funciones {
    private ArrayList<Usuario> person;
  
    
    public Controlador() {
        person = new ArrayList<Usuario>();
        
       
    }


    public void agregarUsuario(String nombre, String dpi, String numero){

        person.add(new Usuario(numero, dpi, nombre));
    }

  

  
   


    Scanner scanner = new Scanner(System.in);
    @Override
    public String pedir_usuario() {
       String nombre, dpi, numero;
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = scanner.next();
        System.out.println("Por favor, ingrese su DPI: ");
        dpi = scanner.next();
        System.out.println("Por favor, ingrese su número de contacto: ");
        numero = scanner.next();
        person.add(new Usuario(nombre, numero, dpi));
        return ("Se ha agregado correctamente el contacto");
        
    }

    public String preguntar_proyecto(){
        String formato = "";
        System.out.println("Por favor, ingrese el proyecto que desea: 1. Liderazgo---2.Social---3. administrativo ");
        formato = scanner.next();
        
        if (formato == "1"){
            formato = "Liderazgo"; 
            System.out.println("Liderazgo");
        }
        else if (formato == "2"){
            formato = "Social";
            System.out.println("Social");
        }
        else if(formato == "3"){
            formato = "Administrativo";
            System.out.println("Administrativo");
        }
        return formato;
    }
    
    public String preguntar_profesion(){
        String profesion = "";
        System.out.println("Por favor, ingresa el tipo de profesión que desempeñaras: 1. Ingeniero(Tiempo completo, Profesional, experiencia)---2. Practicante(Medio tiempo, salario mínimo, excelentes habilidades sociales, no experiencia y creatividad)---3.Administrador(Medio tiempo, experiencia, creatividad, liderazgo, amigable) ");
        
        profesion = scanner.next();
        if (profesion == "1"){
            profesion = "Ingeniero(a)"; 
            System.out.println("Ingeniero(a)");
        }
        else if (profesion == "2"){
          profesion = "Practicante";
          System.out.println("Practicante");
        }
        else if(profesion == "3"){
            profesion = "Administrador(a)";
            return "Administrador(a)";
        }
        return profesion;

        
    }

    public String proyecto(){
        String proyect = "";
        System.out.println("Por favor, escoge el tipo de proyecto que vas a realizar: 1. Investigativo: Requisitos: experiencia, conocimiento y creatividad---2. Nuevo  cliente:  Requisitos:  conocimiento  y  creatividad.  Los  clientes  nuevos  siempre  deben  ser trabajados con alguien profesional. 3. Mantenimiento: requieren liderazgo y colaboración. También necesitan de alguien con experiencia, ya que suelen ser proyectos rutinarios. 4. Interno(liderago, compañerismo)  ");
        proyect = scanner.next();
        if (proyect == "1"){
            proyect =  "Investigativo"; 
            System.out.println("Investigativo");
        }
        else if (proyect == "2"){
          proyect =  "Nuevo cliente";
          System.out.println("Nuevo cliente");
        }
        else if(proyect == "3"){
            proyect =  "Mantenimiento";
            System.out.println("Mantenimiento");
        }
        else if(proyect == "4"){
            proyect =  "Interno";
            System.out.println("Interno");
        }
        return "";
    }

    public String random_persona(){
        String result = "Usuarios\n======================\n";
        for (Usuario personita : person){ 
            result = result + personita.toString();
        }
        return result+"\n======================\n";
    }
 


   

        
    
}
