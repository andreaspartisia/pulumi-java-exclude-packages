// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.RoleAssignmentArgs;
import io.pulumi.azurenative.customerinsights.outputs.AssignmentPrincipalResponse;
import io.pulumi.azurenative.customerinsights.outputs.ResourceSetDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:customerinsights:RoleAssignment")
public class RoleAssignment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="assignmentName", type=String.class, parameters={})
    private Output<String> assignmentName;

    public Output<String> getAssignmentName() {
        return this.assignmentName;
    }
    @OutputExport(name="conflationPolicies", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> conflationPolicies;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getConflationPolicies() {
        return this.conflationPolicies;
    }
    @OutputExport(name="connectors", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> connectors;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getConnectors() {
        return this.connectors;
    }
    @OutputExport(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="interactions", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> interactions;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getInteractions() {
        return this.interactions;
    }
    @OutputExport(name="kpis", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> kpis;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getKpis() {
        return this.kpis;
    }
    @OutputExport(name="links", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> links;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getLinks() {
        return this.links;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="principals", type=List.class, parameters={AssignmentPrincipalResponse.class})
    private Output<List<AssignmentPrincipalResponse>> principals;

    public Output<List<AssignmentPrincipalResponse>> getPrincipals() {
        return this.principals;
    }
    @OutputExport(name="profiles", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> profiles;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getProfiles() {
        return this.profiles;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="relationshipLinks", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> relationshipLinks;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRelationshipLinks() {
        return this.relationshipLinks;
    }
    @OutputExport(name="relationships", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> relationships;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRelationships() {
        return this.relationships;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @OutputExport(name="roleAssignments", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> roleAssignments;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRoleAssignments() {
        return this.roleAssignments;
    }
    @OutputExport(name="sasPolicies", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> sasPolicies;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getSasPolicies() {
        return this.sasPolicies;
    }
    @OutputExport(name="segments", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> segments;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getSegments() {
        return this.segments;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="views", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> views;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getViews() {
        return this.views;
    }
    @OutputExport(name="widgetTypes", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> widgetTypes;

    public Output</* @Nullable */ ResourceSetDescriptionResponse> getWidgetTypes() {
        return this.widgetTypes;
    }

    public RoleAssignment(String name, RoleAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RoleAssignment", name, args == null ? RoleAssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RoleAssignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RoleAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170101:RoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170426:RoleAssignment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RoleAssignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignment(name, id, options);
    }
}