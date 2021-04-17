
package champions;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

 
 
 
 
 
 
 
public class Info__17 {

    @SerializedName("attack")
    private Integer attack;
    @SerializedName("defense")
    private Integer defense;
    @SerializedName("magic")
    private Integer magic;
    @SerializedName("difficulty")
    private Integer difficulty;
     
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("attack")
    public Integer getAttack() {
        return attack;
    }

    @SerializedName("attack")
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    @SerializedName("defense")
    public Integer getDefense() {
        return defense;
    }

    @SerializedName("defense")
    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @SerializedName("magic")
    public Integer getMagic() {
        return magic;
    }

    @SerializedName("magic")
    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    @SerializedName("difficulty")
    public Integer getDifficulty() {
        return difficulty;
    }

    @SerializedName("difficulty")
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
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
        sb.append(Info__17 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attack");
        sb.append('=');
        sb.append(((this.attack == null)?"<null>":this.attack));
        sb.append(',');
        sb.append("defense");
        sb.append('=');
        sb.append(((this.defense == null)?"<null>":this.defense));
        sb.append(',');
        sb.append("magic");
        sb.append('=');
        sb.append(((this.magic == null)?"<null>":this.magic));
        sb.append(',');
        sb.append("difficulty");
        sb.append('=');
        sb.append(((this.difficulty == null)?"<null>":this.difficulty));
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
        result = ((result* 31)+((this.magic == null)? 0 :this.magic.hashCode()));
        result = ((result* 31)+((this.difficulty == null)? 0 :this.difficulty.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.defense == null)? 0 :this.defense.hashCode()));
        result = ((result* 31)+((this.attack == null)? 0 :this.attack.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Info__17) == false) {
            return false;
        }
        Info__17 rhs = ((Info__17) other);
        return ((((((this.magic == rhs.magic)||((this.magic!= null)&&this.magic.equals(rhs.magic)))&&((this.difficulty == rhs.difficulty)||((this.difficulty!= null)&&this.difficulty.equals(rhs.difficulty))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.defense == rhs.defense)||((this.defense!= null)&&this.defense.equals(rhs.defense))))&&((this.attack == rhs.attack)||((this.attack!= null)&&this.attack.equals(rhs.attack))));
    }

}
