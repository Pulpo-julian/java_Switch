
import java.util.Scanner;


public class biciesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el año");
        int year = sc.nextInt();
        
        if ( (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) ) {
            System.out.println(year + " es biciesto");
        } else {
            
            System.out.println(year + " no es biciesto");
        }
        
        
    }
}
