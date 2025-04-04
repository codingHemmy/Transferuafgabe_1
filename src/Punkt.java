/**
 * Klasse Punkt: Repräsentiert einen Punkt mit den Attributen x und y.
 */
public class Punkt {
    protected double x;
    protected double y;

    /**
     * Konstruktor für einen Punkt.
     * @param x x-Koordinate
     * @param y y-Koordinate
     */
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gibt die x-Koordinate zurück.
     * @return x-Wert
     */
    public double getX() {
        return x;
    }

    /**
     * Gibt die y-Koordinate zurück.
     * @return y-Wert
     */
    public double getY() {
        return y;
    }
}