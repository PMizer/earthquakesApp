package earthquakesApp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import earthquakesApp.geoJson.EarthshakedJson;
import earthquakesApp.geoJson.Feature;



import java.util.List;



public class Main {
    public static void main(String[] args){
        deserializeGeoJson();
    }

    private static void deserializeGeoJson(){

        JsonObject response = new JsonObject();

        APIConnect apiConnect = new APIConnect();
        try{
             response = apiConnect.apiConnection();
        }
        catch (Exception e){
            System.out.println("Problem with connection");
        }

        Gson gson = new Gson();

         EarthshakedJson shaked = gson.fromJson(response, EarthshakedJson.class);

        List<Feature> featured =  shaked.getFeatureList();

        float lat1 = 40.730610f;
        float lon1 = -73.935242f;

        DistanceCalculator distanceCalculator = new DistanceCalculator();

        for(Feature f : featured){
            System.out.println(f.getProperties().getPlace());;
            List<Double> coords =  f.getGeometry().getCoordinates();
            System.out.println(distanceCalculator.distance(lat1,coords.get(0),lon1,coords.get(1)));

        }

    }
}