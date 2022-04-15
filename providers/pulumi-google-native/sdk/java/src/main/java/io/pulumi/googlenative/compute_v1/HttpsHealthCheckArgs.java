// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpsHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpsHealthCheckArgs Empty = new HttpsHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Import(name="checkIntervalSec")
      private final @Nullable Output<Integer> checkIntervalSec;

    public Output<Integer> checkIntervalSec() {
        return this.checkIntervalSec == null ? Codegen.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> healthyThreshold() {
        return this.healthyThreshold == null ? Codegen.empty() : this.healthyThreshold;
    }

    /**
     * The value of the host header in the HTTPS health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> host() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The TCP port number for the HTTPS health check request. The default value is 443.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The request path of the HTTPS health check request. The default value is "/".
     * 
     */
    @Import(name="requestPath")
      private final @Nullable Output<String> requestPath;

    public Output<String> requestPath() {
        return this.requestPath == null ? Codegen.empty() : this.requestPath;
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have a greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> timeoutSec() {
        return this.timeoutSec == null ? Codegen.empty() : this.timeoutSec;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> unhealthyThreshold() {
        return this.unhealthyThreshold == null ? Codegen.empty() : this.unhealthyThreshold;
    }

    public HttpsHealthCheckArgs(
        @Nullable Output<Integer> checkIntervalSec,
        @Nullable Output<String> description,
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<String> host,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<Integer> port,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<String> requestPath,
        @Nullable Output<Integer> timeoutSec,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.description = description;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.kind = kind;
        this.name = name;
        this.port = port;
        this.project = project;
        this.requestId = requestId;
        this.requestPath = requestPath;
        this.timeoutSec = timeoutSec;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HttpsHealthCheckArgs() {
        this.checkIntervalSec = Codegen.empty();
        this.description = Codegen.empty();
        this.healthyThreshold = Codegen.empty();
        this.host = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.port = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.requestPath = Codegen.empty();
        this.timeoutSec = Codegen.empty();
        this.unhealthyThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpsHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> checkIntervalSec;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<String> host;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> requestPath;
        private @Nullable Output<Integer> timeoutSec;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpsHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.description = defaults.description;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.requestPath = defaults.requestPath;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }
        public Builder checkIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Codegen.ofNullable(checkIntervalSec);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Codegen.ofNullable(healthyThreshold);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder requestPath(@Nullable Output<String> requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public Builder requestPath(@Nullable String requestPath) {
            this.requestPath = Codegen.ofNullable(requestPath);
            return this;
        }
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Codegen.ofNullable(timeoutSec);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Codegen.ofNullable(unhealthyThreshold);
            return this;
        }        public HttpsHealthCheckArgs build() {
            return new HttpsHealthCheckArgs(checkIntervalSec, description, healthyThreshold, host, kind, name, port, project, requestId, requestPath, timeoutSec, unhealthyThreshold);
        }
    }
}
