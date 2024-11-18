import javax.swing.*;
import java.util.ArrayList;

public class Alumnos{
    private String nombreCompleto;
    private long legajo;
    private ArrayList <Notas> notas;

    public Alumnos() {
    }

    public Alumnos(String nombreCompleto, long legajo, ArrayList<Notas> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Notas> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Notas> notas) {
        this.notas = notas;
    }

    public void agregarNota(String catedra, double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(new Notas(catedra, nota));
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        for (Notas nota: notas) {
            suma += nota.getNotaExamen();
        }
        return notas.size() == 0 ? 0 : suma / notas.size();
    }
}
