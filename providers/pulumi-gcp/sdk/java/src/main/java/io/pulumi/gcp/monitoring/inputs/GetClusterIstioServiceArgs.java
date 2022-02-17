// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterIstioServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterIstioServiceArgs Empty = new GetClusterIstioServiceArgs();

    /**
     * The name of the Kubernetes cluster in which this Istio service
     * is defined. Corresponds to the clusterName resource label in k8s_cluster resources.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The location of the Kubernetes cluster in which this Istio service
     * is defined. Corresponds to the location resource label in k8s_cluster resources.
     * 
     */
    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The name of the Istio service underlying this service.
     * Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The namespace of the Istio service underlying this service.
     * Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    @InputImport(name="serviceNamespace", required=true)
    private final String serviceNamespace;

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    public GetClusterIstioServiceArgs(
        String clusterName,
        String location,
        @Nullable String project,
        String serviceName,
        String serviceNamespace) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
    }

    private GetClusterIstioServiceArgs() {
        this.clusterName = null;
        this.location = null;
        this.project = null;
        this.serviceName = null;
        this.serviceNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIstioServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String location;
        private @Nullable String project;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIstioServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public GetClusterIstioServiceArgs build() {
            return new GetClusterIstioServiceArgs(clusterName, location, project, serviceName, serviceNamespace);
        }
    }
}