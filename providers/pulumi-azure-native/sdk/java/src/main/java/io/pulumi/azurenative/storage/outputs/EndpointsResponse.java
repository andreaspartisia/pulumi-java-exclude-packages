// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.StorageAccountInternetEndpointsResponse;
import io.pulumi.azurenative.storage.outputs.StorageAccountMicrosoftEndpointsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointsResponse {
    private final String blob;
    private final String dfs;
    private final String file;
    private final @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
    private final @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
    private final String queue;
    private final String table;
    private final String web;

    @OutputCustomType.Constructor({"blob","dfs","file","internetEndpoints","microsoftEndpoints","queue","table","web"})
    private EndpointsResponse(
        String blob,
        String dfs,
        String file,
        @Nullable StorageAccountInternetEndpointsResponse internetEndpoints,
        @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints,
        String queue,
        String table,
        String web) {
        this.blob = Objects.requireNonNull(blob);
        this.dfs = Objects.requireNonNull(dfs);
        this.file = Objects.requireNonNull(file);
        this.internetEndpoints = internetEndpoints;
        this.microsoftEndpoints = microsoftEndpoints;
        this.queue = Objects.requireNonNull(queue);
        this.table = Objects.requireNonNull(table);
        this.web = Objects.requireNonNull(web);
    }

    public String getBlob() {
        return this.blob;
    }
    public String getDfs() {
        return this.dfs;
    }
    public String getFile() {
        return this.file;
    }
    public Optional<StorageAccountInternetEndpointsResponse> getInternetEndpoints() {
        return Optional.ofNullable(this.internetEndpoints);
    }
    public Optional<StorageAccountMicrosoftEndpointsResponse> getMicrosoftEndpoints() {
        return Optional.ofNullable(this.microsoftEndpoints);
    }
    public String getQueue() {
        return this.queue;
    }
    public String getTable() {
        return this.table;
    }
    public String getWeb() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
        private @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
        private String queue;
        private String table;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.internetEndpoints = defaults.internetEndpoints;
    	      this.microsoftEndpoints = defaults.microsoftEndpoints;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
    	      this.web = defaults.web;
        }

        public Builder setBlob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }

        public Builder setDfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }

        public Builder setFile(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setInternetEndpoints(@Nullable StorageAccountInternetEndpointsResponse internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }

        public Builder setMicrosoftEndpoints(@Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints) {
            this.microsoftEndpoints = microsoftEndpoints;
            return this;
        }

        public Builder setQueue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }

        public Builder setTable(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setWeb(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }

        public EndpointsResponse build() {
            return new EndpointsResponse(blob, dfs, file, internetEndpoints, microsoftEndpoints, queue, table, web);
        }
    }
}