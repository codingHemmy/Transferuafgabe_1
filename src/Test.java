/**
 * Testklasse zur Erstellung von Objekten und Ausgabe der Daten.
 */
public class Test {

    /**
     * Gibt die Daten der übergebenen Objekte aus.
     * Für jedes Objekt werden die Koordinaten x und y ausgegeben.
     * Abhängig vom Typ wird zusätzlich der Umfang (bei Quadrat und Kreis) bzw. die Fläche (bei Rechteck und Kreis) ausgegeben.
     * @param objArray Array von Objekten vom Typ Punkt
     */
    public static void gebeDatenAus(Punkt[] objArray) {
        System.out.println("Anzahl der Objekte: " + objArray.length);
        for (Punkt p : objArray) {
            System.out.println("Objekt: x = " + p.getX() + ", y = " + p.getY());

            // Da Rechteck eine Unterklasse von Quadrat ist, erfolgt zuerst der Typvergleich
            if (p instanceof Rechteck) {
                Rechteck r = (Rechteck) p;
                System.out.println("Rechteck Fläche: " + r.getFlaeche());
            }
            if (p instanceof Kreis) {
                Kreis k = (Kreis) p;
                System.out.println("Kreis Umfang: " + k.getUmfang() + ", Fläche: " + k.getFlaeche());
            }
            // Falls das Objekt ein Quadrat ist, aber kein Rechteck (da Rechteck auch ein Quadrat ist)
            if (p instanceof Quadrat && !(p instanceof Rechteck)) {
                Quadrat q = (Quadrat) p;
                System.out.println("Quadrat Umfang: " + q.getUmfang());
            }
            System.out.println("-------------------------");
        }
    }

    /**
     * Main-Methode: Erstellt einzelne Objekte und ein Array von Objekten,
     * ruft die Methoden zur Berechnung und Ausgabe auf.
     * @param args Kommandozeilenargumente (werden nicht genutzt)
     */
    public static void main(String[] args) {
        // Erzeuge einzelne Objekte
        Quadrat q1 = new Quadrat(0, 0, 2);       // Quadrat mit Seitenlänge 4 (Umfang 16)
        Rechteck r1 = new Rechteck(1, 1, 3, 2);   // Rechteck mit Seitenlängen 6 und 4 (Fläche 24)
        Kreis k1 = new Kreis(2, 2, 3);             // Kreis mit Radius 3

        System.out.println("Einzelne Objekte:");
        System.out.println("Quadrat Umfang: " + q1.getUmfang());
        System.out.println("Rechteck Fläche: " + r1.getFlaeche());
        System.out.println("Kreis Umfang: " + k1.getUmfang());
        System.out.println("Kreis Fläche: " + k1.getFlaeche());

        System.out.println("\nArray von Objekten:");
        // Erstelle ein Array mit fünf Objekten (Kombination aus Quadrat, Rechteck und Kreis)
        Punkt[] objArray = new Punkt[5];
        objArray[0] = q1;
        objArray[1] = r1;
        objArray[2] = k1;
        objArray[3] = new Quadrat(3, 3, 1.5);   // weiteres Quadrat
        objArray[4] = new Kreis(4, 4, 2);         // weiterer Kreis

        // Übergabe des Arrays an die Methode gebeDatenAus
        gebeDatenAus(objArray);
    }
}