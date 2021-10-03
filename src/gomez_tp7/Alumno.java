package gomez_tp7;

import java.util.HashSet;

/**
 *
 * @author jon gomez
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia m){
        this.materias.add(m);
    }
    
    public int cantidadMaterias(){
        return this.materias.size();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Alumno){
            Alumno nueva = (Alumno)obj;
            return this.getLegajo() == nueva.getLegajo();
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.legajo;
        return hash;
    }

    @Override
    public String toString() {
        return "Leg:" + legajo + ", Nombre: " + nombre + ", " + apellido;
    }
}
