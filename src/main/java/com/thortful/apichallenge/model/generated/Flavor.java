
package com.thortful.apichallenge.model.generated;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flavor",
    "potency"
})
@Generated("jsonschema2pojo")
public class Flavor implements Serializable
{

    @JsonProperty("flavor")
    private Flavor__1 flavor;
    @JsonProperty("potency")
    private Integer potency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1740072880802940153L;

    @JsonProperty("flavor")
    public Flavor__1 getFlavor() {
        return flavor;
    }

    @JsonProperty("flavor")
    public void setFlavor(Flavor__1 flavor) {
        this.flavor = flavor;
    }

    @JsonProperty("potency")
    public Integer getPotency() {
        return potency;
    }

    @JsonProperty("potency")
    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
