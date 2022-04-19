// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.azurenative.virtualmachineimages.inputs.PlatformImagePurchasePlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an image source from [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
 * 
 */
public final class ImageTemplatePlatformImageSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplatePlatformImageSourceArgs Empty = new ImageTemplatePlatformImageSourceArgs();

    /**
     * Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="offer")
      private final @Nullable Output<String> offer;

    public Output<String> offer() {
        return this.offer == null ? Codegen.empty() : this.offer;
    }

    /**
     * Optional configuration of purchase plan for platform image.
     * 
     */
    @Import(name="planInfo")
      private final @Nullable Output<PlatformImagePurchasePlanArgs> planInfo;

    public Output<PlatformImagePurchasePlanArgs> planInfo() {
        return this.planInfo == null ? Codegen.empty() : this.planInfo;
    }

    /**
     * Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher == null ? Codegen.empty() : this.publisher;
    }

    /**
     * Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<String> sku;

    public Output<String> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'PlatformImage'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If 'latest' is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying 'latest' could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ImageTemplatePlatformImageSourceArgs(
        @Nullable Output<String> offer,
        @Nullable Output<PlatformImagePurchasePlanArgs> planInfo,
        @Nullable Output<String> publisher,
        @Nullable Output<String> sku,
        Output<String> type,
        @Nullable Output<String> version) {
        this.offer = offer;
        this.planInfo = planInfo;
        this.publisher = publisher;
        this.sku = sku;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.version = version;
    }

    private ImageTemplatePlatformImageSourceArgs() {
        this.offer = Codegen.empty();
        this.planInfo = Codegen.empty();
        this.publisher = Codegen.empty();
        this.sku = Codegen.empty();
        this.type = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePlatformImageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> offer;
        private @Nullable Output<PlatformImagePurchasePlanArgs> planInfo;
        private @Nullable Output<String> publisher;
        private @Nullable Output<String> sku;
        private Output<String> type;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePlatformImageSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.planInfo = defaults.planInfo;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder offer(@Nullable Output<String> offer) {
            this.offer = offer;
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = Codegen.ofNullable(offer);
            return this;
        }
        public Builder planInfo(@Nullable Output<PlatformImagePurchasePlanArgs> planInfo) {
            this.planInfo = planInfo;
            return this;
        }
        public Builder planInfo(@Nullable PlatformImagePurchasePlanArgs planInfo) {
            this.planInfo = Codegen.ofNullable(planInfo);
            return this;
        }
        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = Codegen.ofNullable(publisher);
            return this;
        }
        public Builder sku(@Nullable Output<String> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ImageTemplatePlatformImageSourceArgs build() {
            return new ImageTemplatePlatformImageSourceArgs(offer, planInfo, publisher, sku, type, version);
        }
    }
}
