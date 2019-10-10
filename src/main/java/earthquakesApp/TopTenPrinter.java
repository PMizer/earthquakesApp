package earthquakesApp;

import earthquakesApp.geoJson.Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static earthquakesApp.DeserializeGeoJson.deserializeGeoJson;
import static earthquakesApp.DistanceCalculator.distance;

public class TopTenPrinter {
    float lat1;
    float lon1;

    public TopTenPrinter(float lat1, float lon1) {
        this.lat1 = lat1;
        this.lon1 = lon1;
    }

    public void topTenPrint(){
        List<Feature> featured = deserializeGeoJson();

        ArrayList<PointDistance> topPoints = new ArrayList<>();

        for(Feature f : featured){
            List<Double> coords =  f.getGeometry().getCoordinates();
            int distanceFromPoint =  distance(lat1,coords.get(0),lon1,coords.get(1));
            PointDistance pointDistance1 = new PointDistance(distanceFromPoint,f.getProperties().getTitle(),coords.get(0),coords.get(1));
            topPoints.add(pointDistance1);
        }
        Collections.sort(topPoints);

        int x = 10;
        if(topPoints.size()<=10){
            x = topPoints.size();
        }
        for(int i = 0 ; i < x ; i++){
            if(i>0) {
                if (topPoints.get(i).getLat() == topPoints.get(i - 1).getLat() && topPoints.get(i).getLon() == topPoints.get(i - 1).getLon()) {
                    continue;
                }
            }
            System.out.println(topPoints.get(i));
        }
    }
}
