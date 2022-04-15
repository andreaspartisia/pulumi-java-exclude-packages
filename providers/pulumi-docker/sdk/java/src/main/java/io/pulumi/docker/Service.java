// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.docker.ServiceArgs;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.ServiceState;
import io.pulumi.docker.outputs.ServiceAuth;
import io.pulumi.docker.outputs.ServiceConvergeConfig;
import io.pulumi.docker.outputs.ServiceEndpointSpec;
import io.pulumi.docker.outputs.ServiceLabel;
import io.pulumi.docker.outputs.ServiceMode;
import io.pulumi.docker.outputs.ServiceRollbackConfig;
import io.pulumi.docker.outputs.ServiceTaskSpec;
import io.pulumi.docker.outputs.ServiceUpdateConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### Example Assuming you created a `service` as follows #!/bin/bash docker service create --name foo -p 8080:80 nginx # prints th ID 4pcphbxkfn2rffhbhe6czytgi you provide the definition for the resource as follows terraform resource "docker_service" "foo" {
 * 
 *  name = "foo"
 * 
 *  task_spec {
 * 
 *  container_spec {
 * 
 *  image = "nginx"
 * 
 *  }
 * 
 *  }
 * 
 *  endpoint_spec {
 * 
 *  ports {
 * 
 *  target_port
 * 
 * = "80"
 * 
 *  published_port = "8080"
 * 
 *  }
 * 
 *  } } then the import command is as follows #!/bin/bash
 * 
 * ```sh
 *  $ pulumi import docker:index/service:Service foo 4pcphbxkfn2rffhbhe6czytgi
 * ```
 * 
 */
@ResourceType(type="docker:index/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for the authentication for pulling the images of the service
     * 
     */
    @Export(name="auth", type=ServiceAuth.class, parameters={})
    private Output</* @Nullable */ ServiceAuth> auth;

    /**
     * @return Configuration for the authentication for pulling the images of the service
     * 
     */
    public Output</* @Nullable */ ServiceAuth> auth() {
        return this.auth;
    }
    /**
     * A configuration to ensure that a service converges aka reaches the desired that of all task up and running
     * 
     */
    @Export(name="convergeConfig", type=ServiceConvergeConfig.class, parameters={})
    private Output</* @Nullable */ ServiceConvergeConfig> convergeConfig;

    /**
     * @return A configuration to ensure that a service converges aka reaches the desired that of all task up and running
     * 
     */
    public Output</* @Nullable */ ServiceConvergeConfig> convergeConfig() {
        return this.convergeConfig;
    }
    /**
     * Properties that can be configured to access and load balance a service
     * 
     */
    @Export(name="endpointSpec", type=ServiceEndpointSpec.class, parameters={})
    private Output<ServiceEndpointSpec> endpointSpec;

    /**
     * @return Properties that can be configured to access and load balance a service
     * 
     */
    public Output<ServiceEndpointSpec> endpointSpec() {
        return this.endpointSpec;
    }
    /**
     * User-defined key/value metadata
     * 
     */
    @Export(name="labels", type=List.class, parameters={ServiceLabel.class})
    private Output<List<ServiceLabel>> labels;

    /**
     * @return User-defined key/value metadata
     * 
     */
    public Output<List<ServiceLabel>> labels() {
        return this.labels;
    }
    /**
     * Scheduling mode for the service
     * 
     */
    @Export(name="mode", type=ServiceMode.class, parameters={})
    private Output<ServiceMode> mode;

    /**
     * @return Scheduling mode for the service
     * 
     */
    public Output<ServiceMode> mode() {
        return this.mode;
    }
    /**
     * Name of the service
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specification for the rollback strategy of the service
     * 
     */
    @Export(name="rollbackConfig", type=ServiceRollbackConfig.class, parameters={})
    private Output</* @Nullable */ ServiceRollbackConfig> rollbackConfig;

    /**
     * @return Specification for the rollback strategy of the service
     * 
     */
    public Output</* @Nullable */ ServiceRollbackConfig> rollbackConfig() {
        return this.rollbackConfig;
    }
    /**
     * User modifiable task configuration
     * 
     */
    @Export(name="taskSpec", type=ServiceTaskSpec.class, parameters={})
    private Output<ServiceTaskSpec> taskSpec;

    /**
     * @return User modifiable task configuration
     * 
     */
    public Output<ServiceTaskSpec> taskSpec() {
        return this.taskSpec;
    }
    /**
     * Specification for the update strategy of the service
     * 
     */
    @Export(name="updateConfig", type=ServiceUpdateConfig.class, parameters={})
    private Output</* @Nullable */ ServiceUpdateConfig> updateConfig;

    /**
     * @return Specification for the update strategy of the service
     * 
     */
    public Output</* @Nullable */ ServiceUpdateConfig> updateConfig() {
        return this.updateConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/service:Service", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
