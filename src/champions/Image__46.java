
package champions;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

 
 
 
 
 
 
 
 
 
 
public class Image__46 {

    @SerializedName("full")
    private String full;
    @SerializedName("sprite")
    private String sprite;
    @SerializedName("group")
    private String group;
    @SerializedName("x")
    private Integer x;
    @SerializedName("y")
    private Integer y;
    @SerializedName("w")
    private Integer w;
    @SerializedName("h")
    private Integer h;
     
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("full")
    public String getFull() {
        return full;
    }

    @SerializedName("full")
    public void setFull(String full) {
        this.full = full;
    }

    @SerializedName("sprite")
    public String getSprite() {
        return sprite;
    }

    @SerializedName("sprite")
    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    @SerializedName("group")
    public String getGroup() {
        return group;
    }

    @SerializedName("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @SerializedName("x")
    public Integer getX() {
        return x;
    }

    @SerializedName("x")
    public void setX(Integer x) {
        this.x = x;
    }

    @SerializedName("y")
    public Integer getY() {
        return y;
    }

    @SerializedName("y")
    public void setY(Integer y) {
        this.y = y;
    }

    @SerializedName("w")
    public Integer getW() {
        return w;
    }

    @SerializedName("w")
    public void setW(Integer w) {
        this.w = w;
    }

    @SerializedName("h")
    public Integer getH() {
        return h;
    }

    @SerializedName("h")
    public void setH(Integer h) {
        this.h = h;
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
        sb.append(Image__46 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("full");
        sb.append('=');
        sb.append(((this.full == null)?"<null>":this.full));
        sb.append(',');
        sb.append("sprite");
        sb.append('=');
        sb.append(((this.sprite == null)?"<null>":this.sprite));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("x");
        sb.append('=');
        sb.append(((this.x == null)?"<null>":this.x));
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(((this.y == null)?"<null>":this.y));
        sb.append(',');
        sb.append("w");
        sb.append('=');
        sb.append(((this.w == null)?"<null>":this.w));
        sb.append(',');
        sb.append("h");
        sb.append('=');
        sb.append(((this.h == null)?"<null>":this.h));
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
        result = ((result* 31)+((this.w == null)? 0 :this.w.hashCode()));
        result = ((result* 31)+((this.sprite == null)? 0 :this.sprite.hashCode()));
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.h == null)? 0 :this.h.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.full == null)? 0 :this.full.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image__46) == false) {
            return false;
        }
        Image__46 rhs = ((Image__46) other);
        return (((((((((this.w == rhs.w)||((this.w!= null)&&this.w.equals(rhs.w)))&&((this.sprite == rhs.sprite)||((this.sprite!= null)&&this.sprite.equals(rhs.sprite))))&&((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x))))&&((this.h == rhs.h)||((this.h!= null)&&this.h.equals(rhs.h))))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.full == rhs.full)||((this.full!= null)&&this.full.equals(rhs.full))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
