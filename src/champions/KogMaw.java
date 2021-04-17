
package champions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

 
 
 
 
 
 
 
 
 
 
 
 
 
 
public class KogMaw {

    @SerializedName("version")
    private String version;
    @SerializedName("id")
    private String id;
    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("title")
    private String title;
    @SerializedName("blurb")
    private String blurb;
    @SerializedName("info")
    private Info__60 info;
    @SerializedName("image")
    private Image__60 image;
    @SerializedName("tags")
    private List<String> tags = new ArrayList<String>();
    @SerializedName("partype")
    private String partype;
    @SerializedName("stats")
    private Stats__60 stats;
     
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("version")
    public String getVersion() {
        return version;
    }

    @SerializedName("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @SerializedName("id")
    public String getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(String id) {
        this.id = id;
    }

    @SerializedName("key")
    public String getKey() {
        return key;
    }

    @SerializedName("key")
    public void setKey(String key) {
        this.key = key;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("title")
    public String getTitle() {
        return title;
    }

    @SerializedName("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("blurb")
    public String getBlurb() {
        return blurb;
    }

    @SerializedName("blurb")
    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    @SerializedName("info")
    public Info__60 getInfo() {
        return info;
    }

    @SerializedName("info")
    public void setInfo(Info__60 info) {
        this.info = info;
    }

    @SerializedName("image")
    public Image__60 getImage() {
        return image;
    }

    @SerializedName("image")
    public void setImage(Image__60 image) {
        this.image = image;
    }

    @SerializedName("tags")
    public List<String> getTags() {
        return tags;
    }

    @SerializedName("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @SerializedName("partype")
    public String getPartype() {
        return partype;
    }

    @SerializedName("partype")
    public void setPartype(String partype) {
        this.partype = partype;
    }

    @SerializedName("stats")
    public Stats__60 getStats() {
        return stats;
    }

    @SerializedName("stats")
    public void setStats(Stats__60 stats) {
        this.stats = stats;
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
        sb.append(KogMaw.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("blurb");
        sb.append('=');
        sb.append(((this.blurb == null)?"<null>":this.blurb));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("partype");
        sb.append('=');
        sb.append(((this.partype == null)?"<null>":this.partype));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.partype == null)? 0 :this.partype.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.blurb == null)? 0 :this.blurb.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KogMaw) == false) {
            return false;
        }
        KogMaw rhs = ((KogMaw) other);
        return (((((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.partype == rhs.partype)||((this.partype!= null)&&this.partype.equals(rhs.partype))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.blurb == rhs.blurb)||((this.blurb!= null)&&this.blurb.equals(rhs.blurb))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))));
    }

}
