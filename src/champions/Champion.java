
package champions;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

 
public class Champion {

    @SerializedName("type")
    private String type;
    @SerializedName("format")
    private String format;
    @SerializedName("version")
    private String version;
    @SerializedName("data")
    private Data data;
     
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("type")
    public String getType() {
        return type;
    }

    @SerializedName("type")
    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("format")
    public String getFormat() {
        return format;
    }

    @SerializedName("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @SerializedName("version")
    public String getVersion() {
        return version;
    }

    @SerializedName("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @SerializedName("data")
    public Data getData() {
        return data;
    }

    @SerializedName("data")
    public void setData(Data data) {
        this.data = data;
    }

    
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

     
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Champion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Champion) == false) {
            return false;
        }
        Champion rhs = ((Champion) other);
        return ((((((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
