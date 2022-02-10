// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SelectVideoTrackByIdResponse {
    private final String odataType;
    private final Double trackId;

    @OutputCustomType.Constructor({"odataType","trackId"})
    private SelectVideoTrackByIdResponse(
        String odataType,
        Double trackId) {
        this.odataType = Objects.requireNonNull(odataType);
        this.trackId = Objects.requireNonNull(trackId);
    }

    public String getOdataType() {
        return this.odataType;
    }
    public Double getTrackId() {
        return this.trackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private Double trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTrackId(Double trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }

        public SelectVideoTrackByIdResponse build() {
            return new SelectVideoTrackByIdResponse(odataType, trackId);
        }
    }
}