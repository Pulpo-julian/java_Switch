
import javax.swing.JOptionPane;


public class diasMes {
    
    public static void main(String[] args) {
        int numDias = 0;

        String mes = JOptionPane.showInputDialog("Escriba el mes en minusculas: ");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));

        
        switch(mes){
            case "enero":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "febrero":
                if((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)) {
                    numDias = 29;
                    JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
                } else {
                    numDias = 28;
                    JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
                }
            break;
            case "marzo":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "abril":
                numDias = 30;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "mayo":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "junio":
                numDias = 30;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "julio":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "agosto":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "septiembre":
                numDias = 30;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "octubre":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "noviembre":
                numDias = 30;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            case "diciembre":
                numDias = 31;
                JOptionPane.showConfirmDialog(null,"la cantidad de dias del mes es: " + numDias);
            break;
            
            
            
        }

    }
}