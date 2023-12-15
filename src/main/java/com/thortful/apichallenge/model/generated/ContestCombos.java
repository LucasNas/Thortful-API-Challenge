
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
    "normal",
    "super"
})
@Generated("jsonschema2pojo")
public class ContestCombos implements Serializable
{

    @JsonProperty("normal")
    private Normal normal;
    @JsonProperty("super")
    private Super _super;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8945003086351632064L;

    @JsonProperty("normal")
    public Normal getNormal() {
        return normal;
    }

    @JsonProperty("normal")
    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    @JsonProperty("super")
    public Super getSuper() {
        return _super;
    }

    @JsonProperty("super")
    public void setSuper(Super _super) {
        this._super = _super;
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
