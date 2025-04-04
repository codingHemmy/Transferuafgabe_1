/**
 * Repräsentiert ein Quadrat, das von Punkt erbt.
 * Es wird zusätzlich der double-Wert deltaX gespeichert, der die halbe Seitenlänge darstellt.
 */
public class Quadrat extends Punkt implements Cloneable {
    protected double deltaX; // halbe Seitenlänge

    /**
     * Konstruktor zum Erzeugen eines Quadrats.
     *
     * @param x      x-Koordinate des Mittelpunkts
     * @param y      y-Koordinate des Mittelpunkts
     * @param deltaX halbe Seitenlänge
     */
    public Quadrat(double x, double y, double deltaX) {
        super(x, y);
        this.deltaX = deltaX;
    }

    /**
     * Berechnet den Umfang des Quadrats.
     * Die Seitenlänge beträgt 2 * deltaX, daher Umfang = 4 * (2 * deltaX) = 8 * deltaX.
     *
     * @return Umfang des Quadrats.
     */
    public double getUmfang() {
        return 8 * deltaX;
    }

    /**
     * Gibt eine String-Repräsentation des Quadrats zurück.
     *
     * @return String mit den Attributen x, y und deltaX.
     */
    @Override
    public String toString() {
        return "Quadrat [x=" + x + ", y=" + y + ", deltaX=" + deltaX + "]";
    }

    /**
     * Vergleicht dieses Quadrat mit einem anderen Objekt.
     * Zunächst werden x und y (aus Punkt) und anschließend deltaX verglichen.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return Einen negativen Wert, Null oder einen positiven Wert.
     */
    public int compareTo(Object obj) {
        if (obj == null || !(obj instanceof Quadrat)) {
            throw new IllegalArgumentException("Ungültiges Objekt für den Vergleich.");
        }
        Quadrat other = (Quadrat) obj;
        int cmp = super.compareTo(other);
        if (cmp != 0) {
            return cmp;
        }
        return Double.compare(this.deltaX, other.deltaX);
    }

    /**
     * Überprüft, ob dieses Quadrat gleich einem anderen Objekt ist.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return true, wenn beide Quadrate dieselben Attribute haben.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quadrat other = (Quadrat) obj;
        return Double.compare(deltaX, other.deltaX) == 0;
    }

    /**
     * Erstellt eine Kopie dieses Quadrats.
     *
     * @return Eine Kopie des Quadrats.
     */
    @Override
    public Object clone() {
        return new Quadrat(this.x, this.y, this.deltaX);
    }
}
