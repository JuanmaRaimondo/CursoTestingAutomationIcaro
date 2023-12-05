package Pruebas;

public class PruebasC {
    protected Integer id;
    protected String name;
    protected String materia;
    protected Boolean aprobado;

    public PruebasC(Integer id, String name, String materia, Boolean aprobado){
        this.id = id;
        this.name = name;
        this.materia = materia;
        this.aprobado = aprobado;
    }
    public void print(){
        System.out.println("el id" + id + "Su nombre es " + name + "la materia que curso es " + materia + " la materia esta aprobada" + aprobado );
    }
}
