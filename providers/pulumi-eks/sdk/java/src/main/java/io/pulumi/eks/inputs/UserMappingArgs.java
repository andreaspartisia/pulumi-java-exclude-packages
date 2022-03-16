// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a mapping from an AWS IAM user to a Kubernetes user and groups.
 * 
 */
public final class UserMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserMappingArgs Empty = new UserMappingArgs();

    /**
     * A list of groups within Kubernetes to which the user is mapped to.
     * 
     */
    @Import(name="groups", required=true)
      private final Output<List<String>> groups;

    public Output<List<String>> getGroups() {
        return this.groups;
    }

    /**
     * The ARN of the IAM user to add.
     * 
     */
    @Import(name="userArn", required=true)
      private final Output<String> userArn;

    public Output<String> getUserArn() {
        return this.userArn;
    }

    /**
     * The user name within Kubernetes to map to the IAM user. By default, the user name is the ARN of the IAM user.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public UserMappingArgs(
        Output<List<String>> groups,
        Output<String> userArn,
        Output<String> username) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private UserMappingArgs() {
        this.groups = Output.empty();
        this.userArn = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> groups;
        private Output<String> userArn;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.userArn = defaults.userArn;
    	      this.username = defaults.username;
        }

        public Builder groups(Output<List<String>> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder groups(List<String> groups) {
            this.groups = Output.of(Objects.requireNonNull(groups));
            return this;
        }

        public Builder userArn(Output<String> userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }

        public Builder userArn(String userArn) {
            this.userArn = Output.of(Objects.requireNonNull(userArn));
            return this;
        }

        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }
        public UserMappingArgs build() {
            return new UserMappingArgs(groups, userArn, username);
        }
    }
}
