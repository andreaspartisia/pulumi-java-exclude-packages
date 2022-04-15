// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deployment Manager will call these methods during the events of creation/deletion/update/get/setIamPolicy
 * 
 */
public final class MethodMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodMapArgs Empty = new MethodMapArgs();

    /**
     * The action identifier for the create method to be used for this collection
     * 
     */
    @Import(name="create")
      private final @Nullable Output<String> create;

    public Output<String> create() {
        return this.create == null ? Codegen.empty() : this.create;
    }

    /**
     * The action identifier for the delete method to be used for this collection
     * 
     */
    @Import(name="delete")
      private final @Nullable Output<String> delete;

    public Output<String> delete() {
        return this.delete == null ? Codegen.empty() : this.delete;
    }

    /**
     * The action identifier for the get method to be used for this collection
     * 
     */
    @Import(name="get")
      private final @Nullable Output<String> get;

    public Output<String> get() {
        return this.get == null ? Codegen.empty() : this.get;
    }

    /**
     * The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    @Import(name="setIamPolicy")
      private final @Nullable Output<String> setIamPolicy;

    public Output<String> setIamPolicy() {
        return this.setIamPolicy == null ? Codegen.empty() : this.setIamPolicy;
    }

    /**
     * The action identifier for the update method to be used for this collection
     * 
     */
    @Import(name="update")
      private final @Nullable Output<String> update;

    public Output<String> update() {
        return this.update == null ? Codegen.empty() : this.update;
    }

    public MethodMapArgs(
        @Nullable Output<String> create,
        @Nullable Output<String> delete,
        @Nullable Output<String> get,
        @Nullable Output<String> setIamPolicy,
        @Nullable Output<String> update) {
        this.create = create;
        this.delete = delete;
        this.get = get;
        this.setIamPolicy = setIamPolicy;
        this.update = update;
    }

    private MethodMapArgs() {
        this.create = Codegen.empty();
        this.delete = Codegen.empty();
        this.get = Codegen.empty();
        this.setIamPolicy = Codegen.empty();
        this.update = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> create;
        private @Nullable Output<String> delete;
        private @Nullable Output<String> get;
        private @Nullable Output<String> setIamPolicy;
        private @Nullable Output<String> update;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.create = defaults.create;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.setIamPolicy = defaults.setIamPolicy;
    	      this.update = defaults.update;
        }

        public Builder create(@Nullable Output<String> create) {
            this.create = create;
            return this;
        }
        public Builder create(@Nullable String create) {
            this.create = Codegen.ofNullable(create);
            return this;
        }
        public Builder delete(@Nullable Output<String> delete) {
            this.delete = delete;
            return this;
        }
        public Builder delete(@Nullable String delete) {
            this.delete = Codegen.ofNullable(delete);
            return this;
        }
        public Builder get(@Nullable Output<String> get) {
            this.get = get;
            return this;
        }
        public Builder get(@Nullable String get) {
            this.get = Codegen.ofNullable(get);
            return this;
        }
        public Builder setIamPolicy(@Nullable Output<String> setIamPolicy) {
            this.setIamPolicy = setIamPolicy;
            return this;
        }
        public Builder setIamPolicy(@Nullable String setIamPolicy) {
            this.setIamPolicy = Codegen.ofNullable(setIamPolicy);
            return this;
        }
        public Builder update(@Nullable Output<String> update) {
            this.update = update;
            return this;
        }
        public Builder update(@Nullable String update) {
            this.update = Codegen.ofNullable(update);
            return this;
        }        public MethodMapArgs build() {
            return new MethodMapArgs(create, delete, get, setIamPolicy, update);
        }
    }
}
