import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList <Alumnos> alumnos = new ArrayList<>();
        int cantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos:"));
        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumnos alumno = new Alumnos();
            long legajo = Long.parseLong(JOptionPane.showInputDialog("Ingrese el legajo del alumno " + (i+1) + ":"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del alumno " + (i+1) + ":");
            alumno.setNombreCompleto(nombre);
            alumno.setLegajo(legajo);

            int cantidadDeNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas para el alumno " + (i+1) + ":"));
            while (cantidadDeNotas <= 0){
                JOptionPane.showInputDialog("Ingrese la cantidad de notas para el alumno "+(i+1)+":");
            }
            for (int j = 0; j < cantidadDeNotas; j++) {
                String catedra = JOptionPane.showInputDialog("Ingrese el nombre de la catedra "+(j+1)+" para el alumno "+(i+1)+":");
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la catedra "+catedra+" del alumno "+alumno.getNombreCompleto()+":"));
                alumno.agregarNota(catedra,nota);
            }
            alumnos.add(alumno);
        }

        for (Alumnos alumno: alumnos) {
            JOptionPane.showMessageDialog(null,"Alumno: "+alumno.getNombreCompleto()+"\nLegajo: "+alumno.getLegajo()+"\nPromedio: "+alumno.calcularPromedio());
        }

    }
}
