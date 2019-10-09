package earthquakesApp.geoJson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EarthshakedJson {

    @SerializedName("type")
    private String mType;
    public String getType() {
        return mType;
    }

    @SerializedName("metadata")
    private Metadata mMetadata;
    public Metadata getMetadata() {
        return mMetadata;
    }

    @SerializedName("features")
    private List<Feature> mFeatureList;
    public List<Feature> getFeatureList() {
        return mFeatureList;
    }

    @SerializedName("bbox")
    private List<Double> mBboxList;
    public List<Double> getBboxList() {
        return mBboxList;
    }
}
