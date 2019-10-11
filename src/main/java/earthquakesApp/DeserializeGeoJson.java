package earthquakesApp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import earthquakesApp.geoJson.EarthshakedJson;
import earthquakesApp.geoJson.Feature;

import java.util.List;

public class DeserializeGeoJson {

    public static List<Feature> deserializeGeoJson() {

        JsonObject response;

        APIConnect apiConnect = new APIConnect();

        response = apiConnect.getEarthquakesApi();


        Gson gson = new Gson();

        EarthshakedJson shaked = gson.fromJson(response, EarthshakedJson.class);

        List<Feature> featured = shaked.getFeatureList();

        return featured;
    }
}
