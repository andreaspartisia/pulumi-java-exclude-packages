// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datamigration_v1.ConnectionProfileArgs;
import io.pulumi.googlenative.datamigration_v1.outputs.CloudSqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.MySqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.PostgreSqlConnectionProfileResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:datamigration/v1:ConnectionProfile")
public class ConnectionProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cloudsql", type=CloudSqlConnectionProfileResponse.class, parameters={})
    private Output<CloudSqlConnectionProfileResponse> cloudsql;

    public Output<CloudSqlConnectionProfileResponse> getCloudsql() {
        return this.cloudsql;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    public Output<StatusResponse> getError() {
        return this.error;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="mysql", type=MySqlConnectionProfileResponse.class, parameters={})
    private Output<MySqlConnectionProfileResponse> mysql;

    public Output<MySqlConnectionProfileResponse> getMysql() {
        return this.mysql;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="postgresql", type=PostgreSqlConnectionProfileResponse.class, parameters={})
    private Output<PostgreSqlConnectionProfileResponse> postgresql;

    public Output<PostgreSqlConnectionProfileResponse> getPostgresql() {
        return this.postgresql;
    }
    @OutputExport(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    public Output<String> getProvider() {
        return this.provider;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public ConnectionProfile(String name, ConnectionProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1:ConnectionProfile", name, args == null ? ConnectionProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectionProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1:ConnectionProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConnectionProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionProfile(name, id, options);
    }
}