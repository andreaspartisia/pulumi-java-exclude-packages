// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.ServicePerimeterConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServicePerimeterResult {
    private final String description;
    private final String name;
    private final String perimeterType;
    private final ServicePerimeterConfigResponse status;
    private final String title;

    @OutputCustomType.Constructor({"description","name","perimeterType","status","title"})
    private GetServicePerimeterResult(
        String description,
        String name,
        String perimeterType,
        ServicePerimeterConfigResponse status,
        String title) {
        this.description = Objects.requireNonNull(description);
        this.name = Objects.requireNonNull(name);
        this.perimeterType = Objects.requireNonNull(perimeterType);
        this.status = Objects.requireNonNull(status);
        this.title = Objects.requireNonNull(title);
    }

    public String getDescription() {
        return this.description;
    }
    public String getName() {
        return this.name;
    }
    public String getPerimeterType() {
        return this.perimeterType;
    }
    public ServicePerimeterConfigResponse getStatus() {
        return this.status;
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePerimeterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private String perimeterType;
        private ServicePerimeterConfigResponse status;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServicePerimeterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.perimeterType = defaults.perimeterType;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPerimeterType(String perimeterType) {
            this.perimeterType = Objects.requireNonNull(perimeterType);
            return this;
        }

        public Builder setStatus(ServicePerimeterConfigResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GetServicePerimeterResult build() {
            return new GetServicePerimeterResult(description, name, perimeterType, status, title);
        }
    }
}