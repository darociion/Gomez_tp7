package gomez_tp7;

/**
 *
 * @author jon gomez
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Materia){
            Materia nueva = (Materia)obj;
            return this.getIdMateria() == nueva.getIdMateria();
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idMateria;
        return hash;
    }

    @Override
    public String toString() {
        return "Cod:" + idMateria + ", Nombre: " + nombre + ", Año: " + anio;
    }
}
