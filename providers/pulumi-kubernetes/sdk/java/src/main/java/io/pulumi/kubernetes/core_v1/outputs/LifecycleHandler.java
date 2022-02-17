// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ExecAction;
import io.pulumi.kubernetes.core_v1.outputs.HTTPGetAction;
import io.pulumi.kubernetes.core_v1.outputs.TCPSocketAction;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LifecycleHandler {
    /**
     * Exec specifies the action to take.
     * 
     */
    private final @Nullable ExecAction exec;
    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    private final @Nullable HTTPGetAction httpGet;
    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    private final @Nullable TCPSocketAction tcpSocket;

    @OutputCustomType.Constructor({"exec","httpGet","tcpSocket"})
    private LifecycleHandler(
        @Nullable ExecAction exec,
        @Nullable HTTPGetAction httpGet,
        @Nullable TCPSocketAction tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    /**
     * Exec specifies the action to take.
     * 
     */
    public Optional<ExecAction> getExec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<HTTPGetAction> getHttpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    public Optional<TCPSocketAction> getTcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHandler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExecAction exec;
        private @Nullable HTTPGetAction httpGet;
        private @Nullable TCPSocketAction tcpSocket;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleHandler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.httpGet = defaults.httpGet;
    	      this.tcpSocket = defaults.tcpSocket;
        }

        public Builder setExec(@Nullable ExecAction exec) {
            this.exec = exec;
            return this;
        }

        public Builder setHttpGet(@Nullable HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setTcpSocket(@Nullable TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public LifecycleHandler build() {
            return new LifecycleHandler(exec, httpGet, tcpSocket);
        }
    }
}