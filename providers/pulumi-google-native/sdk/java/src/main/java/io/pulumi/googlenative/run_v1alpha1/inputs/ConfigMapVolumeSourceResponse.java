// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1alpha1.inputs.KeyToPathResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Not supported by Cloud Run Adapts a ConfigMap into a volume. The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths.
 * 
 */
public final class ConfigMapVolumeSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigMapVolumeSourceResponse Empty = new ConfigMapVolumeSourceResponse();

    /**
     * (Optional) Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode", required=true)
      private final Integer defaultMode;

    public Integer defaultMode() {
        return this.defaultMode;
    }

    /**
     * (Optional) If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    @Import(name="items", required=true)
      private final List<KeyToPathResponse> items;

    public List<KeyToPathResponse> items() {
        return this.items;
    }

    /**
     * Name of the config.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    @Import(name="optional", required=true)
      private final Boolean optional;

    public Boolean optional() {
        return this.optional;
    }

    public ConfigMapVolumeSourceResponse(
        Integer defaultMode,
        List<KeyToPathResponse> items,
        String name,
        Boolean optional) {
        this.defaultMode = Objects.requireNonNull(defaultMode, "expected parameter 'defaultMode' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.optional = Objects.requireNonNull(optional, "expected parameter 'optional' to be non-null");
    }

    private ConfigMapVolumeSourceResponse() {
        this.defaultMode = null;
        this.items = List.of();
        this.name = null;
        this.optional = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapVolumeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultMode;
        private List<KeyToPathResponse> items;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapVolumeSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder defaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }
        public Builder items(List<KeyToPathResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(KeyToPathResponse... items) {
            return items(List.of(items));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public ConfigMapVolumeSourceResponse build() {
            return new ConfigMapVolumeSourceResponse(defaultMode, items, name, optional);
        }
    }
}
