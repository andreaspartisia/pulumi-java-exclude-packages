// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.docker.RegistryImageArgs;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.RegistryImageState;
import io.pulumi.docker.outputs.RegistryImageBuild;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * <!-- Bug: Type and Name are switched -->
 * Manages the lifecycle of docker image/tag in a registry.
 * 
 * ## Example Usage
 * ## Schema
 * 
 * ### Required
 * 
 * - **name** (String) The name of the Docker image.
 * 
 * ### Optional
 * 
 * - **build** (Block List, Max: 1) Definition for building the image (see below for nested schema)
 * - **id** (String) The ID of this resource.
 * - **insecure_skip_verify** (Boolean) If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
 * - **keep_remotely** (Boolean) If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from the docker registry on destroy operation. Defaults to `false`
 * 
 * ### Read-Only
 * 
 * - **sha256_digest** (String) The sha256 digest of the image.
 * 
 * <a id="nestedblock--build"></a>
 * ### Nested Schema for `build`
 * 
 * Required:
 * 
 * - **context** (String) The absolute path to the context folder. You can use the helper function '${path.cwd}/context-dir'.
 * 
 * Optional:
 * 
 * - **auth_config** (Block List) The configuration for the authentication (see below for nested schema)
 * - **build_args** (Map of String) Pairs for build-time variables in the form TODO
 * - **build_id** (String) BuildID is an optional identifier that can be passed together with the build request. The
 * - **cache_from** (List of String) Images to consider as cache sources
 * - **cgroup_parent** (String) Optional parent cgroup for the container
 * - **cpu_period** (Number) The length of a CPU period in microseconds
 * - **cpu_quota** (Number) Microseconds of CPU time that the container can get in a CPU period
 * - **cpu_set_cpus** (String) CPUs in which to allow execution (e.g., `0-3`, `0`, `1`)
 * - **cpu_set_mems** (String) MEMs in which to allow execution (`0-3`, `0`, `1`)
 * - **cpu_shares** (Number) CPU shares (relative weight)
 * - **dockerfile** (String) Dockerfile file. Defaults to `Dockerfile`
 * - **extra_hosts** (List of String) A list of hostnames/IP mappings to add to the container’s /etc/hosts file. Specified in the form ["hostname:IP"]
 * - **force_remove** (Boolean) Always remove intermediate containers
 * - **isolation** (String) Isolation represents the isolation technology of a container. The supported values are
 * - **labels** (Map of String) User-defined key/value metadata
 * - **memory** (Number) Set memory limit for build
 * - **memory_swap** (Number) Total memory (memory + swap), -1 to enable unlimited swap
 * - **network_mode** (String) Set the networking mode for the RUN instructions during build
 * - **no_cache** (Boolean) Do not use the cache when building the image
 * - **platform** (String) Set platform if server is multi-platform capable
 * - **pull_parent** (Boolean) Attempt to pull the image even if an older image exists locally
 * - **remote_context** (String) A Git repository URI or HTTP/HTTPS context URI
 * - **remove** (Boolean) Remove intermediate containers after a successful build (default behavior)
 * - **security_opt** (List of String) The security options
 * - **session_id** (String) Set an ID for the build session
 * - **shm_size** (Number) Size of /dev/shm in bytes. The size must be greater than 0
 * - **squash** (Boolean) If true the new layers are squashed into a new image with a single new layer
 * - **suppress_output** (Boolean) Suppress the build output and print image ID on success
 * - **target** (String) Set the target build stage to build
 * - **ulimit** (Block List) Configuration for ulimits (see below for nested schema)
 * - **version** (String) Version of the unerlying builder to use
 * 
 * <a id="nestedblock--build--auth_config"></a>
 * ### Nested Schema for `build.auth_config`
 * 
 * Required:
 * 
 * - **host_name** (String) hostname of the registry
 * 
 * Optional:
 * 
 * - **auth** (String) the auth token
 * - **email** (String) the user emal
 * - **identity_token** (String) the identity token
 * - **password** (String) the registry password
 * - **registry_token** (String) the registry token
 * - **server_address** (String) the server address
 * - **user_name** (String) the registry user name
 * 
 * <a id="nestedblock--build--ulimit"></a>
 * ### Nested Schema for `build.ulimit`
 * 
 * Required:
 * 
 * - **hard** (Number) soft limit
 * - **name** (String) type of ulimit, e.g. `nofile`
 * - **soft** (Number) hard limit
 * 
 */
@ResourceType(type="docker:index/registryImage:RegistryImage")
public class RegistryImage extends io.pulumi.resources.CustomResource {
    /**
     * Definition for building the image
     * 
     */
    @OutputExport(name="build", type=RegistryImageBuild.class, parameters={})
    private Output</* @Nullable */ RegistryImageBuild> build;

    /**
     * @return Definition for building the image
     * 
     */
    public Output</* @Nullable */ RegistryImageBuild> getBuild() {
        return this.build;
    }
    /**
     * If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     */
    @OutputExport(name="insecureSkipVerify", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> insecureSkipVerify;

    /**
     * @return If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     */
    public Output</* @Nullable */ Boolean> getInsecureSkipVerify() {
        return this.insecureSkipVerify;
    }
    /**
     * If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker registry on destroy operation. Defaults to `false`
     * 
     */
    @OutputExport(name="keepRemotely", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> keepRemotely;

    /**
     * @return If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker registry on destroy operation. Defaults to `false`
     * 
     */
    public Output</* @Nullable */ Boolean> getKeepRemotely() {
        return this.keepRemotely;
    }
    /**
     * The name of the Docker image.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Docker image.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The sha256 digest of the image.
     * 
     */
    @OutputExport(name="sha256Digest", type=String.class, parameters={})
    private Output<String> sha256Digest;

    /**
     * @return The sha256 digest of the image.
     * 
     */
    public Output<String> getSha256Digest() {
        return this.sha256Digest;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryImage(String name) {
        this(name, RegistryImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryImage(String name, @Nullable RegistryImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryImage(String name, @Nullable RegistryImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/registryImage:RegistryImage", name, args == null ? RegistryImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegistryImage(String name, Input<String> id, @Nullable RegistryImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/registryImage:RegistryImage", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegistryImage get(String name, Input<String> id, @Nullable RegistryImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegistryImage(name, id, state, options);
    }
}
