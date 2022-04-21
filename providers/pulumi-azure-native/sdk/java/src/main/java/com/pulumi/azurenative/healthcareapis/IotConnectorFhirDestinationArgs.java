// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis;

import com.pulumi.azurenative.healthcareapis.enums.IotIdentityResolutionType;
import com.pulumi.azurenative.healthcareapis.inputs.IotMappingPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotConnectorFhirDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotConnectorFhirDestinationArgs Empty = new IotConnectorFhirDestinationArgs();

    /**
     * The name of IoT Connector FHIR destination resource.
     * 
     */
    @Import(name="fhirDestinationName")
    private @Nullable Output<String> fhirDestinationName;

    public Optional<Output<String>> fhirDestinationName() {
        return Optional.ofNullable(this.fhirDestinationName);
    }

    /**
     * FHIR Mappings
     * 
     */
    @Import(name="fhirMapping", required=true)
    private Output<IotMappingPropertiesArgs> fhirMapping;

    public Output<IotMappingPropertiesArgs> fhirMapping() {
        return this.fhirMapping;
    }

    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    @Import(name="fhirServiceResourceId", required=true)
    private Output<String> fhirServiceResourceId;

    public Output<String> fhirServiceResourceId() {
        return this.fhirServiceResourceId;
    }

    /**
     * The name of IoT Connector resource.
     * 
     */
    @Import(name="iotConnectorName", required=true)
    private Output<String> iotConnectorName;

    public Output<String> iotConnectorName() {
        return this.iotConnectorName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines how resource identity is resolved on the destination.
     * 
     */
    @Import(name="resourceIdentityResolutionType", required=true)
    private Output<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType;

    public Output<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private IotConnectorFhirDestinationArgs() {}

    private IotConnectorFhirDestinationArgs(IotConnectorFhirDestinationArgs $) {
        this.fhirDestinationName = $.fhirDestinationName;
        this.fhirMapping = $.fhirMapping;
        this.fhirServiceResourceId = $.fhirServiceResourceId;
        this.iotConnectorName = $.iotConnectorName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceIdentityResolutionType = $.resourceIdentityResolutionType;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotConnectorFhirDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotConnectorFhirDestinationArgs $;

        public Builder() {
            $ = new IotConnectorFhirDestinationArgs();
        }

        public Builder(IotConnectorFhirDestinationArgs defaults) {
            $ = new IotConnectorFhirDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder fhirDestinationName(@Nullable Output<String> fhirDestinationName) {
            $.fhirDestinationName = fhirDestinationName;
            return this;
        }

        public Builder fhirDestinationName(String fhirDestinationName) {
            return fhirDestinationName(Output.of(fhirDestinationName));
        }

        public Builder fhirMapping(Output<IotMappingPropertiesArgs> fhirMapping) {
            $.fhirMapping = fhirMapping;
            return this;
        }

        public Builder fhirMapping(IotMappingPropertiesArgs fhirMapping) {
            return fhirMapping(Output.of(fhirMapping));
        }

        public Builder fhirServiceResourceId(Output<String> fhirServiceResourceId) {
            $.fhirServiceResourceId = fhirServiceResourceId;
            return this;
        }

        public Builder fhirServiceResourceId(String fhirServiceResourceId) {
            return fhirServiceResourceId(Output.of(fhirServiceResourceId));
        }

        public Builder iotConnectorName(Output<String> iotConnectorName) {
            $.iotConnectorName = iotConnectorName;
            return this;
        }

        public Builder iotConnectorName(String iotConnectorName) {
            return iotConnectorName(Output.of(iotConnectorName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceIdentityResolutionType(Output<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType) {
            $.resourceIdentityResolutionType = resourceIdentityResolutionType;
            return this;
        }

        public Builder resourceIdentityResolutionType(Either<String,IotIdentityResolutionType> resourceIdentityResolutionType) {
            return resourceIdentityResolutionType(Output.of(resourceIdentityResolutionType));
        }

        public Builder resourceIdentityResolutionType(String resourceIdentityResolutionType) {
            return resourceIdentityResolutionType(Either.ofLeft(resourceIdentityResolutionType));
        }

        public Builder resourceIdentityResolutionType(IotIdentityResolutionType resourceIdentityResolutionType) {
            return resourceIdentityResolutionType(Either.ofRight(resourceIdentityResolutionType));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public IotConnectorFhirDestinationArgs build() {
            $.fhirMapping = Objects.requireNonNull($.fhirMapping, "expected parameter 'fhirMapping' to be non-null");
            $.fhirServiceResourceId = Objects.requireNonNull($.fhirServiceResourceId, "expected parameter 'fhirServiceResourceId' to be non-null");
            $.iotConnectorName = Objects.requireNonNull($.iotConnectorName, "expected parameter 'iotConnectorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceIdentityResolutionType = Objects.requireNonNull($.resourceIdentityResolutionType, "expected parameter 'resourceIdentityResolutionType' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
