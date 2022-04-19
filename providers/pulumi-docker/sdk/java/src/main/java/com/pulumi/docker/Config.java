// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import com.pulumi.docker.config.inputs.RegistryAuth;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("docker");
/**
 * PEM-encoded content of Docker host CA certificate
 * 
 */
    public Optional<String> caMaterial() {
        return Codegen.stringProp("caMaterial").config(config).get();
    }
/**
 * PEM-encoded content of Docker client certificate
 * 
 */
    public Optional<String> certMaterial() {
        return Codegen.stringProp("certMaterial").config(config).get();
    }
/**
 * Path to directory with Docker TLS config
 * 
 */
    public Optional<String> certPath() {
        return Codegen.stringProp("certPath").config(config).get();
    }
/**
 * The Docker daemon address
 * 
 */
    public String host() {
        return Codegen.stringProp("host").config(config).env("DOCKER_HOST").def("unix:///var/run/docker.sock").require();
    }
/**
 * PEM-encoded content of Docker client private key
 * 
 */
    public Optional<String> keyMaterial() {
        return Codegen.stringProp("keyMaterial").config(config).get();
    }
    public Optional<List<RegistryAuth>> registryAuth() {
        return Codegen.objectProp("registryAuth", TypeShape.<List<RegistryAuth>>builder(List.class).addParameter(RegistryAuth.class).build()).config(config).get();
    }
}
