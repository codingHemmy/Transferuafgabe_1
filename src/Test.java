/**
 * Testklasse zur Erzeugung und Demonstration der Funktionalität
 * der Klassen Quadrat, Rechteck und Kreis.
 */
public class Test {
    public static void main(String[] args) {
        // Erzeuge einzelne Objekte
        Quadrat q = new Quadrat(0.0, 0.0, 5.0);
        Rechteck r = new Rechteck(1.0, 1.0, 3.0, 4.0);
        Kreis k = new Kreis(2.0, 2.0, 6.0);

        // Ausgabe der Einzelobjekte und deren Berechnungen
        System.out.println(q.toString());
        System.out.println("Quadrat Umfang: " + q.getUmfang());
        System.out.println();

        System.out.println(r.toString());
        System.out.println("Rechteck Fläche: " + r.getFlaeche());
        System.out.println();

        System.out.println(k.toString());
        System.out.println("Kreis Umfang: " + k.getUmfang());
        System.out.println("Kreis Fläche: " + k.getFlaeche());
        System.out.println("\n---------------------------\n");

        // Erzeuge ein Array mit fünf Objekten (Mischung aus Quadrat, Rechteck und Kreis)
        Punkt[] objekte = new Punkt[5];
        objekte[0] = new Quadrat(0.0, 0.0, 2.5);
        objekte[1] = new Rechteck(1.0, 1.0, 3.0, 4.0);
        objekte[2] = new Kreis(2.0, 2.0, 5.0);
        objekte[3] = new Quadrat(3.0, 3.0, 1.5);
        objekte[4] = new Kreis(4.0, 4.0, 3.0);

        // Übergabe des Arrays an die Methode zur Ausgabe
        gebeDatenAus(objekte);
    }

    /**
     * Gibt für jedes Objekt im Array dessen Attribute und, je nach Typ,
     * den Umfang (bei Quadrat und Kreis) bzw. die Fläche (bei Rechteck und Kreis)
     * in der Konsole aus.
     *
     * @param objekte Array von Objekten, die von Punkt abgeleitet sind.
     */
    public static void gebeDatenAus(Punkt[] objekte) {
        System.out.println("Anzahl der Objekte: " + objekte.length);
        for (Punkt p : objekte) {
            System.out.println(p.toString());
            // Überprüfe den Typ und rufe die entsprechenden Methoden auf
            if (p instanceof Quadrat && !(p instanceof Rechteck)) {
                Quadrat temp = (Quadrat) p;
                System.out.println("Quadrat Umfang: " + temp.getUmfang());
            }
            if (p instanceof Rechteck) {
                Rechteck temp = (Rechteck) p;
                System.out.println("Rechteck Fläche: " + temp.getFlaeche());
            }
            if (p instanceof Kreis) {
                Kreis temp = (Kreis) p;
                System.out.println("Kreis Umfang: " + temp.getUmfang());
                System.out.println("Kreis Fläche: " + temp.getFlaeche());
            }
            System.out.println("---------------------------");
        }
    }
}
