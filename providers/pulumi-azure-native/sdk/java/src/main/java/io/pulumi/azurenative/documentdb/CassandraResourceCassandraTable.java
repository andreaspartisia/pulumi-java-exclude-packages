// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.CassandraResourceCassandraTableArgs;
import io.pulumi.azurenative.documentdb.outputs.CassandraTableGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.CassandraTableGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:CassandraResourceCassandraTable")
public class CassandraResourceCassandraTable extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="options", type=CassandraTableGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ CassandraTableGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ CassandraTableGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="resource", type=CassandraTableGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ CassandraTableGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ CassandraTableGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CassandraResourceCassandraTable(String name, CassandraResourceCassandraTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraTable", name, args == null ? CassandraResourceCassandraTableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CassandraResourceCassandraTable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraTable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150401:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150408:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20151106:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160319:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160331:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:CassandraResourceCassandraTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:CassandraResourceCassandraTable").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CassandraResourceCassandraTable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CassandraResourceCassandraTable(name, id, options);
    }
}