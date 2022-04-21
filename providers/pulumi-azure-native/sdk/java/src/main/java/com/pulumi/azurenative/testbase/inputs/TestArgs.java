// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.azurenative.testbase.enums.TestType;
import com.pulumi.azurenative.testbase.inputs.CommandArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a Test.
 * 
 */
public final class TestArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestArgs Empty = new TestArgs();

    /**
     * The commands used in the test.
     * 
     */
    @Import(name="commands", required=true)
    private Output<List<CommandArgs>> commands;

    public Output<List<CommandArgs>> commands() {
        return this.commands;
    }

    /**
     * Indicates if this test is active.It doesn&#39;t schedule test for not active Test.
     * 
     */
    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    /**
     * The type of the test.
     * 
     */
    @Import(name="testType", required=true)
    private Output<Either<String,TestType>> testType;

    public Output<Either<String,TestType>> testType() {
        return this.testType;
    }

    private TestArgs() {}

    private TestArgs(TestArgs $) {
        this.commands = $.commands;
        this.isActive = $.isActive;
        this.testType = $.testType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestArgs $;

        public Builder() {
            $ = new TestArgs();
        }

        public Builder(TestArgs defaults) {
            $ = new TestArgs(Objects.requireNonNull(defaults));
        }

        public Builder commands(Output<List<CommandArgs>> commands) {
            $.commands = commands;
            return this;
        }

        public Builder commands(List<CommandArgs> commands) {
            return commands(Output.of(commands));
        }

        public Builder commands(CommandArgs... commands) {
            return commands(List.of(commands));
        }

        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        public Builder testType(Output<Either<String,TestType>> testType) {
            $.testType = testType;
            return this;
        }

        public Builder testType(Either<String,TestType> testType) {
            return testType(Output.of(testType));
        }

        public Builder testType(String testType) {
            return testType(Either.ofLeft(testType));
        }

        public Builder testType(TestType testType) {
            return testType(Either.ofRight(testType));
        }

        public TestArgs build() {
            $.commands = Objects.requireNonNull($.commands, "expected parameter 'commands' to be non-null");
            $.testType = Objects.requireNonNull($.testType, "expected parameter 'testType' to be non-null");
            return $;
        }
    }

}
