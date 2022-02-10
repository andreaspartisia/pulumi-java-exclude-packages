// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkbookTemplateGalleryResponse {
    private final @Nullable String category;
    private final @Nullable String name;
    private final @Nullable Integer order;
    private final @Nullable String resourceType;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"category","name","order","resourceType","type"})
    private WorkbookTemplateGalleryResponse(
        @Nullable String category,
        @Nullable String name,
        @Nullable Integer order,
        @Nullable String resourceType,
        @Nullable String type) {
        this.category = category;
        this.name = name;
        this.order = order;
        this.resourceType = resourceType;
        this.type = type;
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookTemplateGalleryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable String name;
        private @Nullable Integer order;
        private @Nullable String resourceType;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookTemplateGalleryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.resourceType = defaults.resourceType;
    	      this.type = defaults.type;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public WorkbookTemplateGalleryResponse build() {
            return new WorkbookTemplateGalleryResponse(category, name, order, resourceType, type);
        }
    }
}