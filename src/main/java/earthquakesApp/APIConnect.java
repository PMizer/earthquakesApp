package earthquakesApp;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class APIConnect {

    public static JsonObject getEarthquakesApi(){

        String sURL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson";


        JsonElement root = null;
        URL url = null;
        try {
            url = new URL(sURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            URLConnection request = url.openConnection();
            request.connect();


            JsonParser jp = new JsonParser();
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return root.getAsJsonObject();
    }
}
