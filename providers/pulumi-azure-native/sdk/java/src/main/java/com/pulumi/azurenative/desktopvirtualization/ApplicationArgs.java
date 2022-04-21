// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization;

import com.pulumi.azurenative.desktopvirtualization.enums.CommandLineSetting;
import com.pulumi.azurenative.desktopvirtualization.enums.RemoteApplicationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the application group
     * 
     */
    @Import(name="applicationGroupName", required=true)
    private Output<String> applicationGroupName;

    public Output<String> applicationGroupName() {
        return this.applicationGroupName;
    }

    /**
     * The name of the application within the specified application group
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

    /**
     * Resource Type of Application.
     * 
     */
    @Import(name="applicationType")
    private @Nullable Output<Either<String,RemoteApplicationType>> applicationType;

    public Optional<Output<Either<String,RemoteApplicationType>>> applicationType() {
        return Optional.ofNullable(this.applicationType);
    }

    /**
     * Command Line Arguments for Application.
     * 
     */
    @Import(name="commandLineArguments")
    private @Nullable Output<String> commandLineArguments;

    public Optional<Output<String>> commandLineArguments() {
        return Optional.ofNullable(this.commandLineArguments);
    }

    /**
     * Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    @Import(name="commandLineSetting", required=true)
    private Output<Either<String,CommandLineSetting>> commandLineSetting;

    public Output<Either<String,CommandLineSetting>> commandLineSetting() {
        return this.commandLineSetting;
    }

    /**
     * Description of Application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies a path for the executable file for the application.
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * Friendly name of Application.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Index of the icon.
     * 
     */
    @Import(name="iconIndex")
    private @Nullable Output<Integer> iconIndex;

    public Optional<Output<Integer>> iconIndex() {
        return Optional.ofNullable(this.iconIndex);
    }

    /**
     * Path to icon.
     * 
     */
    @Import(name="iconPath")
    private @Nullable Output<String> iconPath;

    public Optional<Output<String>> iconPath() {
        return Optional.ofNullable(this.iconPath);
    }

    /**
     * Specifies the package application Id for MSIX applications
     * 
     */
    @Import(name="msixPackageApplicationId")
    private @Nullable Output<String> msixPackageApplicationId;

    public Optional<Output<String>> msixPackageApplicationId() {
        return Optional.ofNullable(this.msixPackageApplicationId);
    }

    /**
     * Specifies the package family name for MSIX applications
     * 
     */
    @Import(name="msixPackageFamilyName")
    private @Nullable Output<String> msixPackageFamilyName;

    public Optional<Output<String>> msixPackageFamilyName() {
        return Optional.ofNullable(this.msixPackageFamilyName);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    @Import(name="showInPortal")
    private @Nullable Output<Boolean> showInPortal;

    public Optional<Output<Boolean>> showInPortal() {
        return Optional.ofNullable(this.showInPortal);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.applicationGroupName = $.applicationGroupName;
        this.applicationName = $.applicationName;
        this.applicationType = $.applicationType;
        this.commandLineArguments = $.commandLineArguments;
        this.commandLineSetting = $.commandLineSetting;
        this.description = $.description;
        this.filePath = $.filePath;
        this.friendlyName = $.friendlyName;
        this.iconIndex = $.iconIndex;
        this.iconPath = $.iconPath;
        this.msixPackageApplicationId = $.msixPackageApplicationId;
        this.msixPackageFamilyName = $.msixPackageFamilyName;
        this.resourceGroupName = $.resourceGroupName;
        this.showInPortal = $.showInPortal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationGroupName(Output<String> applicationGroupName) {
            $.applicationGroupName = applicationGroupName;
            return this;
        }

        public Builder applicationGroupName(String applicationGroupName) {
            return applicationGroupName(Output.of(applicationGroupName));
        }

        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        public Builder applicationType(@Nullable Output<Either<String,RemoteApplicationType>> applicationType) {
            $.applicationType = applicationType;
            return this;
        }

        public Builder applicationType(Either<String,RemoteApplicationType> applicationType) {
            return applicationType(Output.of(applicationType));
        }

        public Builder applicationType(String applicationType) {
            return applicationType(Either.ofLeft(applicationType));
        }

        public Builder applicationType(RemoteApplicationType applicationType) {
            return applicationType(Either.ofRight(applicationType));
        }

        public Builder commandLineArguments(@Nullable Output<String> commandLineArguments) {
            $.commandLineArguments = commandLineArguments;
            return this;
        }

        public Builder commandLineArguments(String commandLineArguments) {
            return commandLineArguments(Output.of(commandLineArguments));
        }

        public Builder commandLineSetting(Output<Either<String,CommandLineSetting>> commandLineSetting) {
            $.commandLineSetting = commandLineSetting;
            return this;
        }

        public Builder commandLineSetting(Either<String,CommandLineSetting> commandLineSetting) {
            return commandLineSetting(Output.of(commandLineSetting));
        }

        public Builder commandLineSetting(String commandLineSetting) {
            return commandLineSetting(Either.ofLeft(commandLineSetting));
        }

        public Builder commandLineSetting(CommandLineSetting commandLineSetting) {
            return commandLineSetting(Either.ofRight(commandLineSetting));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder iconIndex(@Nullable Output<Integer> iconIndex) {
            $.iconIndex = iconIndex;
            return this;
        }

        public Builder iconIndex(Integer iconIndex) {
            return iconIndex(Output.of(iconIndex));
        }

        public Builder iconPath(@Nullable Output<String> iconPath) {
            $.iconPath = iconPath;
            return this;
        }

        public Builder iconPath(String iconPath) {
            return iconPath(Output.of(iconPath));
        }

        public Builder msixPackageApplicationId(@Nullable Output<String> msixPackageApplicationId) {
            $.msixPackageApplicationId = msixPackageApplicationId;
            return this;
        }

        public Builder msixPackageApplicationId(String msixPackageApplicationId) {
            return msixPackageApplicationId(Output.of(msixPackageApplicationId));
        }

        public Builder msixPackageFamilyName(@Nullable Output<String> msixPackageFamilyName) {
            $.msixPackageFamilyName = msixPackageFamilyName;
            return this;
        }

        public Builder msixPackageFamilyName(String msixPackageFamilyName) {
            return msixPackageFamilyName(Output.of(msixPackageFamilyName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder showInPortal(@Nullable Output<Boolean> showInPortal) {
            $.showInPortal = showInPortal;
            return this;
        }

        public Builder showInPortal(Boolean showInPortal) {
            return showInPortal(Output.of(showInPortal));
        }

        public ApplicationArgs build() {
            $.applicationGroupName = Objects.requireNonNull($.applicationGroupName, "expected parameter 'applicationGroupName' to be non-null");
            $.commandLineSetting = Objects.requireNonNull($.commandLineSetting, "expected parameter 'commandLineSetting' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
