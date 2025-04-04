/**
 * Klasse Rechteck: Unterklasse von Quadrat.
 * Nutzt x und y von Punkt, deltaX von Quadrat und speichert zusätzlich deltaY.
 */
public class Rechteck extends Quadrat {
    private double deltaY; // Hälfte der anderen Seitenlänge

    /**
     * Konstruktor für ein Rechteck.
     * @param x x-Koordinate (von Punkt)
     * @param y y-Koordinate (von Punkt)
     * @param deltaX Hälfte der einen Seitenlänge (von Quadrat)
     * @param deltaY Hälfte der anderen Seitenlänge
     */
    public Rechteck(double x, double y, double deltaX, double deltaY) {
        super(x, y, deltaX);
        this.deltaY = deltaY;
    }

    /**
     * Berechnet und gibt die Fläche des Rechtecks zurück.
     * Die vollen Seitenlängen sind 2 * deltaX und 2 * deltaY, daher Fläche = (2 * deltaX) * (2 * deltaY).
     * @return Fläche des Rechtecks
     */
    public double getFlaeche() {
        return (2 * deltaX) * (2 * deltaY);
    }
}