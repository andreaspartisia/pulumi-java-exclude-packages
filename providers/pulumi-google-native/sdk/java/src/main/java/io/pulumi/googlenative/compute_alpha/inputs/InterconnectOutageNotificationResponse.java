// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Description of a planned outage on this Interconnect.
 * 
 */
public final class InterconnectOutageNotificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final InterconnectOutageNotificationResponse Empty = new InterconnectOutageNotificationResponse();

    /**
     * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be affected.
     * 
     */
    @Import(name="affectedCircuits", required=true)
      private final List<String> affectedCircuits;

    public List<String> affectedCircuits() {
        return this.affectedCircuits;
    }

    /**
     * A description about the purpose of the outage.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Scheduled end time for the outage (milliseconds since Unix epoch).
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Form this outage is expected to take, which can take one of the following values: - OUTAGE: The Interconnect may be completely out of service for some or all of the specified window. - PARTIAL_OUTAGE: Some circuits comprising the Interconnect as a whole should remain up, but with reduced bandwidth. Note that the versions of this enum prefixed with "IT_" have been deprecated in favor of the unprefixed values.
     * 
     */
    @Import(name="issueType", required=true)
      private final String issueType;

    public String issueType() {
        return this.issueType;
    }

    /**
     * Unique identifier for this outage notification.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The party that generated this notification, which can take the following value: - GOOGLE: this notification as generated by Google. Note that the value of NSRC_GOOGLE has been deprecated in favor of GOOGLE.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String source() {
        return this.source;
    }

    /**
     * Scheduled start time for the outage (milliseconds since Unix epoch).
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * State of this notification, which can take one of the following values: - ACTIVE: This outage notification is active. The event could be in the past, present, or future. See start_time and end_time for scheduling. - CANCELLED: The outage associated with this notification was cancelled before the outage was due to start. - COMPLETED: The outage associated with this notification is complete. Note that the versions of this enum prefixed with "NS_" have been deprecated in favor of the unprefixed values.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public InterconnectOutageNotificationResponse(
        List<String> affectedCircuits,
        String description,
        String endTime,
        String issueType,
        String name,
        String source,
        String startTime,
        String state) {
        this.affectedCircuits = Objects.requireNonNull(affectedCircuits, "expected parameter 'affectedCircuits' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.issueType = Objects.requireNonNull(issueType, "expected parameter 'issueType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private InterconnectOutageNotificationResponse() {
        this.affectedCircuits = List.of();
        this.description = null;
        this.endTime = null;
        this.issueType = null;
        this.name = null;
        this.source = null;
        this.startTime = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectOutageNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> affectedCircuits;
        private String description;
        private String endTime;
        private String issueType;
        private String name;
        private String source;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectOutageNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCircuits = defaults.affectedCircuits;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.issueType = defaults.issueType;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder affectedCircuits(List<String> affectedCircuits) {
            this.affectedCircuits = Objects.requireNonNull(affectedCircuits);
            return this;
        }
        public Builder affectedCircuits(String... affectedCircuits) {
            return affectedCircuits(List.of(affectedCircuits));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder issueType(String issueType) {
            this.issueType = Objects.requireNonNull(issueType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public InterconnectOutageNotificationResponse build() {
            return new InterconnectOutageNotificationResponse(affectedCircuits, description, endTime, issueType, name, source, startTime, state);
        }
    }
}
