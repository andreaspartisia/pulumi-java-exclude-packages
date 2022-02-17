// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupFailoverCriteria;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMembers;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroup extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroup Empty = new DistributionOriginGroup();

    @InputImport(name="failoverCriteria", required=true)
    private final DistributionOriginGroupFailoverCriteria failoverCriteria;

    public DistributionOriginGroupFailoverCriteria getFailoverCriteria() {
        return this.failoverCriteria;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="members", required=true)
    private final DistributionOriginGroupMembers members;

    public DistributionOriginGroupMembers getMembers() {
        return this.members;
    }

    public DistributionOriginGroup(
        DistributionOriginGroupFailoverCriteria failoverCriteria,
        String id,
        DistributionOriginGroupMembers members) {
        this.failoverCriteria = Objects.requireNonNull(failoverCriteria, "expected parameter 'failoverCriteria' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
    }

    private DistributionOriginGroup() {
        this.failoverCriteria = null;
        this.id = null;
        this.members = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupFailoverCriteria failoverCriteria;
        private String id;
        private DistributionOriginGroupMembers members;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
        }

        public Builder setFailoverCriteria(DistributionOriginGroupFailoverCriteria failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMembers(DistributionOriginGroupMembers members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public DistributionOriginGroup build() {
            return new DistributionOriginGroup(failoverCriteria, id, members);
        }
    }
}