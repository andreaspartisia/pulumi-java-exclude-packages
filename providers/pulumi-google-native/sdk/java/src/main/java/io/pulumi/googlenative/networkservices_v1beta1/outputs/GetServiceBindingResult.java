// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceBindingResult {
    /**
     * The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    private final String description;
    /**
     * Optional. The endpoint filter associated with the Service Binding. The syntax is described in http://cloud/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#google.cloud.servicedirectory.v1.ResolveServiceRequest
     * 
     */
    private final String endpointFilter;
    /**
     * Optional. Set of label tags associated with the ServiceBinding resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the ServiceBinding resource. It matches pattern `projects/*{@literal /}locations/global/serviceBindings/service_binding_name>`.
     * 
     */
    private final String name;
    /**
     * The full service directory service name of the format /projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*
     * 
     */
    private final String service;
    /**
     * The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetServiceBindingResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpointFilter") String endpointFilter,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.endpointFilter = endpointFilter;
        this.labels = labels;
        this.name = name;
        this.service = service;
        this.updateTime = updateTime;
    }

    /**
     * The timestamp when the resource was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Optional. The endpoint filter associated with the Service Binding. The syntax is described in http://cloud/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#google.cloud.servicedirectory.v1.ResolveServiceRequest
     * 
    */
    public String endpointFilter() {
        return this.endpointFilter;
    }
    /**
     * Optional. Set of label tags associated with the ServiceBinding resource.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * Name of the ServiceBinding resource. It matches pattern `projects/*{@literal /}locations/global/serviceBindings/service_binding_name>`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The full service directory service name of the format /projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*
     * 
    */
    public String service() {
        return this.service;
    }
    /**
     * The timestamp when the resource was updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceBindingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String endpointFilter;
        private Map<String,String> labels;
        private String name;
        private String service;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpointFilter = defaults.endpointFilter;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpointFilter(String endpointFilter) {
            this.endpointFilter = Objects.requireNonNull(endpointFilter);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetServiceBindingResult build() {
            return new GetServiceBindingResult(createTime, description, endpointFilter, labels, name, service, updateTime);
        }
    }
}
