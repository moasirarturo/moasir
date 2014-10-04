
package ma.proyecto1.controller;


public class TestTodo {
    public static void main(String args[]){
        //primero creamos un Trabajador
        Trabajador t=new Trabajador(1,"moasir",40,200);
        Nomina n=new Nomina(t);
        n.pagarNomina();
    }
}
