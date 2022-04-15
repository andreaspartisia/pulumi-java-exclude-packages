// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the configuration for FHIR profiles and validation.
 * 
 */
public final class ValidationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidationConfigArgs Empty = new ValidationConfigArgs();

    /**
     * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @Import(name="disableFhirpathValidation")
      private final @Nullable Output<Boolean> disableFhirpathValidation;

    public Output<Boolean> disableFhirpathValidation() {
        return this.disableFhirpathValidation == null ? Codegen.empty() : this.disableFhirpathValidation;
    }

    /**
     * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against structure definitions in this FHIR store.
     * 
     */
    @Import(name="disableProfileValidation")
      private final @Nullable Output<Boolean> disableProfileValidation;

    public Output<Boolean> disableProfileValidation() {
        return this.disableProfileValidation == null ? Codegen.empty() : this.disableProfileValidation;
    }

    /**
     * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @Import(name="disableReferenceTypeValidation")
      private final @Nullable Output<Boolean> disableReferenceTypeValidation;

    public Output<Boolean> disableReferenceTypeValidation() {
        return this.disableReferenceTypeValidation == null ? Codegen.empty() : this.disableReferenceTypeValidation;
    }

    /**
     * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @Import(name="disableRequiredFieldValidation")
      private final @Nullable Output<Boolean> disableRequiredFieldValidation;

    public Output<Boolean> disableRequiredFieldValidation() {
        return this.disableRequiredFieldValidation == null ? Codegen.empty() : this.disableRequiredFieldValidation;
    }

    /**
     * A list of implementation guide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
     * 
     */
    @Import(name="enabledImplementationGuides")
      private final @Nullable Output<List<String>> enabledImplementationGuides;

    public Output<List<String>> enabledImplementationGuides() {
        return this.enabledImplementationGuides == null ? Codegen.empty() : this.enabledImplementationGuides;
    }

    public ValidationConfigArgs(
        @Nullable Output<Boolean> disableFhirpathValidation,
        @Nullable Output<Boolean> disableProfileValidation,
        @Nullable Output<Boolean> disableReferenceTypeValidation,
        @Nullable Output<Boolean> disableRequiredFieldValidation,
        @Nullable Output<List<String>> enabledImplementationGuides) {
        this.disableFhirpathValidation = disableFhirpathValidation;
        this.disableProfileValidation = disableProfileValidation;
        this.disableReferenceTypeValidation = disableReferenceTypeValidation;
        this.disableRequiredFieldValidation = disableRequiredFieldValidation;
        this.enabledImplementationGuides = enabledImplementationGuides;
    }

    private ValidationConfigArgs() {
        this.disableFhirpathValidation = Codegen.empty();
        this.disableProfileValidation = Codegen.empty();
        this.disableReferenceTypeValidation = Codegen.empty();
        this.disableRequiredFieldValidation = Codegen.empty();
        this.enabledImplementationGuides = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableFhirpathValidation;
        private @Nullable Output<Boolean> disableProfileValidation;
        private @Nullable Output<Boolean> disableReferenceTypeValidation;
        private @Nullable Output<Boolean> disableRequiredFieldValidation;
        private @Nullable Output<List<String>> enabledImplementationGuides;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFhirpathValidation = defaults.disableFhirpathValidation;
    	      this.disableProfileValidation = defaults.disableProfileValidation;
    	      this.disableReferenceTypeValidation = defaults.disableReferenceTypeValidation;
    	      this.disableRequiredFieldValidation = defaults.disableRequiredFieldValidation;
    	      this.enabledImplementationGuides = defaults.enabledImplementationGuides;
        }

        public Builder disableFhirpathValidation(@Nullable Output<Boolean> disableFhirpathValidation) {
            this.disableFhirpathValidation = disableFhirpathValidation;
            return this;
        }
        public Builder disableFhirpathValidation(@Nullable Boolean disableFhirpathValidation) {
            this.disableFhirpathValidation = Codegen.ofNullable(disableFhirpathValidation);
            return this;
        }
        public Builder disableProfileValidation(@Nullable Output<Boolean> disableProfileValidation) {
            this.disableProfileValidation = disableProfileValidation;
            return this;
        }
        public Builder disableProfileValidation(@Nullable Boolean disableProfileValidation) {
            this.disableProfileValidation = Codegen.ofNullable(disableProfileValidation);
            return this;
        }
        public Builder disableReferenceTypeValidation(@Nullable Output<Boolean> disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = disableReferenceTypeValidation;
            return this;
        }
        public Builder disableReferenceTypeValidation(@Nullable Boolean disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = Codegen.ofNullable(disableReferenceTypeValidation);
            return this;
        }
        public Builder disableRequiredFieldValidation(@Nullable Output<Boolean> disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = disableRequiredFieldValidation;
            return this;
        }
        public Builder disableRequiredFieldValidation(@Nullable Boolean disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = Codegen.ofNullable(disableRequiredFieldValidation);
            return this;
        }
        public Builder enabledImplementationGuides(@Nullable Output<List<String>> enabledImplementationGuides) {
            this.enabledImplementationGuides = enabledImplementationGuides;
            return this;
        }
        public Builder enabledImplementationGuides(@Nullable List<String> enabledImplementationGuides) {
            this.enabledImplementationGuides = Codegen.ofNullable(enabledImplementationGuides);
            return this;
        }
        public Builder enabledImplementationGuides(String... enabledImplementationGuides) {
            return enabledImplementationGuides(List.of(enabledImplementationGuides));
        }        public ValidationConfigArgs build() {
            return new ValidationConfigArgs(disableFhirpathValidation, disableProfileValidation, disableReferenceTypeValidation, disableRequiredFieldValidation, enabledImplementationGuides);
        }
    }
}
