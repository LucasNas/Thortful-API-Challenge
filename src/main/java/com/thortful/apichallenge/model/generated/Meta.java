
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
    "ailment",
    "ailment_chance",
    "category",
    "crit_rate",
    "drain",
    "flinch_chance",
    "healing",
    "max_hits",
    "max_turns",
    "min_hits",
    "min_turns",
    "stat_chance"
})
@Generated("jsonschema2pojo")
public class Meta implements Serializable
{

    @JsonProperty("ailment")
    private Ailment ailment;
    @JsonProperty("ailment_chance")
    private Integer ailmentChance;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("crit_rate")
    private Integer critRate;
    @JsonProperty("drain")
    private Integer drain;
    @JsonProperty("flinch_chance")
    private Integer flinchChance;
    @JsonProperty("healing")
    private Integer healing;
    @JsonProperty("max_hits")
    private Object maxHits;
    @JsonProperty("max_turns")
    private Object maxTurns;
    @JsonProperty("min_hits")
    private Object minHits;
    @JsonProperty("min_turns")
    private Object minTurns;
    @JsonProperty("stat_chance")
    private Integer statChance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -66470964693993024L;

    @JsonProperty("ailment")
    public Ailment getAilment() {
        return ailment;
    }

    @JsonProperty("ailment")
    public void setAilment(Ailment ailment) {
        this.ailment = ailment;
    }

    @JsonProperty("ailment_chance")
    public Integer getAilmentChance() {
        return ailmentChance;
    }

    @JsonProperty("ailment_chance")
    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("crit_rate")
    public Integer getCritRate() {
        return critRate;
    }

    @JsonProperty("crit_rate")
    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    @JsonProperty("drain")
    public Integer getDrain() {
        return drain;
    }

    @JsonProperty("drain")
    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    @JsonProperty("flinch_chance")
    public Integer getFlinchChance() {
        return flinchChance;
    }

    @JsonProperty("flinch_chance")
    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    @JsonProperty("healing")
    public Integer getHealing() {
        return healing;
    }

    @JsonProperty("healing")
    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    @JsonProperty("max_hits")
    public Object getMaxHits() {
        return maxHits;
    }

    @JsonProperty("max_hits")
    public void setMaxHits(Object maxHits) {
        this.maxHits = maxHits;
    }

    @JsonProperty("max_turns")
    public Object getMaxTurns() {
        return maxTurns;
    }

    @JsonProperty("max_turns")
    public void setMaxTurns(Object maxTurns) {
        this.maxTurns = maxTurns;
    }

    @JsonProperty("min_hits")
    public Object getMinHits() {
        return minHits;
    }

    @JsonProperty("min_hits")
    public void setMinHits(Object minHits) {
        this.minHits = minHits;
    }

    @JsonProperty("min_turns")
    public Object getMinTurns() {
        return minTurns;
    }

    @JsonProperty("min_turns")
    public void setMinTurns(Object minTurns) {
        this.minTurns = minTurns;
    }

    @JsonProperty("stat_chance")
    public Integer getStatChance() {
        return statChance;
    }

    @JsonProperty("stat_chance")
    public void setStatChance(Integer statChance) {
        this.statChance = statChance;
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
