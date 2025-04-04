/**
 * Klasse Kreis: Unterklasse von Punkt.
 * Speichert zusätzlich den Radius und berechnet Umfang sowie Fläche.
 */
public class Kreis extends Punkt {
    private double radius;

    /**
     * Konstruktor für einen Kreis.
     * @param x x-Koordinate (von Punkt)
     * @param y y-Koordinate (von Punkt)
     * @param radius Radius des Kreises
     */
    public Kreis(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Berechnet und gibt die Fläche des Kreises zurück.
     * Formel: PI * radius².
     * @return Fläche des Kreises
     */
    public double getFlaeche() {
        return Math.PI * radius * radius;
    }

    /**
     * Berechnet und gibt den Umfang des Kreises zurück.
     * Formel: 2 * PI * radius.
     * @return Umfang des Kreises
     */
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }
}
