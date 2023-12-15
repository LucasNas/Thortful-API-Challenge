
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
    "accuracy",
    "contest_combos",
    "contest_effect",
    "contest_type",
    "damage_class",
    "effect_chance",
    "effect_changes",
    "effect_entries",
    "flavor_text_entries",
    "generation",
    "id",
    "learned_by_pokemon",
    "machines",
    "meta",
    "name",
    "names",
    "past_values",
    "power",
    "pp",
    "priority",
    "stat_changes",
    "super_contest_effect",
    "target",
    "type"
})
@Generated("jsonschema2pojo")
public class MoveInput implements Serializable
{

    @JsonProperty("accuracy")
    private Integer accuracy;
    @JsonProperty("contest_combos")
    private ContestCombos contestCombos;
    @JsonProperty("contest_effect")
    private ContestEffect contestEffect;
    @JsonProperty("contest_type")
    private ContestType contestType;
    @JsonProperty("damage_class")
    private DamageClass damageClass;
    @JsonProperty("effect_chance")
    private Object effectChance;
    @JsonProperty("effect_changes")
    private List<Object> effectChanges;
    @JsonProperty("effect_entries")
    private List<EffectEntry> effectEntries;
    @JsonProperty("flavor_text_entries")
    private List<FlavorTextEntry> flavorTextEntries;
    @JsonProperty("generation")
    private Generation generation;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("learned_by_pokemon")
    private List<LearnedByPokemon> learnedByPokemon;
    @JsonProperty("machines")
    private List<Object> machines;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Name> names;
    @JsonProperty("past_values")
    private List<Object> pastValues;
    @JsonProperty("power")
    private Integer power;
    @JsonProperty("pp")
    private Integer pp;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("stat_changes")
    private List<Object> statChanges;
    @JsonProperty("super_contest_effect")
    private SuperContestEffect superContestEffect;
    @JsonProperty("target")
    private Target target;
    @JsonProperty("type")
    private Type type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6393949099148393732L;

    @JsonProperty("accuracy")
    public Integer getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("contest_combos")
    public ContestCombos getContestCombos() {
        return contestCombos;
    }

    @JsonProperty("contest_combos")
    public void setContestCombos(ContestCombos contestCombos) {
        this.contestCombos = contestCombos;
    }

    @JsonProperty("contest_effect")
    public ContestEffect getContestEffect() {
        return contestEffect;
    }

    @JsonProperty("contest_effect")
    public void setContestEffect(ContestEffect contestEffect) {
        this.contestEffect = contestEffect;
    }

    @JsonProperty("contest_type")
    public ContestType getContestType() {
        return contestType;
    }

    @JsonProperty("contest_type")
    public void setContestType(ContestType contestType) {
        this.contestType = contestType;
    }

    @JsonProperty("damage_class")
    public DamageClass getDamageClass() {
        return damageClass;
    }

    @JsonProperty("damage_class")
    public void setDamageClass(DamageClass damageClass) {
        this.damageClass = damageClass;
    }

    @JsonProperty("effect_chance")
    public Object getEffectChance() {
        return effectChance;
    }

    @JsonProperty("effect_chance")
    public void setEffectChance(Object effectChance) {
        this.effectChance = effectChance;
    }

    @JsonProperty("effect_changes")
    public List<Object> getEffectChanges() {
        return effectChanges;
    }

    @JsonProperty("effect_changes")
    public void setEffectChanges(List<Object> effectChanges) {
        this.effectChanges = effectChanges;
    }

    @JsonProperty("effect_entries")
    public List<EffectEntry> getEffectEntries() {
        return effectEntries;
    }

    @JsonProperty("effect_entries")
    public void setEffectEntries(List<EffectEntry> effectEntries) {
        this.effectEntries = effectEntries;
    }

    @JsonProperty("flavor_text_entries")
    public List<FlavorTextEntry> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    @JsonProperty("flavor_text_entries")
    public void setFlavorTextEntries(List<FlavorTextEntry> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    @JsonProperty("generation")
    public Generation getGeneration() {
        return generation;
    }

    @JsonProperty("generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("learned_by_pokemon")
    public List<LearnedByPokemon> getLearnedByPokemon() {
        return learnedByPokemon;
    }

    @JsonProperty("learned_by_pokemon")
    public void setLearnedByPokemon(List<LearnedByPokemon> learnedByPokemon) {
        this.learnedByPokemon = learnedByPokemon;
    }

    @JsonProperty("machines")
    public List<Object> getMachines() {
        return machines;
    }

    @JsonProperty("machines")
    public void setMachines(List<Object> machines) {
        this.machines = machines;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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

    @JsonProperty("past_values")
    public List<Object> getPastValues() {
        return pastValues;
    }

    @JsonProperty("past_values")
    public void setPastValues(List<Object> pastValues) {
        this.pastValues = pastValues;
    }

    @JsonProperty("power")
    public Integer getPower() {
        return power;
    }

    @JsonProperty("power")
    public void setPower(Integer power) {
        this.power = power;
    }

    @JsonProperty("pp")
    public Integer getPp() {
        return pp;
    }

    @JsonProperty("pp")
    public void setPp(Integer pp) {
        this.pp = pp;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("stat_changes")
    public List<Object> getStatChanges() {
        return statChanges;
    }

    @JsonProperty("stat_changes")
    public void setStatChanges(List<Object> statChanges) {
        this.statChanges = statChanges;
    }

    @JsonProperty("super_contest_effect")
    public SuperContestEffect getSuperContestEffect() {
        return superContestEffect;
    }

    @JsonProperty("super_contest_effect")
    public void setSuperContestEffect(SuperContestEffect superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
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
