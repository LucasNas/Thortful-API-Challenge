
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
    "use_after",
    "use_before"
})
@Generated("jsonschema2pojo")
public class Super implements Serializable
{

    @JsonProperty("use_after")
    private Object useAfter;
    @JsonProperty("use_before")
    private Object useBefore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 950468142757352503L;

    @JsonProperty("use_after")
    public Object getUseAfter() {
        return useAfter;
    }

    @JsonProperty("use_after")
    public void setUseAfter(Object useAfter) {
        this.useAfter = useAfter;
    }

    @JsonProperty("use_before")
    public Object getUseBefore() {
        return useBefore;
    }

    @JsonProperty("use_before")
    public void setUseBefore(Object useBefore) {
        this.useBefore = useBefore;
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
