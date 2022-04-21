// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.DataTypeState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SharePoint data type connection.
 * 
 */
public final class OfficeDataConnectorDataTypesSharePointArgs extends com.pulumi.resources.ResourceArgs {

    public static final OfficeDataConnectorDataTypesSharePointArgs Empty = new OfficeDataConnectorDataTypesSharePointArgs();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,DataTypeState>> state;

    public Optional<Output<Either<String,DataTypeState>>> state() {
        return Optional.ofNullable(this.state);
    }

    private OfficeDataConnectorDataTypesSharePointArgs() {}

    private OfficeDataConnectorDataTypesSharePointArgs(OfficeDataConnectorDataTypesSharePointArgs $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OfficeDataConnectorDataTypesSharePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OfficeDataConnectorDataTypesSharePointArgs $;

        public Builder() {
            $ = new OfficeDataConnectorDataTypesSharePointArgs();
        }

        public Builder(OfficeDataConnectorDataTypesSharePointArgs defaults) {
            $ = new OfficeDataConnectorDataTypesSharePointArgs(Objects.requireNonNull(defaults));
        }

        public Builder state(@Nullable Output<Either<String,DataTypeState>> state) {
            $.state = state;
            return this;
        }

        public Builder state(Either<String,DataTypeState> state) {
            return state(Output.of(state));
        }

        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        public Builder state(DataTypeState state) {
            return state(Either.ofRight(state));
        }

        public OfficeDataConnectorDataTypesSharePointArgs build() {
            return $;
        }
    }

}
