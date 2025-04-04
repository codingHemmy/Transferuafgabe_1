/**
 * Repräsentiert ein Rechteck, das von Quadrat erbt.
 * Neben x, y und deltaX wird zusätzlich deltaY gespeichert,
 * welches die halbe Länge der anderen Seite darstellt.
 */
public class Rechteck extends Quadrat implements Cloneable {
    protected double deltaY; // halbe Länge der anderen Seite

    /**
     * Konstruktor zum Erzeugen eines Rechtecks.
     *
     * @param x      x-Koordinate des Mittelpunkts
     * @param y      y-Koordinate des Mittelpunkts
     * @param deltaX halbe Seitenlänge (erste Seite)
     * @param deltaY halbe Seitenlänge (zweite Seite)
     */
    public Rechteck(double x, double y, double deltaX, double deltaY) {
        super(x, y, deltaX);
        this.deltaY = deltaY;
    }

    /**
     * Berechnet die Fläche des Rechtecks.
     * Volle Seitenlängen: 2*deltaX und 2*deltaY, daher Fläche = 4 * deltaX * deltaY.
     *
     * @return Fläche des Rechtecks.
     */
    public double getFlaeche() {
        return 4 * deltaX * deltaY;
    }

    /**
     * Gibt eine String-Repräsentation des Rechtecks zurück.
     *
     * @return String mit den Attributen x, y, deltaX und deltaY.
     */
    @Override
    public String toString() {
        return "Rechteck [x=" + x + ", y=" + y + ", deltaX=" + deltaX + ", deltaY=" + deltaY + "]";
    }

    /**
     * Vergleicht dieses Rechteck mit einem anderen Objekt.
     * Zunächst werden x, y und deltaX (aus Quadrat) und anschließend deltaY verglichen.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return Einen negativen Wert, Null oder einen positiven Wert.
     */
    public int compareTo(Object obj) {
        if (obj == null || !(obj instanceof Rechteck)) {
            throw new IllegalArgumentException("Ungültiges Objekt für den Vergleich.");
        }
        Rechteck other = (Rechteck) obj;
        int cmp = super.compareTo(other);
        if (cmp != 0) {
            return cmp;
        }
        return Double.compare(this.deltaY, other.deltaY);
    }

    /**
     * Überprüft, ob dieses Rechteck gleich einem anderen Objekt ist.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return true, wenn beide Rechtecke dieselben Attribute haben.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rechteck other = (Rechteck) obj;
        return Double.compare(deltaY, other.deltaY) == 0;
    }

    /**
     * Erstellt eine Kopie dieses Rechtecks.
     *
     * @return Eine Kopie des Rechtecks.
     */
    @Override
    public Object clone() {
        return new Rechteck(this.x, this.y, this.deltaX, this.deltaY);
    }
}
