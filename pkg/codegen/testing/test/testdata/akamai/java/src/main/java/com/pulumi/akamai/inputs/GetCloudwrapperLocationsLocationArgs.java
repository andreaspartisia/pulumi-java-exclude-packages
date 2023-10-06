// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudwrapperLocationsLocationTrafficTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudwrapperLocationsLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperLocationsLocationArgs Empty = new GetCloudwrapperLocationsLocationArgs();

    @Import(name="locationId", required=true)
    private Output<Integer> locationId;

    public Output<Integer> locationId() {
        return this.locationId;
    }

    @Import(name="locationName", required=true)
    private Output<String> locationName;

    public Output<String> locationName() {
        return this.locationName;
    }

    @Import(name="multiCdnLocationId", required=true)
    private Output<String> multiCdnLocationId;

    public Output<String> multiCdnLocationId() {
        return this.multiCdnLocationId;
    }

    @Import(name="trafficTypes")
    private @Nullable Output<List<GetCloudwrapperLocationsLocationTrafficTypeArgs>> trafficTypes;

    public Optional<Output<List<GetCloudwrapperLocationsLocationTrafficTypeArgs>>> trafficTypes() {
        return Optional.ofNullable(this.trafficTypes);
    }

    private GetCloudwrapperLocationsLocationArgs() {}

    private GetCloudwrapperLocationsLocationArgs(GetCloudwrapperLocationsLocationArgs $) {
        this.locationId = $.locationId;
        this.locationName = $.locationName;
        this.multiCdnLocationId = $.multiCdnLocationId;
        this.trafficTypes = $.trafficTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperLocationsLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperLocationsLocationArgs $;

        public Builder() {
            $ = new GetCloudwrapperLocationsLocationArgs();
        }

        public Builder(GetCloudwrapperLocationsLocationArgs defaults) {
            $ = new GetCloudwrapperLocationsLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder locationId(Output<Integer> locationId) {
            $.locationId = locationId;
            return this;
        }

        public Builder locationId(Integer locationId) {
            return locationId(Output.of(locationId));
        }

        public Builder locationName(Output<String> locationName) {
            $.locationName = locationName;
            return this;
        }

        public Builder locationName(String locationName) {
            return locationName(Output.of(locationName));
        }

        public Builder multiCdnLocationId(Output<String> multiCdnLocationId) {
            $.multiCdnLocationId = multiCdnLocationId;
            return this;
        }

        public Builder multiCdnLocationId(String multiCdnLocationId) {
            return multiCdnLocationId(Output.of(multiCdnLocationId));
        }

        public Builder trafficTypes(@Nullable Output<List<GetCloudwrapperLocationsLocationTrafficTypeArgs>> trafficTypes) {
            $.trafficTypes = trafficTypes;
            return this;
        }

        public Builder trafficTypes(List<GetCloudwrapperLocationsLocationTrafficTypeArgs> trafficTypes) {
            return trafficTypes(Output.of(trafficTypes));
        }

        public Builder trafficTypes(GetCloudwrapperLocationsLocationTrafficTypeArgs... trafficTypes) {
            return trafficTypes(List.of(trafficTypes));
        }

        public GetCloudwrapperLocationsLocationArgs build() {
            if ($.locationId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationArgs", "locationId");
            }
            if ($.locationName == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationArgs", "locationName");
            }
            if ($.multiCdnLocationId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperLocationsLocationArgs", "multiCdnLocationId");
            }
            return $;
        }
    }

}
