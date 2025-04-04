/**
 * Klasse Quadrat: Unterklasse von Punkt.
 * Speichert zusätzlich den Wert deltaX, der die Hälfte der Seitenlänge repräsentiert.
 */
public class Quadrat extends Punkt {
    protected double deltaX; // Hälfte der Seitenlänge

    /**
     * Konstruktor für ein Quadrat.
     * @param x x-Koordinate (von Punkt)
     * @param y y-Koordinate (von Punkt)
     * @param deltaX Hälfte der Seitenlänge
     */
    public Quadrat(double x, double y, double deltaX) {
        super(x, y);
        this.deltaX = deltaX;
    }

    /**
     * Berechnet und gibt den Umfang des Quadrats zurück.
     * Die volle Seitenlänge ist 2 * deltaX, daher ist der Umfang 4 * (2 * deltaX).
     * @return Umfang des Quadrats
     */
    public double getUmfang() {
        return 4 * (2 * deltaX);
    }
}
