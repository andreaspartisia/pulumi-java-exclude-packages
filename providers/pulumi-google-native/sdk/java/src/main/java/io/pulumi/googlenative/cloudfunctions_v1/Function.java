// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudfunctions_v1.FunctionArgs;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.EventTriggerResponse;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.HttpsTriggerResponse;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.SecretEnvVarResponse;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.SecretVolumeResponse;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.SourceRepositoryResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error.
 * 
 */
@ResourceType(type="google-native:cloudfunctions/v1:Function")
public class Function extends io.pulumi.resources.CustomResource {
    /**
     * The amount of memory in MB available for a function. Defaults to 256MB.
     * 
     */
    @Export(name="availableMemoryMb", type=Integer.class, parameters={})
    private Output<Integer> availableMemoryMb;

    /**
     * @return The amount of memory in MB available for a function. Defaults to 256MB.
     * 
     */
    public Output<Integer> availableMemoryMb() {
        return this.availableMemoryMb;
    }
    /**
     * Build environment variables that shall be available during build time.
     * 
     */
    @Export(name="buildEnvironmentVariables", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> buildEnvironmentVariables;

    /**
     * @return Build environment variables that shall be available during build time.
     * 
     */
    public Output<Map<String,String>> buildEnvironmentVariables() {
        return this.buildEnvironmentVariables;
    }
    /**
     * The Cloud Build ID of the latest successful deployment of the function.
     * 
     */
    @Export(name="buildId", type=String.class, parameters={})
    private Output<String> buildId;

    /**
     * @return The Cloud Build ID of the latest successful deployment of the function.
     * 
     */
    public Output<String> buildId() {
        return this.buildId;
    }
    /**
     * The Cloud Build Name of the function deployment. `projects//locations//builds/`.
     * 
     */
    @Export(name="buildName", type=String.class, parameters={})
    private Output<String> buildName;

    /**
     * @return The Cloud Build Name of the function deployment. `projects//locations//builds/`.
     * 
     */
    public Output<String> buildName() {
        return this.buildName;
    }
    /**
     * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where `{project}` and `{region}` are the project id and region respectively where the worker pool is defined and `{workerPool}` is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (`service-@gcf-admin-robot.iam.gserviceaccount.com`) must be granted the role Cloud Build Custom Workers Builder (`roles/cloudbuild.customworkers.builder`) in the project.
     * 
     */
    @Export(name="buildWorkerPool", type=String.class, parameters={})
    private Output<String> buildWorkerPool;

    /**
     * @return Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where `{project}` and `{region}` are the project id and region respectively where the worker pool is defined and `{workerPool}` is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (`service-@gcf-admin-robot.iam.gserviceaccount.com`) must be granted the role Cloud Build Custom Workers Builder (`roles/cloudbuild.customworkers.builder`) in the project.
     * 
     */
    public Output<String> buildWorkerPool() {
        return this.buildWorkerPool;
    }
    /**
     * User-provided description of a function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of a function.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. If unspecified and the deployment is eligible to use Artifact Registry, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
     * 
     */
    @Export(name="dockerRepository", type=String.class, parameters={})
    private Output<String> dockerRepository;

    /**
     * @return User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. If unspecified and the deployment is eligible to use Artifact Registry, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
     * 
     */
    public Output<String> dockerRepository() {
        return this.dockerRepository;
    }
    /**
     * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
     * 
     */
    @Export(name="entryPoint", type=String.class, parameters={})
    private Output<String> entryPoint;

    /**
     * @return The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
     * 
     */
    public Output<String> entryPoint() {
        return this.entryPoint;
    }
    /**
     * Environment variables that shall be available during function execution.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> environmentVariables;

    /**
     * @return Environment variables that shall be available during function execution.
     * 
     */
    public Output<Map<String,String>> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * A source that fires events in response to a condition in another service.
     * 
     */
    @Export(name="eventTrigger", type=EventTriggerResponse.class, parameters={})
    private Output<EventTriggerResponse> eventTrigger;

    /**
     * @return A source that fires events in response to a condition in another service.
     * 
     */
    public Output<EventTriggerResponse> eventTrigger() {
        return this.eventTrigger;
    }
    /**
     * An HTTPS endpoint type of source that can be triggered via URL.
     * 
     */
    @Export(name="httpsTrigger", type=HttpsTriggerResponse.class, parameters={})
    private Output<HttpsTriggerResponse> httpsTrigger;

    /**
     * @return An HTTPS endpoint type of source that can be triggered via URL.
     * 
     */
    public Output<HttpsTriggerResponse> httpsTrigger() {
        return this.httpsTrigger;
    }
    /**
     * The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    @Export(name="ingressSettings", type=String.class, parameters={})
    private Output<String> ingressSettings;

    /**
     * @return The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    public Output<String> ingressSettings() {
        return this.ingressSettings;
    }
    /**
     * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. The following service accounts need to be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). 1. Google Cloud Functions service account (service-{project_number}@gcf-admin-robot.iam.gserviceaccount.com) - Required to protect the function's image. 2. Google Storage service account (service-{project_number}@gs-project-accounts.iam.gserviceaccount.com) - Required to protect the function's source code. If this service account does not exist, deploying a function without a KMS key or retrieving the service agent name provisions it. For more information, see https://cloud.google.com/storage/docs/projects#service-agents and https://cloud.google.com/storage/docs/getting-service-agent#gsutil. Google Cloud Functions delegates access to service agents to protect function resources in internal projects that are not accessible by the end user.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. The following service accounts need to be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). 1. Google Cloud Functions service account (service-{project_number}@gcf-admin-robot.iam.gserviceaccount.com) - Required to protect the function's image. 2. Google Storage service account (service-{project_number}@gs-project-accounts.iam.gserviceaccount.com) - Required to protect the function's source code. If this service account does not exist, deploying a function without a KMS key or retrieving the service agent name provisions it. For more information, see https://cloud.google.com/storage/docs/projects#service-agents and https://cloud.google.com/storage/docs/getting-service-agent#gsutil. Google Cloud Functions delegates access to service agents to protect function resources in internal projects that are not accessible by the end user.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Labels associated with this Cloud Function.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels associated with this Cloud Function.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    @Export(name="maxInstances", type=Integer.class, parameters={})
    private Output<Integer> maxInstances;

    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    public Output<Integer> maxInstances() {
        return this.maxInstances;
    }
    /**
     * A lower bound for the number function instances that may coexist at a given time.
     * 
     */
    @Export(name="minInstances", type=Integer.class, parameters={})
    private Output<Integer> minInstances;

    /**
     * @return A lower bound for the number function instances that may coexist at a given time.
     * 
     */
    public Output<Integer> minInstances() {
        return this.minInstances;
    }
    /**
     * A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either `projects/{project}/global/networks/{network}` or `{network}`, where `{project}` is a project id where the network is defined, and `{network}` is the short name of the network. This field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either `projects/{project}/global/networks/{network}` or `{network}`, where `{project}` is a project id where the network is defined, and `{network}` is the short name of the network. This field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
     * 
     */
    @Export(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * Secret environment variables configuration.
     * 
     */
    @Export(name="secretEnvironmentVariables", type=List.class, parameters={SecretEnvVarResponse.class})
    private Output<List<SecretEnvVarResponse>> secretEnvironmentVariables;

    /**
     * @return Secret environment variables configuration.
     * 
     */
    public Output<List<SecretEnvVarResponse>> secretEnvironmentVariables() {
        return this.secretEnvironmentVariables;
    }
    /**
     * Secret volumes configuration.
     * 
     */
    @Export(name="secretVolumes", type=List.class, parameters={SecretVolumeResponse.class})
    private Output<List<SecretVolumeResponse>> secretVolumes;

    /**
     * @return Secret volumes configuration.
     * 
     */
    public Output<List<SecretVolumeResponse>> secretVolumes() {
        return this.secretVolumes;
    }
    /**
     * The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output<String> serviceAccountEmail;

    /**
     * @return The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip archive which contains the function.
     * 
     */
    @Export(name="sourceArchiveUrl", type=String.class, parameters={})
    private Output<String> sourceArchiveUrl;

    /**
     * @return The Google Cloud Storage URL, starting with `gs://`, pointing to the zip archive which contains the function.
     * 
     */
    public Output<String> sourceArchiveUrl() {
        return this.sourceArchiveUrl;
    }
    /**
     * **Beta Feature** The source repository where a function is hosted.
     * 
     */
    @Export(name="sourceRepository", type=SourceRepositoryResponse.class, parameters={})
    private Output<SourceRepositoryResponse> sourceRepository;

    /**
     * @return **Beta Feature** The source repository where a function is hosted.
     * 
     */
    public Output<SourceRepositoryResponse> sourceRepository() {
        return this.sourceRepository;
    }
    /**
     * Input only. An identifier for Firebase function sources. Disclaimer: This field is only supported for Firebase function deployments.
     * 
     */
    @Export(name="sourceToken", type=String.class, parameters={})
    private Output<String> sourceToken;

    /**
     * @return Input only. An identifier for Firebase function sources. Disclaimer: This field is only supported for Firebase function deployments.
     * 
     */
    public Output<String> sourceToken() {
        return this.sourceToken;
    }
    /**
     * The Google Cloud Storage signed URL used for source uploading, generated by calling [google.cloud.functions.v1.GenerateUploadUrl]. The signature is validated on write methods (Create, Update) The signature is stripped from the Function object on read methods (Get, List)
     * 
     */
    @Export(name="sourceUploadUrl", type=String.class, parameters={})
    private Output<String> sourceUploadUrl;

    /**
     * @return The Google Cloud Storage signed URL used for source uploading, generated by calling [google.cloud.functions.v1.GenerateUploadUrl]. The signature is validated on write methods (Create, Update) The signature is stripped from the Function object on read methods (Get, List)
     * 
     */
    public Output<String> sourceUploadUrl() {
        return this.sourceUploadUrl;
    }
    /**
     * Status of the function deployment.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the function deployment.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }
    /**
     * The last update timestamp of a Cloud Function.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of a Cloud Function.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The version identifier of the Cloud Function. Each deployment attempt results in a new version of a function being created.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return The version identifier of the Cloud Function. Each deployment attempt results in a new version of a function being created.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @Export(name="vpcConnector", type=String.class, parameters={})
    private Output<String> vpcConnector;

    /**
     * @return The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    public Output<String> vpcConnector() {
        return this.vpcConnector;
    }
    /**
     * The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    @Export(name="vpcConnectorEgressSettings", type=String.class, parameters={})
    private Output<String> vpcConnectorEgressSettings;

    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    public Output<String> vpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(String name, @Nullable FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, @Nullable FunctionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudfunctions/v1:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Function(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudfunctions/v1:Function", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Function get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, options);
    }
}
