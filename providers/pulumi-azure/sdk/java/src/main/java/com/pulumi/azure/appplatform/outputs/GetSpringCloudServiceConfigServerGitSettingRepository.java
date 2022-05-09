// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.azure.appplatform.outputs.GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth;
import com.pulumi.azure.appplatform.outputs.GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSpringCloudServiceConfigServerGitSettingRepository {
    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    private final List<GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuths;
    /**
     * @return The default label of the Git repository, which is a branch name, tag name, or commit-id of the repository
     * 
     */
    private final String label;
    /**
     * @return Specifies The name of the Spring Cloud Service resource.
     * 
     */
    private final String name;
    /**
     * @return An array of strings used to match an application name. For each pattern, use the `{application}/{profile}` format with wildcards.
     * 
     */
    private final List<String> patterns;
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    private final List<String> searchPaths;
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    private final List<GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuths;
    /**
     * @return The URI of the Git repository
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GetSpringCloudServiceConfigServerGitSettingRepository(
        @CustomType.Parameter("httpBasicAuths") List<GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuths,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("patterns") List<String> patterns,
        @CustomType.Parameter("searchPaths") List<String> searchPaths,
        @CustomType.Parameter("sshAuths") List<GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuths,
        @CustomType.Parameter("uri") String uri) {
        this.httpBasicAuths = httpBasicAuths;
        this.label = label;
        this.name = name;
        this.patterns = patterns;
        this.searchPaths = searchPaths;
        this.sshAuths = sshAuths;
        this.uri = uri;
    }

    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    public List<GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuths() {
        return this.httpBasicAuths;
    }
    /**
     * @return The default label of the Git repository, which is a branch name, tag name, or commit-id of the repository
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Specifies The name of the Spring Cloud Service resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An array of strings used to match an application name. For each pattern, use the `{application}/{profile}` format with wildcards.
     * 
     */
    public List<String> patterns() {
        return this.patterns;
    }
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    public List<String> searchPaths() {
        return this.searchPaths;
    }
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    public List<GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuths() {
        return this.sshAuths;
    }
    /**
     * @return The URI of the Git repository
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpringCloudServiceConfigServerGitSettingRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuths;
        private String label;
        private String name;
        private List<String> patterns;
        private List<String> searchPaths;
        private List<GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuths;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpringCloudServiceConfigServerGitSettingRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpBasicAuths = defaults.httpBasicAuths;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.patterns = defaults.patterns;
    	      this.searchPaths = defaults.searchPaths;
    	      this.sshAuths = defaults.sshAuths;
    	      this.uri = defaults.uri;
        }

        public Builder httpBasicAuths(List<GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth> httpBasicAuths) {
            this.httpBasicAuths = Objects.requireNonNull(httpBasicAuths);
            return this;
        }
        public Builder httpBasicAuths(GetSpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuth... httpBasicAuths) {
            return httpBasicAuths(List.of(httpBasicAuths));
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder patterns(List<String> patterns) {
            this.patterns = Objects.requireNonNull(patterns);
            return this;
        }
        public Builder patterns(String... patterns) {
            return patterns(List.of(patterns));
        }
        public Builder searchPaths(List<String> searchPaths) {
            this.searchPaths = Objects.requireNonNull(searchPaths);
            return this;
        }
        public Builder searchPaths(String... searchPaths) {
            return searchPaths(List.of(searchPaths));
        }
        public Builder sshAuths(List<GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth> sshAuths) {
            this.sshAuths = Objects.requireNonNull(sshAuths);
            return this;
        }
        public Builder sshAuths(GetSpringCloudServiceConfigServerGitSettingRepositorySshAuth... sshAuths) {
            return sshAuths(List.of(sshAuths));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GetSpringCloudServiceConfigServerGitSettingRepository build() {
            return new GetSpringCloudServiceConfigServerGitSettingRepository(httpBasicAuths, label, name, patterns, searchPaths, sshAuths, uri);
        }
    }
}
