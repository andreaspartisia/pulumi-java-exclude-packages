// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FileContentBufferResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InitialStateConfigResponse {
    /**
     * The Key Database (db).
     * 
     */
    private final List<FileContentBufferResponse> dbs;
    /**
     * The forbidden key database (dbx).
     * 
     */
    private final List<FileContentBufferResponse> dbxs;
    /**
     * The Key Exchange Key (KEK).
     * 
     */
    private final List<FileContentBufferResponse> keks;
    /**
     * The Platform Key (PK).
     * 
     */
    private final FileContentBufferResponse pk;

    @CustomType.Constructor
    private InitialStateConfigResponse(
        @CustomType.Parameter("dbs") List<FileContentBufferResponse> dbs,
        @CustomType.Parameter("dbxs") List<FileContentBufferResponse> dbxs,
        @CustomType.Parameter("keks") List<FileContentBufferResponse> keks,
        @CustomType.Parameter("pk") FileContentBufferResponse pk) {
        this.dbs = dbs;
        this.dbxs = dbxs;
        this.keks = keks;
        this.pk = pk;
    }

    /**
     * The Key Database (db).
     * 
    */
    public List<FileContentBufferResponse> dbs() {
        return this.dbs;
    }
    /**
     * The forbidden key database (dbx).
     * 
    */
    public List<FileContentBufferResponse> dbxs() {
        return this.dbxs;
    }
    /**
     * The Key Exchange Key (KEK).
     * 
    */
    public List<FileContentBufferResponse> keks() {
        return this.keks;
    }
    /**
     * The Platform Key (PK).
     * 
    */
    public FileContentBufferResponse pk() {
        return this.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitialStateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileContentBufferResponse> dbs;
        private List<FileContentBufferResponse> dbxs;
        private List<FileContentBufferResponse> keks;
        private FileContentBufferResponse pk;

        public Builder() {
    	      // Empty
        }

        public Builder(InitialStateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbs = defaults.dbs;
    	      this.dbxs = defaults.dbxs;
    	      this.keks = defaults.keks;
    	      this.pk = defaults.pk;
        }

        public Builder dbs(List<FileContentBufferResponse> dbs) {
            this.dbs = Objects.requireNonNull(dbs);
            return this;
        }
        public Builder dbs(FileContentBufferResponse... dbs) {
            return dbs(List.of(dbs));
        }
        public Builder dbxs(List<FileContentBufferResponse> dbxs) {
            this.dbxs = Objects.requireNonNull(dbxs);
            return this;
        }
        public Builder dbxs(FileContentBufferResponse... dbxs) {
            return dbxs(List.of(dbxs));
        }
        public Builder keks(List<FileContentBufferResponse> keks) {
            this.keks = Objects.requireNonNull(keks);
            return this;
        }
        public Builder keks(FileContentBufferResponse... keks) {
            return keks(List.of(keks));
        }
        public Builder pk(FileContentBufferResponse pk) {
            this.pk = Objects.requireNonNull(pk);
            return this;
        }        public InitialStateConfigResponse build() {
            return new InitialStateConfigResponse(dbs, dbxs, keks, pk);
        }
    }
}
