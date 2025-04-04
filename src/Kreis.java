/**
 * Repräsentiert einen Kreis, der von Punkt erbt.
 * Zusätzlich wird der Radius gespeichert.
 */
public class Kreis extends Punkt implements Cloneable {
    protected double radius;

    /**
     * Konstruktor zum Erzeugen eines Kreises.
     *
     * @param x      x-Koordinate des Mittelpunkts
     * @param y      y-Koordinate des Mittelpunkts
     * @param radius Radius des Kreises
     */
    public Kreis(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Berechnet den Umfang des Kreises.
     * Umfang = 2 * PI * radius.
     *
     * @return Umfang des Kreises.
     */
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    /**
     * Berechnet die Fläche des Kreises.
     * Fläche = PI * radius^2.
     *
     * @return Fläche des Kreises.
     */
    public double getFlaeche() {
        return Math.PI * radius * radius;
    }

    /**
     * Gibt eine String-Repräsentation des Kreises zurück.
     *
     * @return String mit den Attributen x, y und radius.
     */
    @Override
    public String toString() {
        return "Kreis [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

    /**
     * Vergleicht diesen Kreis mit einem anderen Objekt.
     * Zunächst werden x und y (aus Punkt) und anschließend der radius verglichen.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return Einen negativen Wert, Null oder einen positiven Wert.
     */
    public int compareTo(Object obj) {
        if (obj == null || !(obj instanceof Kreis)) {
            throw new IllegalArgumentException("Ungültiges Objekt für den Vergleich.");
        }
        Kreis other = (Kreis) obj;
        int cmp = super.compareTo(other);
        if (cmp != 0) {
            return cmp;
        }
        return Double.compare(this.radius, other.radius);
    }

    /**
     * Überprüft, ob dieser Kreis gleich einem anderen Objekt ist.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return true, wenn beide Kreise dieselben Attribute haben.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Kreis other = (Kreis) obj;
        return Double.compare(radius, other.radius) == 0;
    }

    /**
     * Erstellt eine Kopie dieses Kreises.
     *
     * @return Eine Kopie des Kreises.
     */
    @Override
    public Object clone() {
        return new Kreis(this.x, this.y, this.radius);
    }
}
