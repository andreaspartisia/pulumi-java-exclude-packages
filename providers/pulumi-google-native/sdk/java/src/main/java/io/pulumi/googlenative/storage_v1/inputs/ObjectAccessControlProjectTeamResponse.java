// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The project team associated with the entity, if any.
 * 
 */
public final class ObjectAccessControlProjectTeamResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectAccessControlProjectTeamResponse Empty = new ObjectAccessControlProjectTeamResponse();

    /**
     * The project number.
     * 
     */
    @Import(name="projectNumber", required=true)
      private final String projectNumber;

    public String projectNumber() {
        return this.projectNumber;
    }

    /**
     * The team.
     * 
     */
    @Import(name="team", required=true)
      private final String team;

    public String team() {
        return this.team;
    }

    public ObjectAccessControlProjectTeamResponse(
        String projectNumber,
        String team) {
        this.projectNumber = Objects.requireNonNull(projectNumber, "expected parameter 'projectNumber' to be non-null");
        this.team = Objects.requireNonNull(team, "expected parameter 'team' to be non-null");
    }

    private ObjectAccessControlProjectTeamResponse() {
        this.projectNumber = null;
        this.team = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlProjectTeamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectNumber;
        private String team;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlProjectTeamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder projectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }
        public Builder team(String team) {
            this.team = Objects.requireNonNull(team);
            return this;
        }        public ObjectAccessControlProjectTeamResponse build() {
            return new ObjectAccessControlProjectTeamResponse(projectNumber, team);
        }
    }
}
