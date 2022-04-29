// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUiPasswordResult {
    private final String id;
    private final String inactiveStatus;
    private final String password;
    /**
     * @return The password&#39;s current state.
     * 
     */
    private final String state;
    /**
     * @return Date and time the password was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The OCID of the user.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetUiPasswordResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inactiveStatus") String inactiveStatus,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("userId") String userId) {
        this.id = id;
        this.inactiveStatus = inactiveStatus;
        this.password = password;
        this.state = state;
        this.timeCreated = timeCreated;
        this.userId = userId;
    }

    public String id() {
        return this.id;
    }
    public String inactiveStatus() {
        return this.inactiveStatus;
    }
    public String password() {
        return this.password;
    }
    /**
     * @return The password&#39;s current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Date and time the password was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The OCID of the user.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUiPasswordResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String inactiveStatus;
        private String password;
        private String state;
        private String timeCreated;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUiPasswordResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inactiveStatus = defaults.inactiveStatus;
    	      this.password = defaults.password;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.userId = defaults.userId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inactiveStatus(String inactiveStatus) {
            this.inactiveStatus = Objects.requireNonNull(inactiveStatus);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetUiPasswordResult build() {
            return new GetUiPasswordResult(id, inactiveStatus, password, state, timeCreated, userId);
        }
    }
}
