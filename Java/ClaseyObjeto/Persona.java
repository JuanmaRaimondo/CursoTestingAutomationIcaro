package ClaseyObjeto;

//Aca creo los atributos o caracteristicas generales de una persona
public class Persona {
  private  String nombre;
    private Double altura;
    private Integer edad;
//Aca defino que los atributos que cree previamente son iguales que los definidos previamente pero
// le damos distintos tipos de datos en un metodo que luego utilizamos en el objeto donde completamos los atributos
// con sus respectivos valores.
    public Persona(String _nombre, Double _altura, Integer _edad){
        this.nombre = _nombre;
        this.altura = _altura;
        this.edad = _edad;
    }
    //Aca creo un metodo que nos diga los valores ingresados en los atributos de persona
    public void imprimir(){
        System.out.println(" El nombre es " + nombre);
        System.out.println(" La altura es " + altura);
        System.out.println(" La edad es " + edad);
    }
}
