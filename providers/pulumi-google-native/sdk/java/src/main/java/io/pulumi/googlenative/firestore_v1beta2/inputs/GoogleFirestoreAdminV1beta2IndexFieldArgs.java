// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.firestore_v1beta2.enums.GoogleFirestoreAdminV1beta2IndexFieldArrayConfig;
import io.pulumi.googlenative.firestore_v1beta2.enums.GoogleFirestoreAdminV1beta2IndexFieldOrder;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A field in an index. The field_path describes which field is indexed, the value_mode describes how the field value is indexed.
 * 
 */
public final class GoogleFirestoreAdminV1beta2IndexFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleFirestoreAdminV1beta2IndexFieldArgs Empty = new GoogleFirestoreAdminV1beta2IndexFieldArgs();

    /**
     * Indicates that this field supports operations on `array_value`s.
     * 
     */
    @Import(name="arrayConfig")
      private final @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldArrayConfig> arrayConfig;

    public Output<GoogleFirestoreAdminV1beta2IndexFieldArrayConfig> arrayConfig() {
        return this.arrayConfig == null ? Codegen.empty() : this.arrayConfig;
    }

    /**
     * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    @Import(name="fieldPath")
      private final @Nullable Output<String> fieldPath;

    public Output<String> fieldPath() {
        return this.fieldPath == null ? Codegen.empty() : this.fieldPath;
    }

    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
     * 
     */
    @Import(name="order")
      private final @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldOrder> order;

    public Output<GoogleFirestoreAdminV1beta2IndexFieldOrder> order() {
        return this.order == null ? Codegen.empty() : this.order;
    }

    public GoogleFirestoreAdminV1beta2IndexFieldArgs(
        @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldArrayConfig> arrayConfig,
        @Nullable Output<String> fieldPath,
        @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldOrder> order) {
        this.arrayConfig = arrayConfig;
        this.fieldPath = fieldPath;
        this.order = order;
    }

    private GoogleFirestoreAdminV1beta2IndexFieldArgs() {
        this.arrayConfig = Codegen.empty();
        this.fieldPath = Codegen.empty();
        this.order = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta2IndexFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldArrayConfig> arrayConfig;
        private @Nullable Output<String> fieldPath;
        private @Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldOrder> order;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta2IndexFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayConfig = defaults.arrayConfig;
    	      this.fieldPath = defaults.fieldPath;
    	      this.order = defaults.order;
        }

        public Builder arrayConfig(@Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldArrayConfig> arrayConfig) {
            this.arrayConfig = arrayConfig;
            return this;
        }
        public Builder arrayConfig(@Nullable GoogleFirestoreAdminV1beta2IndexFieldArrayConfig arrayConfig) {
            this.arrayConfig = Codegen.ofNullable(arrayConfig);
            return this;
        }
        public Builder fieldPath(@Nullable Output<String> fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public Builder fieldPath(@Nullable String fieldPath) {
            this.fieldPath = Codegen.ofNullable(fieldPath);
            return this;
        }
        public Builder order(@Nullable Output<GoogleFirestoreAdminV1beta2IndexFieldOrder> order) {
            this.order = order;
            return this;
        }
        public Builder order(@Nullable GoogleFirestoreAdminV1beta2IndexFieldOrder order) {
            this.order = Codegen.ofNullable(order);
            return this;
        }        public GoogleFirestoreAdminV1beta2IndexFieldArgs build() {
            return new GoogleFirestoreAdminV1beta2IndexFieldArgs(arrayConfig, fieldPath, order);
        }
    }
}
