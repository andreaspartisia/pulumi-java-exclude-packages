// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.kms.outputs.GetKMSCryptoKeyVersionTemplate;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetKMSCryptoKeyResult {
    private final String destroyScheduledDuration;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Boolean importOnly;
    private final String keyRing;
    private final Map<String,String> labels;
    private final String name;
    /**
     * Defines the cryptographic capabilities of the key.
     * 
     */
    private final String purpose;
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as
     * the primary. The first rotation will take place after the specified period. The rotation period has the format
     * of a decimal number with up to 9 fractional digits, followed by the letter s (seconds).
     * 
     */
    private final String rotationPeriod;
    private final Boolean skipInitialVersionCreation;
    private final List<GetKMSCryptoKeyVersionTemplate> versionTemplates;

    @OutputCustomType.Constructor
    private GetKMSCryptoKeyResult(
        @OutputCustomType.Parameter("destroyScheduledDuration") String destroyScheduledDuration,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("importOnly") Boolean importOnly,
        @OutputCustomType.Parameter("keyRing") String keyRing,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("purpose") String purpose,
        @OutputCustomType.Parameter("rotationPeriod") String rotationPeriod,
        @OutputCustomType.Parameter("skipInitialVersionCreation") Boolean skipInitialVersionCreation,
        @OutputCustomType.Parameter("versionTemplates") List<GetKMSCryptoKeyVersionTemplate> versionTemplates) {
        this.destroyScheduledDuration = destroyScheduledDuration;
        this.id = id;
        this.importOnly = importOnly;
        this.keyRing = keyRing;
        this.labels = labels;
        this.name = name;
        this.purpose = purpose;
        this.rotationPeriod = rotationPeriod;
        this.skipInitialVersionCreation = skipInitialVersionCreation;
        this.versionTemplates = versionTemplates;
    }

    public String getDestroyScheduledDuration() {
        return this.destroyScheduledDuration;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Boolean getImportOnly() {
        return this.importOnly;
    }
    public String getKeyRing() {
        return this.keyRing;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    /**
     * Defines the cryptographic capabilities of the key.
     * 
    */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as
     * the primary. The first rotation will take place after the specified period. The rotation period has the format
     * of a decimal number with up to 9 fractional digits, followed by the letter s (seconds).
     * 
    */
    public String getRotationPeriod() {
        return this.rotationPeriod;
    }
    public Boolean getSkipInitialVersionCreation() {
        return this.skipInitialVersionCreation;
    }
    public List<GetKMSCryptoKeyVersionTemplate> getVersionTemplates() {
        return this.versionTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destroyScheduledDuration;
        private String id;
        private Boolean importOnly;
        private String keyRing;
        private Map<String,String> labels;
        private String name;
        private String purpose;
        private String rotationPeriod;
        private Boolean skipInitialVersionCreation;
        private List<GetKMSCryptoKeyVersionTemplate> versionTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destroyScheduledDuration = defaults.destroyScheduledDuration;
    	      this.id = defaults.id;
    	      this.importOnly = defaults.importOnly;
    	      this.keyRing = defaults.keyRing;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.purpose = defaults.purpose;
    	      this.rotationPeriod = defaults.rotationPeriod;
    	      this.skipInitialVersionCreation = defaults.skipInitialVersionCreation;
    	      this.versionTemplates = defaults.versionTemplates;
        }

        public Builder setDestroyScheduledDuration(String destroyScheduledDuration) {
            this.destroyScheduledDuration = Objects.requireNonNull(destroyScheduledDuration);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImportOnly(Boolean importOnly) {
            this.importOnly = Objects.requireNonNull(importOnly);
            return this;
        }

        public Builder setKeyRing(String keyRing) {
            this.keyRing = Objects.requireNonNull(keyRing);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPurpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }

        public Builder setRotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }

        public Builder setSkipInitialVersionCreation(Boolean skipInitialVersionCreation) {
            this.skipInitialVersionCreation = Objects.requireNonNull(skipInitialVersionCreation);
            return this;
        }

        public Builder setVersionTemplates(List<GetKMSCryptoKeyVersionTemplate> versionTemplates) {
            this.versionTemplates = Objects.requireNonNull(versionTemplates);
            return this;
        }
        public GetKMSCryptoKeyResult build() {
            return new GetKMSCryptoKeyResult(destroyScheduledDuration, id, importOnly, keyRing, labels, name, purpose, rotationPeriod, skipInitialVersionCreation, versionTemplates);
        }
    }
}
