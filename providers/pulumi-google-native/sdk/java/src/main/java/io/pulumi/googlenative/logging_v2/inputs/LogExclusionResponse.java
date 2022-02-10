// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class LogExclusionResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogExclusionResponse Empty = new LogExclusionResponse();

    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="disabled", required=true)
    private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    @InputImport(name="filter", required=true)
    private final String filter;

    public String getFilter() {
        return this.filter;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="updateTime", required=true)
    private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public LogExclusionResponse(
        String createTime,
        String description,
        Boolean disabled,
        String filter,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private LogExclusionResponse() {
        this.createTime = null;
        this.description = null;
        this.disabled = null;
        this.filter = null;
        this.name = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogExclusionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private Boolean disabled;
        private String filter;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LogExclusionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public LogExclusionResponse build() {
            return new LogExclusionResponse(createTime, description, disabled, filter, name, updateTime);
        }
    }
}