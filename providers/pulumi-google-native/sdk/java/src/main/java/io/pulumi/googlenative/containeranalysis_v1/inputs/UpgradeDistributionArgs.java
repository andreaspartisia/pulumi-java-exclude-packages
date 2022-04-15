// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Upgrade Distribution represents metadata about the Upgrade for each operating system (CPE). Some distributions have additional metadata around updates, classifying them into various categories and severities.
 * 
 */
public final class UpgradeDistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradeDistributionArgs Empty = new UpgradeDistributionArgs();

    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * 
     */
    @Import(name="classification")
      private final @Nullable Output<String> classification;

    public Output<String> classification() {
        return this.classification == null ? Codegen.empty() : this.classification;
    }

    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    @Import(name="cpeUri")
      private final @Nullable Output<String> cpeUri;

    public Output<String> cpeUri() {
        return this.cpeUri == null ? Codegen.empty() : this.cpeUri;
    }

    /**
     * The cve tied to this Upgrade.
     * 
     */
    @Import(name="cve")
      private final @Nullable Output<List<String>> cve;

    public Output<List<String>> cve() {
        return this.cve == null ? Codegen.empty() : this.cve;
    }

    /**
     * The severity as specified by the upstream operating system.
     * 
     */
    @Import(name="severity")
      private final @Nullable Output<String> severity;

    public Output<String> severity() {
        return this.severity == null ? Codegen.empty() : this.severity;
    }

    public UpgradeDistributionArgs(
        @Nullable Output<String> classification,
        @Nullable Output<String> cpeUri,
        @Nullable Output<List<String>> cve,
        @Nullable Output<String> severity) {
        this.classification = classification;
        this.cpeUri = cpeUri;
        this.cve = cve;
        this.severity = severity;
    }

    private UpgradeDistributionArgs() {
        this.classification = Codegen.empty();
        this.cpeUri = Codegen.empty();
        this.cve = Codegen.empty();
        this.severity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> classification;
        private @Nullable Output<String> cpeUri;
        private @Nullable Output<List<String>> cve;
        private @Nullable Output<String> severity;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeDistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.cpeUri = defaults.cpeUri;
    	      this.cve = defaults.cve;
    	      this.severity = defaults.severity;
        }

        public Builder classification(@Nullable Output<String> classification) {
            this.classification = classification;
            return this;
        }
        public Builder classification(@Nullable String classification) {
            this.classification = Codegen.ofNullable(classification);
            return this;
        }
        public Builder cpeUri(@Nullable Output<String> cpeUri) {
            this.cpeUri = cpeUri;
            return this;
        }
        public Builder cpeUri(@Nullable String cpeUri) {
            this.cpeUri = Codegen.ofNullable(cpeUri);
            return this;
        }
        public Builder cve(@Nullable Output<List<String>> cve) {
            this.cve = cve;
            return this;
        }
        public Builder cve(@Nullable List<String> cve) {
            this.cve = Codegen.ofNullable(cve);
            return this;
        }
        public Builder cve(String... cve) {
            return cve(List.of(cve));
        }
        public Builder severity(@Nullable Output<String> severity) {
            this.severity = severity;
            return this;
        }
        public Builder severity(@Nullable String severity) {
            this.severity = Codegen.ofNullable(severity);
            return this;
        }        public UpgradeDistributionArgs build() {
            return new UpgradeDistributionArgs(classification, cpeUri, cve, severity);
        }
    }
}
