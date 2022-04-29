// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OperatorAccessControl.outputs.GetControlAssignmentsOperatorControlAssignmentCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetControlAssignmentsOperatorControlAssignmentCollection {
    private final List<GetControlAssignmentsOperatorControlAssignmentCollectionItem> items;

    @CustomType.Constructor
    private GetControlAssignmentsOperatorControlAssignmentCollection(@CustomType.Parameter("items") List<GetControlAssignmentsOperatorControlAssignmentCollectionItem> items) {
        this.items = items;
    }

    public List<GetControlAssignmentsOperatorControlAssignmentCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlAssignmentsOperatorControlAssignmentCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetControlAssignmentsOperatorControlAssignmentCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControlAssignmentsOperatorControlAssignmentCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetControlAssignmentsOperatorControlAssignmentCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetControlAssignmentsOperatorControlAssignmentCollectionItem... items) {
            return items(List.of(items));
        }        public GetControlAssignmentsOperatorControlAssignmentCollection build() {
            return new GetControlAssignmentsOperatorControlAssignmentCollection(items);
        }
    }
}
