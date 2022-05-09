// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.inputs.GetClusterNodePoolArgs;
import com.pulumi.azure.containerservice.inputs.GetGroupArgs;
import com.pulumi.azure.containerservice.inputs.GetKubernetesClusterArgs;
import com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsArgs;
import com.pulumi.azure.containerservice.inputs.GetRegistryArgs;
import com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapArgs;
import com.pulumi.azure.containerservice.inputs.GetRegistryTokenArgs;
import com.pulumi.azure.containerservice.outputs.GetClusterNodePoolResult;
import com.pulumi.azure.containerservice.outputs.GetGroupResult;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterResult;
import com.pulumi.azure.containerservice.outputs.GetKubernetesServiceVersionsResult;
import com.pulumi.azure.containerservice.outputs.GetRegistryResult;
import com.pulumi.azure.containerservice.outputs.GetRegistryScopeMapResult;
import com.pulumi.azure.containerservice.outputs.GetRegistryTokenResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ContainerserviceFunctions {
    /**
     * Use this data source to access information about an existing Kubernetes Cluster Node Pool.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getClusterNodePool(GetClusterNodePoolArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .kubernetesClusterName(&#34;existing-cluster&#34;)
     *             .resourceGroupName(&#34;existing-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getClusterNodePoolResult -&gt; getClusterNodePoolResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterNodePoolResult> getClusterNodePool(GetClusterNodePoolArgs args) {
        return getClusterNodePool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterNodePoolResult> getClusterNodePool(GetClusterNodePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getClusterNodePool:getClusterNodePool", TypeShape.of(GetClusterNodePoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Container Group instance.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getGroupResult -&gt; getGroupResult.getId()));
     *         ctx.export(&#34;ipAddress&#34;, example.apply(getGroupResult -&gt; getGroupResult.getIpAddress()));
     *         ctx.export(&#34;fqdn&#34;, example.apply(getGroupResult -&gt; getGroupResult.getFqdn()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Managed Kubernetes Cluster (AKS).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getKubernetesCluster(GetKubernetesClusterArgs.builder()
     *             .name(&#34;myakscluster&#34;)
     *             .resourceGroupName(&#34;my-example-resource-group&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetKubernetesClusterResult> getKubernetesCluster(GetKubernetesClusterArgs args) {
        return getKubernetesCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKubernetesClusterResult> getKubernetesCluster(GetKubernetesClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getKubernetesCluster:getKubernetesCluster", TypeShape.of(GetKubernetesClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve the version of Kubernetes supported by Azure Kubernetes Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Output.of(ContainerserviceFunctions.getKubernetesServiceVersions(GetKubernetesServiceVersionsArgs.builder()
     *             .location(&#34;West Europe&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;versions&#34;, current.apply(getKubernetesServiceVersionsResult -&gt; getKubernetesServiceVersionsResult.getVersions()));
     *         ctx.export(&#34;latestVersion&#34;, current.apply(getKubernetesServiceVersionsResult -&gt; getKubernetesServiceVersionsResult.getLatestVersion()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetKubernetesServiceVersionsResult> getKubernetesServiceVersions(GetKubernetesServiceVersionsArgs args) {
        return getKubernetesServiceVersions(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKubernetesServiceVersionsResult> getKubernetesServiceVersions(GetKubernetesServiceVersionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getKubernetesServiceVersions:getKubernetesServiceVersions", TypeShape.of(GetKubernetesServiceVersionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Container Registry.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getRegistry(GetRegistryArgs.builder()
     *             .name(&#34;testacr&#34;)
     *             .resourceGroupName(&#34;test&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;loginServer&#34;, example.apply(getRegistryResult -&gt; getRegistryResult.getLoginServer()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRegistryResult> getRegistry(GetRegistryArgs args) {
        return getRegistry(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryResult> getRegistry(GetRegistryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getRegistry:getRegistry", TypeShape.of(GetRegistryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Container Registry scope map.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getRegistryScopeMap(GetRegistryScopeMapArgs.builder()
     *             .name(&#34;example-scope-map&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .containerRegistryName(&#34;example-registry&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;actions&#34;, example.apply(getRegistryScopeMapResult -&gt; getRegistryScopeMapResult.getActions()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRegistryScopeMapResult> getRegistryScopeMap(GetRegistryScopeMapArgs args) {
        return getRegistryScopeMap(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryScopeMapResult> getRegistryScopeMap(GetRegistryScopeMapArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getRegistryScopeMap:getRegistryScopeMap", TypeShape.of(GetRegistryScopeMapResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Container Registry token.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(ContainerserviceFunctions.getRegistryToken(GetRegistryTokenArgs.builder()
     *             .name(&#34;exampletoken&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .containerRegistryName(&#34;example-registry&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;scopeMapId&#34;, example.apply(getRegistryTokenResult -&gt; getRegistryTokenResult.getScopeMapId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRegistryTokenResult> getRegistryToken(GetRegistryTokenArgs args) {
        return getRegistryToken(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryTokenResult> getRegistryToken(GetRegistryTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:containerservice/getRegistryToken:getRegistryToken", TypeShape.of(GetRegistryTokenResult.class), args, Utilities.withVersion(options));
    }
}
