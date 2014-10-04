
package ma.proyecto1.controller;

public class Trabajador {

private int id;
private String nombre;
private int horasTrabajadas;
private float sueldobase;

public Trabajador (){
}

    public Trabajador(int id, String nombre, int horasTrabajadas, float sueldobase) {
        this.id = id;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldobase = sueldobase;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }
 

}
