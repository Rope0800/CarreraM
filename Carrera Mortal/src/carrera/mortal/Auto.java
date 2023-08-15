
package carrera.mortal;


public class Auto {
    private String color;
    private String patente;
    private double combustible;
    private Rueda[] ruedas;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedas = new Rueda[4];
        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda("Rueda " + (i + 1));
        }
    }

    public void avanzar(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("Avanzando " + metros + " metros");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void retroceder(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("Retrocediendo " + metros + " metros");
        } else {
            System.out.println("No hay suficiente combustible para retroceder.");
        }
    }

    public void llenarTanque() {
        combustible = 50.0;
        System.out.println("Tanque llenado. Combustible: " + combustible + " litros");
    }

    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
        System.out.println("Ruedas infladas a 28.0 PSI");
    }

    public void desinflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
        System.out.println("Ruedas desinfladas en -0.5 PSI");
    }
}

