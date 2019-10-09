package earthquakesApp.geoJson;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("mag")
    private Double mMag;
    public Double getMag() {
        return mMag;
    }

    @SerializedName("place")
    private String mPlace;
    public String getPlace() {
        return mPlace;
    }

    @SerializedName("time")
    private Long mTime;
    public Long getTime() {
        return mTime;
    }

    @SerializedName("updated")
    private Long mUpdated;
    public Long getUpdated() {
        return mUpdated;
    }

    @SerializedName("tz")
    private Long mTz;
    public Long getTz() {
        return mTz;
    }

    @SerializedName("url")
    private String mUrl;
    public String getUrl() {
        return mUrl;
    }

    @SerializedName("detail")
    private String mDetail;
    public String getDetail() {
        return mDetail;
    }

    @SerializedName("felt")
    private Long mFelt;
    public Long getFelt() {
        return mFelt;
    }

    @SerializedName("cdi")
    private Double mCdi;
    public Double getCdi() {
        return mCdi;
    }

    @SerializedName("mmi")
    private Double mMmi;
    public Double getMmi() {
        return mMmi;
    }

    @SerializedName("alert")
    private Object mAlert;
    public Object getAlert() {
        return mAlert;
    }

    @SerializedName("status")
    private String mStatus;
    public String getStatus() {
        return mStatus;
    }

    @SerializedName("tsunami")
    private Long mTsunami;
    public Long getTsunami() {
        return mTsunami;
    }

    @SerializedName("sig")
    private Long mSig;
    public Long getSig() {
        return mSig;
    }

    @SerializedName("net")
    private String mNet;
    public String getNet() {
        return mNet;
    }

    @SerializedName("code")
    private String mCode;
    public String getCode() {
        return mCode;
    }

    @SerializedName("ids")
    private String mIds;
    public String getIds() {
        return mIds;
    }

    @SerializedName("sources")
    private String mSources;
    public String getSources() {
        return mSources;
    }

    @SerializedName("types")
    private String mTypes;
    public String getTypes() {
        return mTypes;
    }

    @SerializedName("nst")
    private Long mNst;
    public Long getNst() {
        return mNst;
    }

    @SerializedName("dmin")
    private Double mDmin;
    public Double getDmin() {
        return mDmin;
    }

    @SerializedName("rms")
    private Double mRms;
    public Double getRms() {
        return mRms;
    }

    @SerializedName("gap")
    private Long mGap;
    public Long getGap() {
        return mGap;
    }

    @SerializedName("magType")
    private String mMagType;
    public String getMagType() {
        return mMagType;
    }

    @SerializedName("type")
    private String mType;
    public String getType() {
        return mType;
    }

    @SerializedName("title")
    private String mTitle;
    public String getTitle() {
        return mTitle;
    }

}
