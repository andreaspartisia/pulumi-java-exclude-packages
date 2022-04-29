// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Mysql.outputs.GetMysqlDbSystemChannelSource;
import com.pulumi.oci.Mysql.outputs.GetMysqlDbSystemChannelTarget;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMysqlDbSystemChannel {
    /**
     * @return The OCID of the compartment the DB System belongs in.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The user-friendly name for the DB System. It does not have to be unique.
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the DB System.
     * 
     */
    private final String id;
    /**
     * @return Whether the Channel has been enabled by the user.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return Additional information about the current lifecycleState.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return Parameters detailing how to provision the initial data of the DB System.
     * 
     */
    private final List<GetMysqlDbSystemChannelSource> sources;
    /**
     * @return The current state of the DB System.
     * 
     */
    private final String state;
    /**
     * @return Details about the Channel target.
     * 
     */
    private final List<GetMysqlDbSystemChannelTarget> targets;
    /**
     * @return The date and time the DB System was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the DB System was last updated.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetMysqlDbSystemChannel(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("sources") List<GetMysqlDbSystemChannelSource> sources,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("targets") List<GetMysqlDbSystemChannelTarget> targets,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isEnabled = isEnabled;
        this.lifecycleDetails = lifecycleDetails;
        this.sources = sources;
        this.state = state;
        this.targets = targets;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The OCID of the compartment the DB System belongs in.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The user-friendly name for the DB System. It does not have to be unique.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the DB System.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the Channel has been enabled by the user.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Additional information about the current lifecycleState.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return Parameters detailing how to provision the initial data of the DB System.
     * 
     */
    public List<GetMysqlDbSystemChannelSource> sources() {
        return this.sources;
    }
    /**
     * @return The current state of the DB System.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Details about the Channel target.
     * 
     */
    public List<GetMysqlDbSystemChannelTarget> targets() {
        return this.targets;
    }
    /**
     * @return The date and time the DB System was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the DB System was last updated.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMysqlDbSystemChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isEnabled;
        private String lifecycleDetails;
        private List<GetMysqlDbSystemChannelSource> sources;
        private String state;
        private List<GetMysqlDbSystemChannelTarget> targets;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMysqlDbSystemChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.sources = defaults.sources;
    	      this.state = defaults.state;
    	      this.targets = defaults.targets;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder sources(List<GetMysqlDbSystemChannelSource> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(GetMysqlDbSystemChannelSource... sources) {
            return sources(List.of(sources));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder targets(List<GetMysqlDbSystemChannelTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetMysqlDbSystemChannelTarget... targets) {
            return targets(List.of(targets));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetMysqlDbSystemChannel build() {
            return new GetMysqlDbSystemChannel(compartmentId, definedTags, displayName, freeformTags, id, isEnabled, lifecycleDetails, sources, state, targets, timeCreated, timeUpdated);
        }
    }
}
