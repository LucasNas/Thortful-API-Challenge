
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
    "base_stat",
    "effort",
    "stat"
})
@Generated("jsonschema2pojo")
public class Stat implements Serializable
{

    @JsonProperty("base_stat")
    private Integer baseStat;
    @JsonProperty("effort")
    private Integer effort;
    @JsonProperty("stat")
    private Stat__1 stat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3423927858093492626L;

    @JsonProperty("base_stat")
    public Integer getBaseStat() {
        return baseStat;
    }

    @JsonProperty("base_stat")
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("effort")
    public Integer getEffort() {
        return effort;
    }

    @JsonProperty("effort")
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    @JsonProperty("stat")
    public Stat__1 getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(Stat__1 stat) {
        this.stat = stat;
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
