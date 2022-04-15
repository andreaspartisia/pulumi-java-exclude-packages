// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BitbucketServerSecretsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BitbucketServerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final BitbucketServerConfigArgs Empty = new BitbucketServerConfigArgs();

    /**
     * Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Import(name="apiKey", required=true)
      private final Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }

    @Import(name="bitbucketServerConfigId")
      private final @Nullable Output<String> bitbucketServerConfigId;

    public Output<String> bitbucketServerConfigId() {
        return this.bitbucketServerConfigId == null ? Codegen.empty() : this.bitbucketServerConfigId;
    }

    /**
     * Time when the config was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Import(name="hostUri", required=true)
      private final Output<String> hostUri;

    public Output<String> hostUri() {
        return this.hostUri;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name for the config.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @Import(name="peeredNetwork")
      private final @Nullable Output<String> peeredNetwork;

    public Output<String> peeredNetwork() {
        return this.peeredNetwork == null ? Codegen.empty() : this.peeredNetwork;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Secret Manager secrets needed by the config.
     * 
     */
    @Import(name="secrets", required=true)
      private final Output<BitbucketServerSecretsArgs> secrets;

    public Output<BitbucketServerSecretsArgs> secrets() {
        return this.secrets;
    }

    /**
     * Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
     */
    @Import(name="sslCa")
      private final @Nullable Output<String> sslCa;

    public Output<String> sslCa() {
        return this.sslCa == null ? Codegen.empty() : this.sslCa;
    }

    /**
     * Username of the account Cloud Build will use on Bitbucket Server.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public BitbucketServerConfigArgs(
        Output<String> apiKey,
        @Nullable Output<String> bitbucketServerConfigId,
        @Nullable Output<String> createTime,
        Output<String> hostUri,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> peeredNetwork,
        @Nullable Output<String> project,
        Output<BitbucketServerSecretsArgs> secrets,
        @Nullable Output<String> sslCa,
        @Nullable Output<String> username) {
        this.apiKey = Objects.requireNonNull(apiKey, "expected parameter 'apiKey' to be non-null");
        this.bitbucketServerConfigId = bitbucketServerConfigId;
        this.createTime = createTime;
        this.hostUri = Objects.requireNonNull(hostUri, "expected parameter 'hostUri' to be non-null");
        this.location = location;
        this.name = name;
        this.peeredNetwork = peeredNetwork;
        this.project = project;
        this.secrets = Objects.requireNonNull(secrets, "expected parameter 'secrets' to be non-null");
        this.sslCa = sslCa;
        this.username = username;
    }

    private BitbucketServerConfigArgs() {
        this.apiKey = Codegen.empty();
        this.bitbucketServerConfigId = Codegen.empty();
        this.createTime = Codegen.empty();
        this.hostUri = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.peeredNetwork = Codegen.empty();
        this.project = Codegen.empty();
        this.secrets = Codegen.empty();
        this.sslCa = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiKey;
        private @Nullable Output<String> bitbucketServerConfigId;
        private @Nullable Output<String> createTime;
        private Output<String> hostUri;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> peeredNetwork;
        private @Nullable Output<String> project;
        private Output<BitbucketServerSecretsArgs> secrets;
        private @Nullable Output<String> sslCa;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.bitbucketServerConfigId = defaults.bitbucketServerConfigId;
    	      this.createTime = defaults.createTime;
    	      this.hostUri = defaults.hostUri;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peeredNetwork = defaults.peeredNetwork;
    	      this.project = defaults.project;
    	      this.secrets = defaults.secrets;
    	      this.sslCa = defaults.sslCa;
    	      this.username = defaults.username;
        }

        public Builder apiKey(Output<String> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder apiKey(String apiKey) {
            this.apiKey = Output.of(Objects.requireNonNull(apiKey));
            return this;
        }
        public Builder bitbucketServerConfigId(@Nullable Output<String> bitbucketServerConfigId) {
            this.bitbucketServerConfigId = bitbucketServerConfigId;
            return this;
        }
        public Builder bitbucketServerConfigId(@Nullable String bitbucketServerConfigId) {
            this.bitbucketServerConfigId = Codegen.ofNullable(bitbucketServerConfigId);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder hostUri(Output<String> hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }
        public Builder hostUri(String hostUri) {
            this.hostUri = Output.of(Objects.requireNonNull(hostUri));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder peeredNetwork(@Nullable Output<String> peeredNetwork) {
            this.peeredNetwork = peeredNetwork;
            return this;
        }
        public Builder peeredNetwork(@Nullable String peeredNetwork) {
            this.peeredNetwork = Codegen.ofNullable(peeredNetwork);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder secrets(Output<BitbucketServerSecretsArgs> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(BitbucketServerSecretsArgs secrets) {
            this.secrets = Output.of(Objects.requireNonNull(secrets));
            return this;
        }
        public Builder sslCa(@Nullable Output<String> sslCa) {
            this.sslCa = sslCa;
            return this;
        }
        public Builder sslCa(@Nullable String sslCa) {
            this.sslCa = Codegen.ofNullable(sslCa);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public BitbucketServerConfigArgs build() {
            return new BitbucketServerConfigArgs(apiKey, bitbucketServerConfigId, createTime, hostUri, location, name, peeredNetwork, project, secrets, sslCa, username);
        }
    }
}
