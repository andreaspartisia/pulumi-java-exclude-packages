// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.AttestationArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildDetailsArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ComplianceOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DSSEAttestationOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DeploymentArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DerivedArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DiscoveredArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DocumentOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.FileOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InstallationArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.PackageInfoOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.RelationshipOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ResourceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.UpgradeOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VulnerabilityDetailsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Import(name="attestation")
      private final @Nullable Output<AttestationArgs> attestation;

    public Output<AttestationArgs> attestation() {
        return this.attestation == null ? Codegen.empty() : this.attestation;
    }

    /**
     * Build details for a verifiable build.
     * 
     */
    @Import(name="buildDetails")
      private final @Nullable Output<BuildDetailsArgs> buildDetails;

    public Output<BuildDetailsArgs> buildDetails() {
        return this.buildDetails == null ? Codegen.empty() : this.buildDetails;
    }

    /**
     * Describes whether or not a resource passes compliance checks.
     * 
     */
    @Import(name="compliance")
      private final @Nullable Output<ComplianceOccurrenceArgs> compliance;

    public Output<ComplianceOccurrenceArgs> compliance() {
        return this.compliance == null ? Codegen.empty() : this.compliance;
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<DeploymentArgs> deployment;

    public Output<DeploymentArgs> deployment() {
        return this.deployment == null ? Codegen.empty() : this.deployment;
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Import(name="derivedImage")
      private final @Nullable Output<DerivedArgs> derivedImage;

    public Output<DerivedArgs> derivedImage() {
        return this.derivedImage == null ? Codegen.empty() : this.derivedImage;
    }

    /**
     * Describes the initial scan status for this resource.
     * 
     */
    @Import(name="discovered")
      private final @Nullable Output<DiscoveredArgs> discovered;

    public Output<DiscoveredArgs> discovered() {
        return this.discovered == null ? Codegen.empty() : this.discovered;
    }

    /**
     * This represents a DSSE attestation occurrence
     * 
     */
    @Import(name="dsseAttestation")
      private final @Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation;

    public Output<DSSEAttestationOccurrenceArgs> dsseAttestation() {
        return this.dsseAttestation == null ? Codegen.empty() : this.dsseAttestation;
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @Import(name="envelope")
      private final @Nullable Output<EnvelopeArgs> envelope;

    public Output<EnvelopeArgs> envelope() {
        return this.envelope == null ? Codegen.empty() : this.envelope;
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Import(name="installation")
      private final @Nullable Output<InstallationArgs> installation;

    public Output<InstallationArgs> installation() {
        return this.installation == null ? Codegen.empty() : this.installation;
    }

    /**
     * An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
     * 
     */
    @Import(name="noteName")
      private final @Nullable Output<String> noteName;

    public Output<String> noteName() {
        return this.noteName == null ? Codegen.empty() : this.noteName;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
     */
    @Import(name="remediation")
      private final @Nullable Output<String> remediation;

    public Output<String> remediation() {
        return this.remediation == null ? Codegen.empty() : this.remediation;
    }

    /**
     *  The resource for which the `Occurrence` applies.
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<ResourceArgs> resource;

    public Output<ResourceArgs> resource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    @Import(name="resourceUrl")
      private final @Nullable Output<String> resourceUrl;

    public Output<String> resourceUrl() {
        return this.resourceUrl == null ? Codegen.empty() : this.resourceUrl;
    }

    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @Import(name="sbom")
      private final @Nullable Output<DocumentOccurrenceArgs> sbom;

    public Output<DocumentOccurrenceArgs> sbom() {
        return this.sbom == null ? Codegen.empty() : this.sbom;
    }

    /**
     * Describes a specific SPDX File.
     * 
     */
    @Import(name="spdxFile")
      private final @Nullable Output<FileOccurrenceArgs> spdxFile;

    public Output<FileOccurrenceArgs> spdxFile() {
        return this.spdxFile == null ? Codegen.empty() : this.spdxFile;
    }

    /**
     * Describes a specific SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
      private final @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;

    public Output<PackageInfoOccurrenceArgs> spdxPackage() {
        return this.spdxPackage == null ? Codegen.empty() : this.spdxPackage;
    }

    /**
     * Describes a specific relationship between SPDX elements.
     * 
     */
    @Import(name="spdxRelationship")
      private final @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;

    public Output<RelationshipOccurrenceArgs> spdxRelationship() {
        return this.spdxRelationship == null ? Codegen.empty() : this.spdxRelationship;
    }

    /**
     * Describes an upgrade.
     * 
     */
    @Import(name="upgrade")
      private final @Nullable Output<UpgradeOccurrenceArgs> upgrade;

    public Output<UpgradeOccurrenceArgs> upgrade() {
        return this.upgrade == null ? Codegen.empty() : this.upgrade;
    }

    /**
     * Details of a security vulnerability note.
     * 
     */
    @Import(name="vulnerabilityDetails")
      private final @Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails;

    public Output<VulnerabilityDetailsArgs> vulnerabilityDetails() {
        return this.vulnerabilityDetails == null ? Codegen.empty() : this.vulnerabilityDetails;
    }

    public OccurrenceArgs(
        @Nullable Output<AttestationArgs> attestation,
        @Nullable Output<BuildDetailsArgs> buildDetails,
        @Nullable Output<ComplianceOccurrenceArgs> compliance,
        @Nullable Output<DeploymentArgs> deployment,
        @Nullable Output<DerivedArgs> derivedImage,
        @Nullable Output<DiscoveredArgs> discovered,
        @Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation,
        @Nullable Output<EnvelopeArgs> envelope,
        @Nullable Output<InstallationArgs> installation,
        @Nullable Output<String> noteName,
        @Nullable Output<String> project,
        @Nullable Output<String> remediation,
        @Nullable Output<ResourceArgs> resource,
        @Nullable Output<String> resourceUrl,
        @Nullable Output<DocumentOccurrenceArgs> sbom,
        @Nullable Output<FileOccurrenceArgs> spdxFile,
        @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage,
        @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship,
        @Nullable Output<UpgradeOccurrenceArgs> upgrade,
        @Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails) {
        this.attestation = attestation;
        this.buildDetails = buildDetails;
        this.compliance = compliance;
        this.deployment = deployment;
        this.derivedImage = derivedImage;
        this.discovered = discovered;
        this.dsseAttestation = dsseAttestation;
        this.envelope = envelope;
        this.installation = installation;
        this.noteName = noteName;
        this.project = project;
        this.remediation = remediation;
        this.resource = resource;
        this.resourceUrl = resourceUrl;
        this.sbom = sbom;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.upgrade = upgrade;
        this.vulnerabilityDetails = vulnerabilityDetails;
    }

    private OccurrenceArgs() {
        this.attestation = Codegen.empty();
        this.buildDetails = Codegen.empty();
        this.compliance = Codegen.empty();
        this.deployment = Codegen.empty();
        this.derivedImage = Codegen.empty();
        this.discovered = Codegen.empty();
        this.dsseAttestation = Codegen.empty();
        this.envelope = Codegen.empty();
        this.installation = Codegen.empty();
        this.noteName = Codegen.empty();
        this.project = Codegen.empty();
        this.remediation = Codegen.empty();
        this.resource = Codegen.empty();
        this.resourceUrl = Codegen.empty();
        this.sbom = Codegen.empty();
        this.spdxFile = Codegen.empty();
        this.spdxPackage = Codegen.empty();
        this.spdxRelationship = Codegen.empty();
        this.upgrade = Codegen.empty();
        this.vulnerabilityDetails = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AttestationArgs> attestation;
        private @Nullable Output<BuildDetailsArgs> buildDetails;
        private @Nullable Output<ComplianceOccurrenceArgs> compliance;
        private @Nullable Output<DeploymentArgs> deployment;
        private @Nullable Output<DerivedArgs> derivedImage;
        private @Nullable Output<DiscoveredArgs> discovered;
        private @Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation;
        private @Nullable Output<EnvelopeArgs> envelope;
        private @Nullable Output<InstallationArgs> installation;
        private @Nullable Output<String> noteName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> remediation;
        private @Nullable Output<ResourceArgs> resource;
        private @Nullable Output<String> resourceUrl;
        private @Nullable Output<DocumentOccurrenceArgs> sbom;
        private @Nullable Output<FileOccurrenceArgs> spdxFile;
        private @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;
        private @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;
        private @Nullable Output<UpgradeOccurrenceArgs> upgrade;
        private @Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.buildDetails = defaults.buildDetails;
    	      this.compliance = defaults.compliance;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.envelope = defaults.envelope;
    	      this.installation = defaults.installation;
    	      this.noteName = defaults.noteName;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.resourceUrl = defaults.resourceUrl;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityDetails = defaults.vulnerabilityDetails;
        }

        public Builder attestation(@Nullable Output<AttestationArgs> attestation) {
            this.attestation = attestation;
            return this;
        }
        public Builder attestation(@Nullable AttestationArgs attestation) {
            this.attestation = Codegen.ofNullable(attestation);
            return this;
        }
        public Builder buildDetails(@Nullable Output<BuildDetailsArgs> buildDetails) {
            this.buildDetails = buildDetails;
            return this;
        }
        public Builder buildDetails(@Nullable BuildDetailsArgs buildDetails) {
            this.buildDetails = Codegen.ofNullable(buildDetails);
            return this;
        }
        public Builder compliance(@Nullable Output<ComplianceOccurrenceArgs> compliance) {
            this.compliance = compliance;
            return this;
        }
        public Builder compliance(@Nullable ComplianceOccurrenceArgs compliance) {
            this.compliance = Codegen.ofNullable(compliance);
            return this;
        }
        public Builder deployment(@Nullable Output<DeploymentArgs> deployment) {
            this.deployment = deployment;
            return this;
        }
        public Builder deployment(@Nullable DeploymentArgs deployment) {
            this.deployment = Codegen.ofNullable(deployment);
            return this;
        }
        public Builder derivedImage(@Nullable Output<DerivedArgs> derivedImage) {
            this.derivedImage = derivedImage;
            return this;
        }
        public Builder derivedImage(@Nullable DerivedArgs derivedImage) {
            this.derivedImage = Codegen.ofNullable(derivedImage);
            return this;
        }
        public Builder discovered(@Nullable Output<DiscoveredArgs> discovered) {
            this.discovered = discovered;
            return this;
        }
        public Builder discovered(@Nullable DiscoveredArgs discovered) {
            this.discovered = Codegen.ofNullable(discovered);
            return this;
        }
        public Builder dsseAttestation(@Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation) {
            this.dsseAttestation = dsseAttestation;
            return this;
        }
        public Builder dsseAttestation(@Nullable DSSEAttestationOccurrenceArgs dsseAttestation) {
            this.dsseAttestation = Codegen.ofNullable(dsseAttestation);
            return this;
        }
        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            this.envelope = envelope;
            return this;
        }
        public Builder envelope(@Nullable EnvelopeArgs envelope) {
            this.envelope = Codegen.ofNullable(envelope);
            return this;
        }
        public Builder installation(@Nullable Output<InstallationArgs> installation) {
            this.installation = installation;
            return this;
        }
        public Builder installation(@Nullable InstallationArgs installation) {
            this.installation = Codegen.ofNullable(installation);
            return this;
        }
        public Builder noteName(@Nullable Output<String> noteName) {
            this.noteName = noteName;
            return this;
        }
        public Builder noteName(@Nullable String noteName) {
            this.noteName = Codegen.ofNullable(noteName);
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
        public Builder remediation(@Nullable Output<String> remediation) {
            this.remediation = remediation;
            return this;
        }
        public Builder remediation(@Nullable String remediation) {
            this.remediation = Codegen.ofNullable(remediation);
            return this;
        }
        public Builder resource(@Nullable Output<ResourceArgs> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable ResourceArgs resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }
        public Builder resourceUrl(@Nullable Output<String> resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public Builder resourceUrl(@Nullable String resourceUrl) {
            this.resourceUrl = Codegen.ofNullable(resourceUrl);
            return this;
        }
        public Builder sbom(@Nullable Output<DocumentOccurrenceArgs> sbom) {
            this.sbom = sbom;
            return this;
        }
        public Builder sbom(@Nullable DocumentOccurrenceArgs sbom) {
            this.sbom = Codegen.ofNullable(sbom);
            return this;
        }
        public Builder spdxFile(@Nullable Output<FileOccurrenceArgs> spdxFile) {
            this.spdxFile = spdxFile;
            return this;
        }
        public Builder spdxFile(@Nullable FileOccurrenceArgs spdxFile) {
            this.spdxFile = Codegen.ofNullable(spdxFile);
            return this;
        }
        public Builder spdxPackage(@Nullable Output<PackageInfoOccurrenceArgs> spdxPackage) {
            this.spdxPackage = spdxPackage;
            return this;
        }
        public Builder spdxPackage(@Nullable PackageInfoOccurrenceArgs spdxPackage) {
            this.spdxPackage = Codegen.ofNullable(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(@Nullable Output<RelationshipOccurrenceArgs> spdxRelationship) {
            this.spdxRelationship = spdxRelationship;
            return this;
        }
        public Builder spdxRelationship(@Nullable RelationshipOccurrenceArgs spdxRelationship) {
            this.spdxRelationship = Codegen.ofNullable(spdxRelationship);
            return this;
        }
        public Builder upgrade(@Nullable Output<UpgradeOccurrenceArgs> upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Builder upgrade(@Nullable UpgradeOccurrenceArgs upgrade) {
            this.upgrade = Codegen.ofNullable(upgrade);
            return this;
        }
        public Builder vulnerabilityDetails(@Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails) {
            this.vulnerabilityDetails = vulnerabilityDetails;
            return this;
        }
        public Builder vulnerabilityDetails(@Nullable VulnerabilityDetailsArgs vulnerabilityDetails) {
            this.vulnerabilityDetails = Codegen.ofNullable(vulnerabilityDetails);
            return this;
        }        public OccurrenceArgs build() {
            return new OccurrenceArgs(attestation, buildDetails, compliance, deployment, derivedImage, discovered, dsseAttestation, envelope, installation, noteName, project, remediation, resource, resourceUrl, sbom, spdxFile, spdxPackage, spdxRelationship, upgrade, vulnerabilityDetails);
        }
    }
}
