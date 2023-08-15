
package carrera.mortal;


public class CarreraMortal {

    
    public static void main(String[] args) {
      
        Auto miAuto = new Auto("Rojo", "ABC123");
        
        miAuto.inflarRuedas();
        miAuto.avanzar(30);
        miAuto.retroceder(20);
        miAuto.llenarTanque();
        miAuto.desinflarRuedas();
    }
}