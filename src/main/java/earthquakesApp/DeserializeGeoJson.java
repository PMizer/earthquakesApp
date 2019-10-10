package earthquakesApp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import earthquakesApp.geoJson.EarthshakedJson;
import earthquakesApp.geoJson.Feature;

import java.util.List;

public class DeserializeGeoJson {

    public static List<Feature> deserializeGeoJson() {

        JsonObject response = new JsonObject();

        APIConnect apiConnect = new APIConnect();

        try {
            response = apiConnect.apiConnection();
        } catch (Exception e) {
            System.out.println("Problem with connection");
        }

        Gson gson = new Gson();

        EarthshakedJson shaked = gson.fromJson(response, EarthshakedJson.class);

        List<Feature> featured = shaked.getFeatureList();

        return featured;
    }
}
