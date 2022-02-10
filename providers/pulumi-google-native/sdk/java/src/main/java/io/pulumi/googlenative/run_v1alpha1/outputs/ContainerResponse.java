// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.ContainerPortResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.EnvFromSourceResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.EnvVarResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ProbeResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ResourceRequirementsResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.SecurityContextResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.VolumeMountResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ContainerResponse {
    private final List<String> args;
    private final List<String> command;
    private final List<EnvVarResponse> env;
    private final List<EnvFromSourceResponse> envFrom;
    private final String image;
    private final String imagePullPolicy;
    private final ProbeResponse livenessProbe;
    private final String name;
    private final List<ContainerPortResponse> ports;
    private final ProbeResponse readinessProbe;
    private final ResourceRequirementsResponse resources;
    private final SecurityContextResponse securityContext;
    private final ProbeResponse startupProbe;
    private final String terminationMessagePath;
    private final String terminationMessagePolicy;
    private final List<VolumeMountResponse> volumeMounts;
    private final String workingDir;

    @OutputCustomType.Constructor({"args","command","env","envFrom","image","imagePullPolicy","livenessProbe","name","ports","readinessProbe","resources","securityContext","startupProbe","terminationMessagePath","terminationMessagePolicy","volumeMounts","workingDir"})
    private ContainerResponse(
        List<String> args,
        List<String> command,
        List<EnvVarResponse> env,
        List<EnvFromSourceResponse> envFrom,
        String image,
        String imagePullPolicy,
        ProbeResponse livenessProbe,
        String name,
        List<ContainerPortResponse> ports,
        ProbeResponse readinessProbe,
        ResourceRequirementsResponse resources,
        SecurityContextResponse securityContext,
        ProbeResponse startupProbe,
        String terminationMessagePath,
        String terminationMessagePolicy,
        List<VolumeMountResponse> volumeMounts,
        String workingDir) {
        this.args = Objects.requireNonNull(args);
        this.command = Objects.requireNonNull(command);
        this.env = Objects.requireNonNull(env);
        this.envFrom = Objects.requireNonNull(envFrom);
        this.image = Objects.requireNonNull(image);
        this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy);
        this.livenessProbe = Objects.requireNonNull(livenessProbe);
        this.name = Objects.requireNonNull(name);
        this.ports = Objects.requireNonNull(ports);
        this.readinessProbe = Objects.requireNonNull(readinessProbe);
        this.resources = Objects.requireNonNull(resources);
        this.securityContext = Objects.requireNonNull(securityContext);
        this.startupProbe = Objects.requireNonNull(startupProbe);
        this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath);
        this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy);
        this.volumeMounts = Objects.requireNonNull(volumeMounts);
        this.workingDir = Objects.requireNonNull(workingDir);
    }

    public List<String> getArgs() {
        return this.args;
    }
    public List<String> getCommand() {
        return this.command;
    }
    public List<EnvVarResponse> getEnv() {
        return this.env;
    }
    public List<EnvFromSourceResponse> getEnvFrom() {
        return this.envFrom;
    }
    public String getImage() {
        return this.image;
    }
    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }
    public ProbeResponse getLivenessProbe() {
        return this.livenessProbe;
    }
    public String getName() {
        return this.name;
    }
    public List<ContainerPortResponse> getPorts() {
        return this.ports;
    }
    public ProbeResponse getReadinessProbe() {
        return this.readinessProbe;
    }
    public ResourceRequirementsResponse getResources() {
        return this.resources;
    }
    public SecurityContextResponse getSecurityContext() {
        return this.securityContext;
    }
    public ProbeResponse getStartupProbe() {
        return this.startupProbe;
    }
    public String getTerminationMessagePath() {
        return this.terminationMessagePath;
    }
    public String getTerminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }
    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> command;
        private List<EnvVarResponse> env;
        private List<EnvFromSourceResponse> envFrom;
        private String image;
        private String imagePullPolicy;
        private ProbeResponse livenessProbe;
        private String name;
        private List<ContainerPortResponse> ports;
        private ProbeResponse readinessProbe;
        private ResourceRequirementsResponse resources;
        private SecurityContextResponse securityContext;
        private ProbeResponse startupProbe;
        private String terminationMessagePath;
        private String terminationMessagePolicy;
        private List<VolumeMountResponse> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
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

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setEnv(List<EnvVarResponse> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setEnvFrom(List<EnvFromSourceResponse> envFrom) {
            this.envFrom = Objects.requireNonNull(envFrom);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy);
            return this;
        }

        public Builder setLivenessProbe(ProbeResponse livenessProbe) {
            this.livenessProbe = Objects.requireNonNull(livenessProbe);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPorts(List<ContainerPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setReadinessProbe(ProbeResponse readinessProbe) {
            this.readinessProbe = Objects.requireNonNull(readinessProbe);
            return this;
        }

        public Builder setResources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSecurityContext(SecurityContextResponse securityContext) {
            this.securityContext = Objects.requireNonNull(securityContext);
            return this;
        }

        public Builder setStartupProbe(ProbeResponse startupProbe) {
            this.startupProbe = Objects.requireNonNull(startupProbe);
            return this;
        }

        public Builder setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath);
            return this;
        }

        public Builder setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy);
            return this;
        }

        public Builder setVolumeMounts(List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }

        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}