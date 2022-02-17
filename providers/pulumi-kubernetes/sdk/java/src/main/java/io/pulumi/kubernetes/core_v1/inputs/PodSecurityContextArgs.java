// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.SELinuxOptionsArgs;
import io.pulumi.kubernetes.core_v1.inputs.SeccompProfileArgs;
import io.pulumi.kubernetes.core_v1.inputs.SysctlArgs;
import io.pulumi.kubernetes.core_v1.inputs.WindowsSecurityContextOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 * 
 */
public final class PodSecurityContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodSecurityContextArgs Empty = new PodSecurityContextArgs();

    /**
     * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="fsGroup")
    private final @Nullable Input<Integer> fsGroup;

    public Input<Integer> getFsGroup() {
        return this.fsGroup == null ? Input.empty() : this.fsGroup;
    }

    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="fsGroupChangePolicy")
    private final @Nullable Input<String> fsGroupChangePolicy;

    public Input<String> getFsGroupChangePolicy() {
        return this.fsGroupChangePolicy == null ? Input.empty() : this.fsGroupChangePolicy;
    }

    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="runAsGroup")
    private final @Nullable Input<Integer> runAsGroup;

    public Input<Integer> getRunAsGroup() {
        return this.runAsGroup == null ? Input.empty() : this.runAsGroup;
    }

    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @InputImport(name="runAsNonRoot")
    private final @Nullable Input<Boolean> runAsNonRoot;

    public Input<Boolean> getRunAsNonRoot() {
        return this.runAsNonRoot == null ? Input.empty() : this.runAsNonRoot;
    }

    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="runAsUser")
    private final @Nullable Input<Integer> runAsUser;

    public Input<Integer> getRunAsUser() {
        return this.runAsUser == null ? Input.empty() : this.runAsUser;
    }

    /**
     * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="seLinuxOptions")
    private final @Nullable Input<SELinuxOptionsArgs> seLinuxOptions;

    public Input<SELinuxOptionsArgs> getSeLinuxOptions() {
        return this.seLinuxOptions == null ? Input.empty() : this.seLinuxOptions;
    }

    /**
     * The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="seccompProfile")
    private final @Nullable Input<SeccompProfileArgs> seccompProfile;

    public Input<SeccompProfileArgs> getSeccompProfile() {
        return this.seccompProfile == null ? Input.empty() : this.seccompProfile;
    }

    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="supplementalGroups")
    private final @Nullable Input<List<Integer>> supplementalGroups;

    public Input<List<Integer>> getSupplementalGroups() {
        return this.supplementalGroups == null ? Input.empty() : this.supplementalGroups;
    }

    /**
     * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @InputImport(name="sysctls")
    private final @Nullable Input<List<SysctlArgs>> sysctls;

    public Input<List<SysctlArgs>> getSysctls() {
        return this.sysctls == null ? Input.empty() : this.sysctls;
    }

    /**
     * The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    @InputImport(name="windowsOptions")
    private final @Nullable Input<WindowsSecurityContextOptionsArgs> windowsOptions;

    public Input<WindowsSecurityContextOptionsArgs> getWindowsOptions() {
        return this.windowsOptions == null ? Input.empty() : this.windowsOptions;
    }

    public PodSecurityContextArgs(
        @Nullable Input<Integer> fsGroup,
        @Nullable Input<String> fsGroupChangePolicy,
        @Nullable Input<Integer> runAsGroup,
        @Nullable Input<Boolean> runAsNonRoot,
        @Nullable Input<Integer> runAsUser,
        @Nullable Input<SELinuxOptionsArgs> seLinuxOptions,
        @Nullable Input<SeccompProfileArgs> seccompProfile,
        @Nullable Input<List<Integer>> supplementalGroups,
        @Nullable Input<List<SysctlArgs>> sysctls,
        @Nullable Input<WindowsSecurityContextOptionsArgs> windowsOptions) {
        this.fsGroup = fsGroup;
        this.fsGroupChangePolicy = fsGroupChangePolicy;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
        this.windowsOptions = windowsOptions;
    }

    private PodSecurityContextArgs() {
        this.fsGroup = Input.empty();
        this.fsGroupChangePolicy = Input.empty();
        this.runAsGroup = Input.empty();
        this.runAsNonRoot = Input.empty();
        this.runAsUser = Input.empty();
        this.seLinuxOptions = Input.empty();
        this.seccompProfile = Input.empty();
        this.supplementalGroups = Input.empty();
        this.sysctls = Input.empty();
        this.windowsOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fsGroup;
        private @Nullable Input<String> fsGroupChangePolicy;
        private @Nullable Input<Integer> runAsGroup;
        private @Nullable Input<Boolean> runAsNonRoot;
        private @Nullable Input<Integer> runAsUser;
        private @Nullable Input<SELinuxOptionsArgs> seLinuxOptions;
        private @Nullable Input<SeccompProfileArgs> seccompProfile;
        private @Nullable Input<List<Integer>> supplementalGroups;
        private @Nullable Input<List<SysctlArgs>> sysctls;
        private @Nullable Input<WindowsSecurityContextOptionsArgs> windowsOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsGroup = defaults.fsGroup;
    	      this.fsGroupChangePolicy = defaults.fsGroupChangePolicy;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.supplementalGroups = defaults.supplementalGroups;
    	      this.sysctls = defaults.sysctls;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        public Builder setFsGroup(@Nullable Input<Integer> fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        public Builder setFsGroup(@Nullable Integer fsGroup) {
            this.fsGroup = Input.ofNullable(fsGroup);
            return this;
        }

        public Builder setFsGroupChangePolicy(@Nullable Input<String> fsGroupChangePolicy) {
            this.fsGroupChangePolicy = fsGroupChangePolicy;
            return this;
        }

        public Builder setFsGroupChangePolicy(@Nullable String fsGroupChangePolicy) {
            this.fsGroupChangePolicy = Input.ofNullable(fsGroupChangePolicy);
            return this;
        }

        public Builder setRunAsGroup(@Nullable Input<Integer> runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        public Builder setRunAsGroup(@Nullable Integer runAsGroup) {
            this.runAsGroup = Input.ofNullable(runAsGroup);
            return this;
        }

        public Builder setRunAsNonRoot(@Nullable Input<Boolean> runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        public Builder setRunAsNonRoot(@Nullable Boolean runAsNonRoot) {
            this.runAsNonRoot = Input.ofNullable(runAsNonRoot);
            return this;
        }

        public Builder setRunAsUser(@Nullable Input<Integer> runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        public Builder setRunAsUser(@Nullable Integer runAsUser) {
            this.runAsUser = Input.ofNullable(runAsUser);
            return this;
        }

        public Builder setSeLinuxOptions(@Nullable Input<SELinuxOptionsArgs> seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        public Builder setSeLinuxOptions(@Nullable SELinuxOptionsArgs seLinuxOptions) {
            this.seLinuxOptions = Input.ofNullable(seLinuxOptions);
            return this;
        }

        public Builder setSeccompProfile(@Nullable Input<SeccompProfileArgs> seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        public Builder setSeccompProfile(@Nullable SeccompProfileArgs seccompProfile) {
            this.seccompProfile = Input.ofNullable(seccompProfile);
            return this;
        }

        public Builder setSupplementalGroups(@Nullable Input<List<Integer>> supplementalGroups) {
            this.supplementalGroups = supplementalGroups;
            return this;
        }

        public Builder setSupplementalGroups(@Nullable List<Integer> supplementalGroups) {
            this.supplementalGroups = Input.ofNullable(supplementalGroups);
            return this;
        }

        public Builder setSysctls(@Nullable Input<List<SysctlArgs>> sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        public Builder setSysctls(@Nullable List<SysctlArgs> sysctls) {
            this.sysctls = Input.ofNullable(sysctls);
            return this;
        }

        public Builder setWindowsOptions(@Nullable Input<WindowsSecurityContextOptionsArgs> windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        public Builder setWindowsOptions(@Nullable WindowsSecurityContextOptionsArgs windowsOptions) {
            this.windowsOptions = Input.ofNullable(windowsOptions);
            return this;
        }

        public PodSecurityContextArgs build() {
            return new PodSecurityContextArgs(fsGroup, fsGroupChangePolicy, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, supplementalGroups, sysctls, windowsOptions);
        }
    }
}