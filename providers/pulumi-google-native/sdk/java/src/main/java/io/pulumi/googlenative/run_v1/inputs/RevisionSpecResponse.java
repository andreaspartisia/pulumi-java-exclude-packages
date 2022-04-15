// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.ContainerResponse;
import io.pulumi.googlenative.run_v1.inputs.LocalObjectReferenceResponse;
import io.pulumi.googlenative.run_v1.inputs.VolumeResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * RevisionSpec holds the desired state of the Revision (from the client).
 * 
 */
public final class RevisionSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final RevisionSpecResponse Empty = new RevisionSpecResponse();

    /**
     * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
     * 
     */
    @Import(name="containerConcurrency", required=true)
      private final Integer containerConcurrency;

    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }

    /**
     * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container, including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
     * 
     */
    @Import(name="containers", required=true)
      private final List<ContainerResponse> containers;

    public List<ContainerResponse> containers() {
        return this.containers;
    }

    /**
     * Indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported, defaults to true.
     * 
     */
    @Import(name="enableServiceLinks", required=true)
      private final Boolean enableServiceLinks;

    public Boolean enableServiceLinks() {
        return this.enableServiceLinks;
    }

    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported.
     * 
     */
    @Import(name="imagePullSecrets", required=true)
      private final List<LocalObjectReferenceResponse> imagePullSecrets;

    public List<LocalObjectReferenceResponse> imagePullSecrets() {
        return this.imagePullSecrets;
    }

    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
     */
    @Import(name="serviceAccountName", required=true)
      private final String serviceAccountName;

    public String serviceAccountName() {
        return this.serviceAccountName;
    }

    /**
     * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
     * 
     */
    @Import(name="timeoutSeconds", required=true)
      private final Integer timeoutSeconds;

    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    @Import(name="volumes", required=true)
      private final List<VolumeResponse> volumes;

    public List<VolumeResponse> volumes() {
        return this.volumes;
    }

    public RevisionSpecResponse(
        Integer containerConcurrency,
        List<ContainerResponse> containers,
        Boolean enableServiceLinks,
        List<LocalObjectReferenceResponse> imagePullSecrets,
        String serviceAccountName,
        Integer timeoutSeconds,
        List<VolumeResponse> volumes) {
        this.containerConcurrency = Objects.requireNonNull(containerConcurrency, "expected parameter 'containerConcurrency' to be non-null");
        this.containers = Objects.requireNonNull(containers, "expected parameter 'containers' to be non-null");
        this.enableServiceLinks = Objects.requireNonNull(enableServiceLinks, "expected parameter 'enableServiceLinks' to be non-null");
        this.imagePullSecrets = Objects.requireNonNull(imagePullSecrets, "expected parameter 'imagePullSecrets' to be non-null");
        this.serviceAccountName = Objects.requireNonNull(serviceAccountName, "expected parameter 'serviceAccountName' to be non-null");
        this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds, "expected parameter 'timeoutSeconds' to be non-null");
        this.volumes = Objects.requireNonNull(volumes, "expected parameter 'volumes' to be non-null");
    }

    private RevisionSpecResponse() {
        this.containerConcurrency = null;
        this.containers = List.of();
        this.enableServiceLinks = null;
        this.imagePullSecrets = List.of();
        this.serviceAccountName = null;
        this.timeoutSeconds = null;
        this.volumes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevisionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerConcurrency;
        private List<ContainerResponse> containers;
        private Boolean enableServiceLinks;
        private List<LocalObjectReferenceResponse> imagePullSecrets;
        private String serviceAccountName;
        private Integer timeoutSeconds;
        private List<VolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(RevisionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.enableServiceLinks = defaults.enableServiceLinks;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.volumes = defaults.volumes;
        }

        public Builder containerConcurrency(Integer containerConcurrency) {
            this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
            return this;
        }
        public Builder containers(List<ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(ContainerResponse... containers) {
            return containers(List.of(containers));
        }
        public Builder enableServiceLinks(Boolean enableServiceLinks) {
            this.enableServiceLinks = Objects.requireNonNull(enableServiceLinks);
            return this;
        }
        public Builder imagePullSecrets(List<LocalObjectReferenceResponse> imagePullSecrets) {
            this.imagePullSecrets = Objects.requireNonNull(imagePullSecrets);
            return this;
        }
        public Builder imagePullSecrets(LocalObjectReferenceResponse... imagePullSecrets) {
            return imagePullSecrets(List.of(imagePullSecrets));
        }
        public Builder serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = Objects.requireNonNull(serviceAccountName);
            return this;
        }
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
            return this;
        }
        public Builder volumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(VolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }        public RevisionSpecResponse build() {
            return new RevisionSpecResponse(containerConcurrency, containers, enableServiceLinks, imagePullSecrets, serviceAccountName, timeoutSeconds, volumes);
        }
    }
}
