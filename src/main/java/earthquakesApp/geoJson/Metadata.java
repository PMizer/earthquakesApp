
package earthquakesApp.geoJson;


import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("generated")
    private Long mGenerated;
    public Long getGenerated() {
        return mGenerated;
    }

    @SerializedName("url")
    private String mUrl;
    public String getUrl() {
        return mUrl;
    }

    @SerializedName("title")
    private String mTitle;
    public String getTitle() {
        return mTitle;
    }

    @SerializedName("status")
    private Long mStatus;
    public Long getStatus() {
        return mStatus;
    }

    @SerializedName("api")
    private String mApi;
    public String getApi() {
        return mApi;
    }

    @SerializedName("count")
    private Long mCount;
    public Long getCount() {
        return mCount;
    }














}
