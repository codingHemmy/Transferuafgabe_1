/**
 * Repräsentiert einen Punkt im 2D-Raum.
 */
public class Punkt implements Cloneable {
    protected double x;
    protected double y;

    /**
     * Konstruktor zum Setzen der Koordinaten.
     *
     * @param x x-Koordinate
     * @param y y-Koordinate
     */
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gibt eine String-Repräsentation des Punktes zurück.
     *
     * @return String mit den Attributen x und y.
     */
    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }

    /**
     * Vergleicht diesen Punkt mit einem anderen Objekt.
     * Zunächst werden x- und y-Werte verglichen.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return Einen negativen Wert, Null oder einen positiven Wert.
     */
    public int compareTo(Object obj) {
        if (obj == null || !(obj instanceof Punkt)) {
            throw new IllegalArgumentException("Ungültiges Objekt für den Vergleich.");
        }
        Punkt other = (Punkt) obj;
        int cmp = Double.compare(this.x, other.x);
        if (cmp != 0) {
            return cmp;
        }
        return Double.compare(this.y, other.y);
    }

    /**
     * Überprüft, ob dieses Objekt gleich einem anderen ist.
     *
     * @param obj Das zu vergleichende Objekt.
     * @return true, wenn beide Punkte dieselben Koordinaten haben.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Punkt other = (Punkt) obj;
        return Double.compare(x, other.x) == 0 &&
                Double.compare(y, other.y) == 0;
    }

    /**
     * Erstellt eine Kopie dieses Punktes.
     *
     * @return Eine Kopie des Punktes.
     */
    @Override
    public Object clone() {
        try {
            return (Punkt) super.clone();
        } catch (CloneNotSupportedException e) {
            // Da wir Cloneable implementieren, sollte dies nicht passieren
            return new Punkt(x, y);
        }
    }
}
