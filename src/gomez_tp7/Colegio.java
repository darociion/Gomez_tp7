package gomez_tp7;

/**
 *
 * @author jon gomez
 */
public class Colegio {

    public static void main(String[] args) {
        //Instancio 3 materias
        Materia m1 = new Materia(1,"Ingles",1);
        Materia m2 = new Materia(2,"Matemáticas",1);
        Materia m3 = new Materia(3,"Laboratorio 1",1);
        
        //Instancio 2 alumnos
        Alumno a1 = new Alumno(1001,"López","Martin");
        Alumno a2 = new Alumno(1002,"Martínez","Brenda");
        
        //Inscribo al alumno 1 en las 3 materias creadas
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        //Inscribo al alumno 2 en las 3 materias creadas
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        
        //Intento re-inscribir al alumno 2 en Laboratorio 1
        a2.agregarMateria(m3);
        
        //Muestro por pantalla la cantidad de materias en las que estan inscriptos el alumno 1 y 2
        System.out.println("El alumno 1 esta inscripto en " + a1.cantidadMaterias());
        System.out.println("La alumna 2 esta inscripto en " + a2.cantidadMaterias());
    }
    
}
