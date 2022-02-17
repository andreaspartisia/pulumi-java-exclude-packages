// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecContainerVolumeMountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerVolumeMountGetArgs Empty = new ServiceTemplateSpecContainerVolumeMountGetArgs();

    /**
     * Path within the container at which the volume should be mounted.  Must
     * not contain ':'.
     * 
     */
    @InputImport(name="mountPath", required=true)
    private final Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath;
    }

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ServiceTemplateSpecContainerVolumeMountGetArgs(
        Input<String> mountPath,
        Input<String> name) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ServiceTemplateSpecContainerVolumeMountGetArgs() {
        this.mountPath = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerVolumeMountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mountPath;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerVolumeMountGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder setMountPath(Input<String> mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Input.of(Objects.requireNonNull(mountPath));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public ServiceTemplateSpecContainerVolumeMountGetArgs build() {
            return new ServiceTemplateSpecContainerVolumeMountGetArgs(mountPath, name);
        }
    }
}