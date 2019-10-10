
package earthquakesApp.geoJson;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Feature {

    @SerializedName("type")
    private transient String mType;
    public String getType() {
        return mType;
    }

    @SerializedName("properties")
    private Properties mProperties;
    public Properties getProperties() {
        return mProperties;
    }

    @SerializedName("geometry")
    private Geometry mGeometry;
    public Geometry getGeometry() {
        return mGeometry;
    }

    @SerializedName("id")
    private transient String mId;
    public String getId() {
        return mId;
    }

}
