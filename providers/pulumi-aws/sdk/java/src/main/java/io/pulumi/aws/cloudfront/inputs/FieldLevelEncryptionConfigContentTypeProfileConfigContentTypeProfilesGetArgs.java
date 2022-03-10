// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs Empty = new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs();

    @InputImport(name="items", required=true)
      private final Input<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs>> items;

    public Input<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs>> getItems() {
        return this.items;
    }

    public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs(Input<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(Input<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs(items);
        }
    }
}