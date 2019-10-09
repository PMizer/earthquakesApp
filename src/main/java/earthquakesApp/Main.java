package earthquakesApp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import earthquakesApp.geoJson.EarthshakedJson;
import earthquakesApp.geoJson.Feature;
import earthquakesApp.geoJson.Geometry;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        deserializeGeoJson();
    }

    private static void deserializeGeoJson(){

        String response = "{\"type\":\"FeatureCollection\",\"metadata\":{\"generated\":1570553726000,\"url\":\"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_week.geojson\",\"title\":\"USGS Significant Earthquakes, Past Week\",\"status\":200,\"api\":\"1.8.1\",\"count\":2},\"features\":[{\"type\":\"Feature\",\"properties\":{\"mag\":3.54,\"place\":\"5km WSW of Colma, CA\",\"time\":1570290066700,\"updated\":1570553279832,\"tz\":-480,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/nc73286930\",\"detail\":\"https://earthquake.usgs.gov/earthquakes/feed/v1.0/detail/nc73286930.geojson\",\"felt\":12427,\"cdi\":4.2999999999999998,\"mmi\":5.6399999999999997,\"alert\":null,\"status\":\"reviewed\",\"tsunami\":0,\"sig\":623,\"net\":\"nc\",\"code\":\"73286930\",\"ids\":\",nc73286930,us70005r3k,\",\"sources\":\",nc,us,\",\"types\":\",dyfi,focal-mechanism,geoserve,moment-tensor,nearby-cities,origin,phase-data,scitech-link,shakemap,\",\"nst\":233,\"dmin\":0.030450000000000001,\"rms\":0.089999999999999997,\"gap\":97,\"magType\":\"mw\",\"type\":\"earthquake\",\"title\":\"M 3.5 - 5km WSW of Colma, CA\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-122.5145,37.659833300000003,7.4500000000000002]},\"id\":\"nc73286930\"},\n" +
                "{\"type\":\"Feature\",\"properties\":{\"mag\":5,\"place\":\"71km WNW of Talkeetna, Alaska\",\"time\":1570192083205,\"updated\":1570538292705,\"tz\":-540,\"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/ak019cqb6c9o\",\"detail\":\"https://earthquake.usgs.gov/earthquakes/feed/v1.0/detail/ak019cqb6c9o.geojson\",\"felt\":589,\"cdi\":4.9000000000000004,\"mmi\":3.7400000000000002,\"alert\":\"green\",\"status\":\"reviewed\",\"tsunami\":1,\"sig\":673,\"net\":\"ak\",\"code\":\"019cqb6c9o\",\"ids\":\",at00pyunyq,ak019cqb6c9o,us70005qnc,\",\"sources\":\",at,ak,us,\",\"types\":\",dyfi,geoserve,ground-failure,impact-link,losspager,moment-tensor,oaf,origin,phase-data,shakemap,\",\"nst\":null,\"dmin\":null,\"rms\":0.58999999999999997,\"gap\":null,\"magType\":\"mww\",\"type\":\"earthquake\",\"title\":\"M 5.0 - 71km WNW of Talkeetna, Alaska\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-151.52000000000001,62.478400000000001,90.700000000000003]},\"id\":\"ak019cqb6c9o\"}],\"bbox\":[-151.52,37.6598333,7.45,-122.5145,62.4784,90.7]}";

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