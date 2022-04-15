// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VersionResponse {
    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    private final Integer epoch;
    /**
     * Whether this version is specifying part of an inclusive range. Grafeas does not have the capability to specify version ranges; instead we have fields that specify start version and end versions. At times this is insufficient - we also need to specify whether the version is included in the range or is excluded from the range. This boolean is expected to be set to true when the version is included in a range.
     * 
     */
    private final Boolean inclusive;
    /**
     * Distinguishes between sentinel MIN/MAX versions and normal versions.
     * 
     */
    private final String kind;
    /**
     * Required only when version kind is NORMAL. The main part of the version name.
     * 
     */
    private final String name;
    /**
     * The iteration of the package build from the above version.
     * 
     */
    private final String revision;

    @CustomType.Constructor
    private VersionResponse(
        @CustomType.Parameter("epoch") Integer epoch,
        @CustomType.Parameter("inclusive") Boolean inclusive,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revision") String revision) {
        this.epoch = epoch;
        this.inclusive = inclusive;
        this.kind = kind;
        this.name = name;
        this.revision = revision;
    }

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
    */
    public Integer epoch() {
        return this.epoch;
    }
    /**
     * Whether this version is specifying part of an inclusive range. Grafeas does not have the capability to specify version ranges; instead we have fields that specify start version and end versions. At times this is insufficient - we also need to specify whether the version is included in the range or is excluded from the range. This boolean is expected to be set to true when the version is included in a range.
     * 
    */
    public Boolean inclusive() {
        return this.inclusive;
    }
    /**
     * Distinguishes between sentinel MIN/MAX versions and normal versions.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Required only when version kind is NORMAL. The main part of the version name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The iteration of the package build from the above version.
     * 
    */
    public String revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer epoch;
        private Boolean inclusive;
        private String kind;
        private String name;
        private String revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder epoch(Integer epoch) {
            this.epoch = Objects.requireNonNull(epoch);
            return this;
        }
        public Builder inclusive(Boolean inclusive) {
            this.inclusive = Objects.requireNonNull(inclusive);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }        public VersionResponse build() {
            return new VersionResponse(epoch, inclusive, kind, name, revision);
        }
    }
}
