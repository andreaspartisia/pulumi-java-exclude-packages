// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSecretVersionResult {
    /**
     * The time at which the Secret was created.
     * 
     */
    private final String createTime;
    /**
     * The time at which the Secret was destroyed. Only present if state is DESTROYED.
     * 
     */
    private final String destroyTime;
    /**
     * True if the current state of the SecretVersion is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The resource name of the SecretVersion. Format:
     * `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
     */
    private final String name;
    private final String project;
    private final String secret;
    /**
     * The secret data. No larger than 64KiB.
     * 
     */
    private final String secretData;
    private final String version;

    @OutputCustomType.Constructor
    private GetSecretVersionResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("destroyTime") String destroyTime,
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") String project,
        @OutputCustomType.Parameter("secret") String secret,
        @OutputCustomType.Parameter("secretData") String secretData,
        @OutputCustomType.Parameter("version") String version) {
        this.createTime = createTime;
        this.destroyTime = destroyTime;
        this.enabled = enabled;
        this.id = id;
        this.name = name;
        this.project = project;
        this.secret = secret;
        this.secretData = secretData;
        this.version = version;
    }

    /**
     * The time at which the Secret was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The time at which the Secret was destroyed. Only present if state is DESTROYED.
     * 
    */
    public String getDestroyTime() {
        return this.destroyTime;
    }
    /**
     * True if the current state of the SecretVersion is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name of the SecretVersion. Format:
     * `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    public String getSecret() {
        return this.secret;
    }
    /**
     * The secret data. No larger than 64KiB.
     * 
    */
    public String getSecretData() {
        return this.secretData;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destroyTime;
        private Boolean enabled;
        private String id;
        private String name;
        private String project;
        private String secret;
        private String secretData;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destroyTime = defaults.destroyTime;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.secretData = defaults.secretData;
    	      this.version = defaults.version;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestroyTime(String destroyTime) {
            this.destroyTime = Objects.requireNonNull(destroyTime);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecretData(String secretData) {
            this.secretData = Objects.requireNonNull(secretData);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetSecretVersionResult build() {
            return new GetSecretVersionResult(createTime, destroyTime, enabled, id, name, project, secret, secretData, version);
        }
    }
}
