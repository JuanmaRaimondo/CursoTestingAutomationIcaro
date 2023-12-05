package ClaseyObjeto;

public class Prueba {
    private final Integer id;
    private final String nombre;

    public Prueba(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    public void imprimi(){
        System.out.println("El id es " + id);
        System.out.println("El nombre de la materia es " + nombre);
    }
}
