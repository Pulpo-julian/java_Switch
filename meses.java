import javax.swing.JOptionPane;

public class meses {
    public static void main(String[] args) {
        String mes = JOptionPane.showInputDialog("ingrese un numero del 1 al 12 correspondiente al mes: ");
        
        switch(mes){
            case "1":
                JOptionPane.showConfirmDialog(null,"el mes es Enero");
            break;
            case "2":
                JOptionPane.showConfirmDialog(null,"el mes es Febrero");
            break;
            case "3":
                JOptionPane.showConfirmDialog(null,"el mes es Marzo");
            break;
            case "4":
                JOptionPane.showConfirmDialog(null,"el mes es Abril");
            break;
            case "5":
                JOptionPane.showConfirmDialog(null,"el mes es Mayo");
            break;
            case "6":
                JOptionPane.showConfirmDialog(null,"el mes es Junio");
            break;
            case "7":
                JOptionPane.showConfirmDialog(null,"el mes es Julio");
            break;
            case "8":
                JOptionPane.showConfirmDialog(null,"el mes es Agosto");
            break;
            case "9":
                JOptionPane.showConfirmDialog(null,"el mes es Septiembre");
            break;
            case "10":
                JOptionPane.showConfirmDialog(null,"el mes es Octubre");
            break;
            case "11":
                JOptionPane.showConfirmDialog(null,"el mes es Noviembre");
            break;
            case "12":
                JOptionPane.showConfirmDialog(null,"el mes es Diciembre");
            break;
            default:
                JOptionPane.showConfirmDialog(null,"el numero es incorrecto");
            break;
        }
        
    }
}
