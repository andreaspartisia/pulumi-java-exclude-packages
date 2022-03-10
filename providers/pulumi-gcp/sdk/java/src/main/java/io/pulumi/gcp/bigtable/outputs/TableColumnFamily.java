// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableColumnFamily {
    /**
     * The name of the column family.
     * 
     */
    private final String family;

    @OutputCustomType.Constructor
    private TableColumnFamily(@OutputCustomType.Parameter("family") String family) {
        this.family = family;
    }

    /**
     * The name of the column family.
     * 
    */
    public String getFamily() {
        return this.family;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumnFamily defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String family;

        public Builder() {
    	      // Empty
        }

        public Builder(TableColumnFamily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
        }

        public Builder setFamily(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public TableColumnFamily build() {
            return new TableColumnFamily(family);
        }
    }
}
