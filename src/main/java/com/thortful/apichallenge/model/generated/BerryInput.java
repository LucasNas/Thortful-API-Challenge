
package com.thortful.apichallenge.model.generated;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
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
    "firmness",
    "flavors",
    "growth_time",
    "id",
    "item",
    "max_harvest",
    "name",
    "natural_gift_power",
    "natural_gift_type",
    "size",
    "smoothness",
    "soil_dryness"
})
@Generated("jsonschema2pojo")
public class BerryInput implements Serializable
{

    @JsonProperty("firmness")
    private Firmness firmness;
    @JsonProperty("flavors")
    private List<Flavor> flavors;
    @JsonProperty("growth_time")
    private Integer growthTime;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("max_harvest")
    private Integer maxHarvest;
    @JsonProperty("name")
    private String name;
    @JsonProperty("natural_gift_power")
    private Integer naturalGiftPower;
    @JsonProperty("natural_gift_type")
    private NaturalGiftType naturalGiftType;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("smoothness")
    private Integer smoothness;
    @JsonProperty("soil_dryness")
    private Integer soilDryness;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2909505917433041244L;

    @JsonProperty("firmness")
    public Firmness getFirmness() {
        return firmness;
    }

    @JsonProperty("firmness")
    public void setFirmness(Firmness firmness) {
        this.firmness = firmness;
    }

    @JsonProperty("flavors")
    public List<Flavor> getFlavors() {
        return flavors;
    }

    @JsonProperty("flavors")
    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    @JsonProperty("growth_time")
    public Integer getGrowthTime() {
        return growthTime;
    }

    @JsonProperty("growth_time")
    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("max_harvest")
    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    @JsonProperty("max_harvest")
    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("natural_gift_power")
    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    @JsonProperty("natural_gift_power")
    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    @JsonProperty("natural_gift_type")
    public NaturalGiftType getNaturalGiftType() {
        return naturalGiftType;
    }

    @JsonProperty("natural_gift_type")
    public void setNaturalGiftType(NaturalGiftType naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("smoothness")
    public Integer getSmoothness() {
        return smoothness;
    }

    @JsonProperty("smoothness")
    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    @JsonProperty("soil_dryness")
    public Integer getSoilDryness() {
        return soilDryness;
    }

    @JsonProperty("soil_dryness")
    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
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
