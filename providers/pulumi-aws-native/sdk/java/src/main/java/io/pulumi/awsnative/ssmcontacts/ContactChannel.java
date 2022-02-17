// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssmcontacts.ContactChannelArgs;
import io.pulumi.awsnative.ssmcontacts.enums.ContactChannelChannelType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SSMContacts::ContactChannel
 * 
 */
@ResourceType(type="aws-native:ssmcontacts:ContactChannel")
public class ContactChannel extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    @OutputExport(name="channelAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelAddress;

    /**
     * @return The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    public Output</* @Nullable */ String> getChannelAddress() {
        return this.channelAddress;
    }
    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    @OutputExport(name="channelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelName;

    /**
     * @return The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    public Output</* @Nullable */ String> getChannelName() {
        return this.channelName;
    }
    /**
     * Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    @OutputExport(name="channelType", type=ContactChannelChannelType.class, parameters={})
    private Output</* @Nullable */ ContactChannelChannelType> channelType;

    /**
     * @return Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    public Output</* @Nullable */ ContactChannelChannelType> getChannelType() {
        return this.channelType;
    }
    /**
     * ARN of the contact resource
     * 
     */
    @OutputExport(name="contactId", type=String.class, parameters={})
    private Output</* @Nullable */ String> contactId;

    /**
     * @return ARN of the contact resource
     * 
     */
    public Output</* @Nullable */ String> getContactId() {
        return this.contactId;
    }
    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    @OutputExport(name="deferActivation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deferActivation;

    /**
     * @return If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeferActivation() {
        return this.deferActivation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactChannel(String name, @Nullable ContactChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:ContactChannel", name, args == null ? ContactChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContactChannel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:ContactChannel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContactChannel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContactChannel(name, id, options);
    }
}