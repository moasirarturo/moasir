

package ma.proyecto1.controller;


public class Nomina {
   private Trabajador t;

    public Nomina(Trabajador t) {
        this.t = t;
    }

    public Nomina(){}
   
      public float pagarNomina(){
          float pago=t.getHorasTrabajadas()*t.getSueldobase();
       System.out.println("Se pago la nomina de "+t.getNombre()+" por "+pago);
       return pago;
   }
   
}
