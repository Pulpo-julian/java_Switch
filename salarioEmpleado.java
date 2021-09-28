
import javax.swing.JOptionPane;

public class salarioEmpleado {
    public static void main(String[] args) {
        int valorH = 0, horasExt = 0, horasTra = 0, valorHorasTra = 0;
        double valorHorasExt = 0, devengado = 0;
        String clase = JOptionPane.showInputDialog("Elija la clase a la que pertenece"
                + "'a' 'b' 'c' 'd'"
        );
        
        int horasIng = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas trabajadas"));
        
        
        if(horasIng >= 48){
            horasExt = horasIng - 48;
        }
        
        switch(clase){
            case "a":
                valorH = 7_500;
                horasTra = horasIng - horasExt;
                valorHorasTra = horasTra * valorH;
                valorHorasExt = horasExt * (valorH + (valorH * 0.25));
                devengado = valorHorasExt + valorHorasTra;
                JOptionPane.showConfirmDialog(null, "su clase de trabajador es: " + clase);
                JOptionPane.showConfirmDialog(null, "el valor de su hora es: " + valorH);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas que trabajo es: " + horasTra);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas extras es: " + horasExt);
                JOptionPane.showConfirmDialog(null, "el valor de las horas trabajadas es de: " + valorHorasTra);
                JOptionPane.showConfirmDialog(null, "el valor de las horas extras es de: " + valorHorasExt);
                JOptionPane.showConfirmDialog(null, "el total devengado es de " + devengado);
            break;
            case "b":
                valorH = 8_000;
                horasTra = horasIng - horasExt;
                valorHorasTra = horasTra * valorH;
                valorHorasExt = horasExt * (valorH + (valorH * 0.25));
                devengado = valorHorasExt + valorHorasTra;
                JOptionPane.showConfirmDialog(null, "su clase de trabajador es: " + clase);
                JOptionPane.showConfirmDialog(null, "el valor de su hora es: " + valorH);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas que trabajo es: " + horasTra);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas extras es: " + horasExt);
                JOptionPane.showConfirmDialog(null, "el valor de las horas trabajadas es de: " + valorHorasTra);
                JOptionPane.showConfirmDialog(null, "el valor de las horas extras es de: " + valorHorasExt);
                JOptionPane.showConfirmDialog(null, "el total devengado es de " + devengado);
            break;
            case "c":
                valorH = 8_500;
                horasTra = horasIng - horasExt;
                valorHorasTra = horasTra * valorH;
                valorHorasExt = horasExt * (valorH + (valorH * 0.25));
                devengado = valorHorasExt + valorHorasTra;
                JOptionPane.showConfirmDialog(null, "su clase de trabajador es: " + clase);
                JOptionPane.showConfirmDialog(null, "el valor de su hora es: " + valorH);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas que trabajo es: " + horasTra);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas extras es: " + horasExt);
                JOptionPane.showConfirmDialog(null, "el valor de las horas trabajadas es de: " + valorHorasTra);
                JOptionPane.showConfirmDialog(null, "el valor de las horas extras es de: " + valorHorasExt);
                JOptionPane.showConfirmDialog(null, "el total devengado es de " + devengado);
            break;
            case "d":
                valorH = 9_000;
                horasTra = horasIng - horasExt;
                valorHorasTra = horasTra * valorH;
                valorHorasExt = horasExt * (valorH + (valorH * 0.25));
                devengado = valorHorasExt + valorHorasTra;
                JOptionPane.showConfirmDialog(null, "su clase de trabajador es: " + clase);
                JOptionPane.showConfirmDialog(null, "el valor de su hora es: " + valorH);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas que trabajo es: " + horasTra);
                JOptionPane.showConfirmDialog(null, "la cantidad de horas extras es: " + horasExt);
                JOptionPane.showConfirmDialog(null, "el valor de las horas trabajadas es de: " + valorHorasTra);
                JOptionPane.showConfirmDialog(null, "el valor de las horas extras es de: " + valorHorasExt);
                JOptionPane.showConfirmDialog(null, "el total devengado es de " + devengado);
            break;
            default:
                JOptionPane.showConfirmDialog(null, "ingrese una clase correcta");
            break;  
        }
        
    }
}
