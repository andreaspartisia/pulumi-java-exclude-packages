// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.mypkg.outputs.GetAmiIdsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAmiIdsResult {
    private final @Nullable List<String> executableUsers;
    private final @Nullable List<GetAmiIdsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> owners;
    private final @Nullable Boolean sortAscending;

    @CustomType.Constructor
    private GetAmiIdsResult(
        @CustomType.Parameter("executableUsers") @Nullable List<String> executableUsers,
        @CustomType.Parameter("filters") @Nullable List<GetAmiIdsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("owners") List<String> owners,
        @CustomType.Parameter("sortAscending") @Nullable Boolean sortAscending) {
        this.executableUsers = executableUsers;
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.owners = owners;
        this.sortAscending = sortAscending;
    }

    public List<String> executableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }
    public List<GetAmiIdsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> owners() {
        return this.owners;
    }
    public Optional<Boolean> sortAscending() {
        return Optional.ofNullable(this.sortAscending);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> executableUsers;
        private @Nullable List<GetAmiIdsFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> owners;
        private @Nullable Boolean sortAscending;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableUsers = defaults.executableUsers;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.owners = defaults.owners;
    	      this.sortAscending = defaults.sortAscending;
        }

        public Builder executableUsers(@Nullable List<String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }
        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }
        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAmiIdsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder sortAscending(@Nullable Boolean sortAscending) {
            this.sortAscending = sortAscending;
            return this;
        }        public GetAmiIdsResult build() {
            return new GetAmiIdsResult(executableUsers, filters, id, ids, nameRegex, owners, sortAscending);
        }
    }
}
