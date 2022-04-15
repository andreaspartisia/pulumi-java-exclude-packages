// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryreservation_v1beta1.CapacityCommitmentArgs;
import io.pulumi.googlenative.bigqueryreservation_v1beta1.outputs.StatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new capacity commitment resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigqueryreservation/v1beta1:CapacityCommitment")
public class CapacityCommitment extends io.pulumi.resources.CustomResource {
    /**
     * The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    @Export(name="commitmentEndTime", type=String.class, parameters={})
    private Output<String> commitmentEndTime;

    /**
     * @return The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public Output<String> commitmentEndTime() {
        return this.commitmentEndTime;
    }
    /**
     * The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    @Export(name="commitmentStartTime", type=String.class, parameters={})
    private Output<String> commitmentStartTime;

    /**
     * @return The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public Output<String> commitmentStartTime() {
        return this.commitmentStartTime;
    }
    /**
     * For FAILED commitment plan, provides the reason of failure.
     * 
     */
    @Export(name="failureStatus", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> failureStatus;

    /**
     * @return For FAILED commitment plan, provides the reason of failure.
     * 
     */
    public Output<StatusResponse> failureStatus() {
        return this.failureStatus;
    }
    /**
     * The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Capacity commitment commitment plan.
     * 
     */
    @Export(name="plan", type=String.class, parameters={})
    private Output<String> plan;

    /**
     * @return Capacity commitment commitment plan.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL commitments.
     * 
     */
    @Export(name="renewalPlan", type=String.class, parameters={})
    private Output<String> renewalPlan;

    /**
     * @return The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL commitments.
     * 
     */
    public Output<String> renewalPlan() {
        return this.renewalPlan;
    }
    /**
     * Number of slots in this commitment.
     * 
     */
    @Export(name="slotCount", type=String.class, parameters={})
    private Output<String> slotCount;

    /**
     * @return Number of slots in this commitment.
     * 
     */
    public Output<String> slotCount() {
        return this.slotCount;
    }
    /**
     * State of the commitment.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the commitment.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityCommitment(String name) {
        this(name, CapacityCommitmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityCommitment(String name, @Nullable CapacityCommitmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityCommitment(String name, @Nullable CapacityCommitmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryreservation/v1beta1:CapacityCommitment", name, args == null ? CapacityCommitmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CapacityCommitment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryreservation/v1beta1:CapacityCommitment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CapacityCommitment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityCommitment(name, id, options);
    }
}
