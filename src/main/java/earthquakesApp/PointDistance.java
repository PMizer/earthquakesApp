package earthquakesApp;

public class PointDistance implements Comparable<PointDistance> {
    int distance;
    String title;
    double lat;
    double lon;

    public PointDistance(int distance, String title, double lat, double lon) {
        this.distance = distance;
        this.title = title;
        this.lat = lat;
        this.lon = lon;
    }

    public int getDistance() {
        return distance;
    }

    public String getTitle() {
        return title;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    @Override
    public String toString() {

        return title + " || " + distance;
    }

    @Override
    public int compareTo(PointDistance o) {
        return this.getDistance()-o.getDistance();
    }
}
