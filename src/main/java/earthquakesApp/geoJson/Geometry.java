
package earthquakesApp.geoJson;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Geometry {

    @SerializedName("type")
    private String mType;
    public String getType() {
        return mType;
    }

    @SerializedName("coordinates")
    private List<Double> mCoordinates;
    public List<Double> getCoordinates() {
        return mCoordinates;
    }

}
