
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
    "id",
    "locations",
    "main_generation",
    "name",
    "names",
    "pokedexes",
    "version_groups"
})
@Generated("jsonschema2pojo")
public class RegionInput implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("locations")
    private List<Location> locations;
    @JsonProperty("main_generation")
    private MainGeneration mainGeneration;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names;
    @JsonProperty("pokedexes")
    private List<Pokedex> pokedexes;
    @JsonProperty("version_groups")
    private List<VersionGroup> versionGroups;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7209284414062243138L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("main_generation")
    public MainGeneration getMainGeneration() {
        return mainGeneration;
    }

    @JsonProperty("main_generation")
    public void setMainGeneration(MainGeneration mainGeneration) {
        this.mainGeneration = mainGeneration;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("names")
    public List<Name> getNames() {
        return names;
    }

    @JsonProperty("names")
    public void setNames(List<Name> names) {
        this.names = names;
    }

    @JsonProperty("pokedexes")
    public List<Pokedex> getPokedexes() {
        return pokedexes;
    }

    @JsonProperty("pokedexes")
    public void setPokedexes(List<Pokedex> pokedexes) {
        this.pokedexes = pokedexes;
    }

    @JsonProperty("version_groups")
    public List<VersionGroup> getVersionGroups() {
        return versionGroups;
    }

    @JsonProperty("version_groups")
    public void setVersionGroups(List<VersionGroup> versionGroups) {
        this.versionGroups = versionGroups;
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
