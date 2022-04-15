// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Sets the scheduling options for an Instance. NextID: 21
 * 
 */
public final class SchedulingResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchedulingResponse Empty = new SchedulingResponse();

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    @Import(name="automaticRestart", required=true)
      private final Boolean automaticRestart;

    public Boolean automaticRestart() {
        return this.automaticRestart;
    }

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @Import(name="instanceTerminationAction", required=true)
      private final String instanceTerminationAction;

    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }

    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint", required=true)
      private final String locationHint;

    public String locationHint() {
        return this.locationHint;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @Import(name="minNodeCpus", required=true)
      private final Integer minNodeCpus;

    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    @Import(name="nodeAffinities", required=true)
      private final List<SchedulingNodeAffinityResponse> nodeAffinities;

    public List<SchedulingNodeAffinityResponse> nodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
      private final String onHostMaintenance;

    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    @Import(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    @Import(name="provisioningModel", required=true)
      private final String provisioningModel;

    public String provisioningModel() {
        return this.provisioningModel;
    }

    public SchedulingResponse(
        Boolean automaticRestart,
        String instanceTerminationAction,
        String locationHint,
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible,
        String provisioningModel) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart, "expected parameter 'automaticRestart' to be non-null");
        this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction, "expected parameter 'instanceTerminationAction' to be non-null");
        this.locationHint = Objects.requireNonNull(locationHint, "expected parameter 'locationHint' to be non-null");
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
        this.provisioningModel = Objects.requireNonNull(provisioningModel, "expected parameter 'provisioningModel' to be non-null");
    }

    private SchedulingResponse() {
        this.automaticRestart = null;
        this.instanceTerminationAction = null;
        this.locationHint = null;
        this.minNodeCpus = null;
        this.nodeAffinities = List.of();
        this.onHostMaintenance = null;
        this.preemptible = null;
        this.provisioningModel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private String instanceTerminationAction;
        private String locationHint;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        public Builder instanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityResponse... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, instanceTerminationAction, locationHint, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
