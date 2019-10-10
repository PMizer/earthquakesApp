package earthquakesApp;

import earthquakesApp.geoJson.Feature;
import java.util.List;

import static earthquakesApp.DeserializeGeoJson.deserializeGeoJson;
import static earthquakesApp.DistanceCalculator.distance;

public class Main {
    public static void main(String[] args){
        float lat1 = 40.730610f;
        float lon1 = -73.935242f;

        List<Feature> featured = deserializeGeoJson();

        for(Feature f : featured){
            System.out.println(f.getProperties().getPlace());;
            List<Double> coords =  f.getGeometry().getCoordinates();
            System.out.println(distance(lat1,coords.get(0),lon1,coords.get(1)));

        }
    }
}