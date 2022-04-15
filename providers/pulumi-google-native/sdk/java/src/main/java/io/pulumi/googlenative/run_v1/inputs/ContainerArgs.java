// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.run_v1.inputs.ContainerPortArgs;
import io.pulumi.googlenative.run_v1.inputs.EnvFromSourceArgs;
import io.pulumi.googlenative.run_v1.inputs.EnvVarArgs;
import io.pulumi.googlenative.run_v1.inputs.ProbeArgs;
import io.pulumi.googlenative.run_v1.inputs.ResourceRequirementsArgs;
import io.pulumi.googlenative.run_v1.inputs.SecurityContextArgs;
import io.pulumi.googlenative.run_v1.inputs.VolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> args() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> command() {
        return this.command == null ? Codegen.empty() : this.command;
    }

    /**
     * (Optional) List of environment variables to set in the container.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<List<EnvVarArgs>> env;

    public Output<List<EnvVarArgs>> env() {
        return this.env == null ? Codegen.empty() : this.env;
    }

    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @Import(name="envFrom")
      private final @Nullable Output<List<EnvFromSourceArgs>> envFrom;

    public Output<List<EnvFromSourceArgs>> envFrom() {
        return this.envFrom == null ? Codegen.empty() : this.envFrom;
    }

    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @Import(name="imagePullPolicy")
      private final @Nullable Output<String> imagePullPolicy;

    public Output<String> imagePullPolicy() {
        return this.imagePullPolicy == null ? Codegen.empty() : this.imagePullPolicy;
    }

    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="livenessProbe")
      private final @Nullable Output<ProbeArgs> livenessProbe;

    public Output<ProbeArgs> livenessProbe() {
        return this.livenessProbe == null ? Codegen.empty() : this.livenessProbe;
    }

    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ContainerPortArgs>> ports;

    public Output<List<ContainerPortArgs>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="readinessProbe")
      private final @Nullable Output<ProbeArgs> readinessProbe;

    public Output<ProbeArgs> readinessProbe() {
        return this.readinessProbe == null ? Codegen.empty() : this.readinessProbe;
    }

    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<ResourceRequirementsArgs> resources;

    public Output<ResourceRequirementsArgs> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @Import(name="securityContext")
      private final @Nullable Output<SecurityContextArgs> securityContext;

    public Output<SecurityContextArgs> securityContext() {
        return this.securityContext == null ? Codegen.empty() : this.securityContext;
    }

    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="startupProbe")
      private final @Nullable Output<ProbeArgs> startupProbe;

    public Output<ProbeArgs> startupProbe() {
        return this.startupProbe == null ? Codegen.empty() : this.startupProbe;
    }

    /**
     * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    @Import(name="terminationMessagePath")
      private final @Nullable Output<String> terminationMessagePath;

    public Output<String> terminationMessagePath() {
        return this.terminationMessagePath == null ? Codegen.empty() : this.terminationMessagePath;
    }

    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    @Import(name="terminationMessagePolicy")
      private final @Nullable Output<String> terminationMessagePolicy;

    public Output<String> terminationMessagePolicy() {
        return this.terminationMessagePolicy == null ? Codegen.empty() : this.terminationMessagePolicy;
    }

    /**
     * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<VolumeMountArgs>> volumeMounts;

    public Output<List<VolumeMountArgs>> volumeMounts() {
        return this.volumeMounts == null ? Codegen.empty() : this.volumeMounts;
    }

    /**
     * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
     * 
     */
    @Import(name="workingDir")
      private final @Nullable Output<String> workingDir;

    public Output<String> workingDir() {
        return this.workingDir == null ? Codegen.empty() : this.workingDir;
    }

    public ContainerArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> command,
        @Nullable Output<List<EnvVarArgs>> env,
        @Nullable Output<List<EnvFromSourceArgs>> envFrom,
        @Nullable Output<String> image,
        @Nullable Output<String> imagePullPolicy,
        @Nullable Output<ProbeArgs> livenessProbe,
        @Nullable Output<String> name,
        @Nullable Output<List<ContainerPortArgs>> ports,
        @Nullable Output<ProbeArgs> readinessProbe,
        @Nullable Output<ResourceRequirementsArgs> resources,
        @Nullable Output<SecurityContextArgs> securityContext,
        @Nullable Output<ProbeArgs> startupProbe,
        @Nullable Output<String> terminationMessagePath,
        @Nullable Output<String> terminationMessagePolicy,
        @Nullable Output<List<VolumeMountArgs>> volumeMounts,
        @Nullable Output<String> workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private ContainerArgs() {
        this.args = Codegen.empty();
        this.command = Codegen.empty();
        this.env = Codegen.empty();
        this.envFrom = Codegen.empty();
        this.image = Codegen.empty();
        this.imagePullPolicy = Codegen.empty();
        this.livenessProbe = Codegen.empty();
        this.name = Codegen.empty();
        this.ports = Codegen.empty();
        this.readinessProbe = Codegen.empty();
        this.resources = Codegen.empty();
        this.securityContext = Codegen.empty();
        this.startupProbe = Codegen.empty();
        this.terminationMessagePath = Codegen.empty();
        this.terminationMessagePolicy = Codegen.empty();
        this.volumeMounts = Codegen.empty();
        this.workingDir = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<List<EnvVarArgs>> env;
        private @Nullable Output<List<EnvFromSourceArgs>> envFrom;
        private @Nullable Output<String> image;
        private @Nullable Output<String> imagePullPolicy;
        private @Nullable Output<ProbeArgs> livenessProbe;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ContainerPortArgs>> ports;
        private @Nullable Output<ProbeArgs> readinessProbe;
        private @Nullable Output<ResourceRequirementsArgs> resources;
        private @Nullable Output<SecurityContextArgs> securityContext;
        private @Nullable Output<ProbeArgs> startupProbe;
        private @Nullable Output<String> terminationMessagePath;
        private @Nullable Output<String> terminationMessagePolicy;
        private @Nullable Output<List<VolumeMountArgs>> volumeMounts;
        private @Nullable Output<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }
        public Builder command(@Nullable List<String> command) {
            this.command = Codegen.ofNullable(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder env(@Nullable Output<List<EnvVarArgs>> env) {
            this.env = env;
            return this;
        }
        public Builder env(@Nullable List<EnvVarArgs> env) {
            this.env = Codegen.ofNullable(env);
            return this;
        }
        public Builder env(EnvVarArgs... env) {
            return env(List.of(env));
        }
        public Builder envFrom(@Nullable Output<List<EnvFromSourceArgs>> envFrom) {
            this.envFrom = envFrom;
            return this;
        }
        public Builder envFrom(@Nullable List<EnvFromSourceArgs> envFrom) {
            this.envFrom = Codegen.ofNullable(envFrom);
            return this;
        }
        public Builder envFrom(EnvFromSourceArgs... envFrom) {
            return envFrom(List.of(envFrom));
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder imagePullPolicy(@Nullable Output<String> imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = Codegen.ofNullable(imagePullPolicy);
            return this;
        }
        public Builder livenessProbe(@Nullable Output<ProbeArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public Builder livenessProbe(@Nullable ProbeArgs livenessProbe) {
            this.livenessProbe = Codegen.ofNullable(livenessProbe);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ports(@Nullable Output<List<ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ContainerPortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ContainerPortArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder readinessProbe(@Nullable Output<ProbeArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public Builder readinessProbe(@Nullable ProbeArgs readinessProbe) {
            this.readinessProbe = Codegen.ofNullable(readinessProbe);
            return this;
        }
        public Builder resources(@Nullable Output<ResourceRequirementsArgs> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable ResourceRequirementsArgs resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder securityContext(@Nullable Output<SecurityContextArgs> securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public Builder securityContext(@Nullable SecurityContextArgs securityContext) {
            this.securityContext = Codegen.ofNullable(securityContext);
            return this;
        }
        public Builder startupProbe(@Nullable Output<ProbeArgs> startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }
        public Builder startupProbe(@Nullable ProbeArgs startupProbe) {
            this.startupProbe = Codegen.ofNullable(startupProbe);
            return this;
        }
        public Builder terminationMessagePath(@Nullable Output<String> terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public Builder terminationMessagePath(@Nullable String terminationMessagePath) {
            this.terminationMessagePath = Codegen.ofNullable(terminationMessagePath);
            return this;
        }
        public Builder terminationMessagePolicy(@Nullable Output<String> terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public Builder terminationMessagePolicy(@Nullable String terminationMessagePolicy) {
            this.terminationMessagePolicy = Codegen.ofNullable(terminationMessagePolicy);
            return this;
        }
        public Builder volumeMounts(@Nullable Output<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Codegen.ofNullable(volumeMounts);
            return this;
        }
        public Builder volumeMounts(VolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(@Nullable Output<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = Codegen.ofNullable(workingDir);
            return this;
        }        public ContainerArgs build() {
            return new ContainerArgs(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}
