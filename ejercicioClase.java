
import java.util.Scanner;


public class ejercicioClase {
    public static void main(String[] args) {
        int numDia;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba el numero del dia del 1 al 7: " );
        numDia = sc.nextInt();
        
        switch(numDia){
            case 1: 
                System.out.println("domingo");
            break;
            case 2: 
                System.out.println("lunes");
            break;
            case 3: 
                System.out.println("martes");
            break;
            case 4: 
                System.out.println("miercoles");
            break;
            case 5: 
                System.out.println("jueves");
            break;
            case 6: 
                System.out.println("viernes");
            break;
            case 7: 
                System.out.println("sabado");
            break;
            default:
                System.out.println("el numero no representa ningun dia");
            break;
        }
    }
}
