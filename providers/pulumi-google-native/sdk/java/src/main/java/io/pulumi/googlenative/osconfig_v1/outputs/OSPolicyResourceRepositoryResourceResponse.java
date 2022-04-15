// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceRepositoryResourceAptRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceRepositoryResourceGooRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceRepositoryResourceYumRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceRepositoryResourceZypperRepositoryResponse;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceRepositoryResourceResponse {
    /**
     * An Apt Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceAptRepositoryResponse apt;
    /**
     * A Goo Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceGooRepositoryResponse goo;
    /**
     * A Yum Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceYumRepositoryResponse yum;
    /**
     * A Zypper Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper;

    @CustomType.Constructor
    private OSPolicyResourceRepositoryResourceResponse(
        @CustomType.Parameter("apt") OSPolicyResourceRepositoryResourceAptRepositoryResponse apt,
        @CustomType.Parameter("goo") OSPolicyResourceRepositoryResourceGooRepositoryResponse goo,
        @CustomType.Parameter("yum") OSPolicyResourceRepositoryResourceYumRepositoryResponse yum,
        @CustomType.Parameter("zypper") OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * An Apt Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceAptRepositoryResponse apt() {
        return this.apt;
    }
    /**
     * A Goo Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceGooRepositoryResponse goo() {
        return this.goo;
    }
    /**
     * A Yum Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceYumRepositoryResponse yum() {
        return this.yum;
    }
    /**
     * A Zypper Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper() {
        return this.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceAptRepositoryResponse apt;
        private OSPolicyResourceRepositoryResourceGooRepositoryResponse goo;
        private OSPolicyResourceRepositoryResourceYumRepositoryResponse yum;
        private OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(OSPolicyResourceRepositoryResourceAptRepositoryResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }
        public Builder goo(OSPolicyResourceRepositoryResourceGooRepositoryResponse goo) {
            this.goo = Objects.requireNonNull(goo);
            return this;
        }
        public Builder yum(OSPolicyResourceRepositoryResourceYumRepositoryResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }
        public Builder zypper(OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }        public OSPolicyResourceRepositoryResourceResponse build() {
            return new OSPolicyResourceRepositoryResourceResponse(apt, goo, yum, zypper);
        }
    }
}
