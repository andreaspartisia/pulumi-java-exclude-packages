// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageEventHandlerTriggerFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageEventHandlerTriggerFulfillmentMessageArgs Empty = new CxPageEventHandlerTriggerFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text;

    public Input<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxPageEventHandlerTriggerFulfillmentMessageArgs(@Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxPageEventHandlerTriggerFulfillmentMessageArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandlerTriggerFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandlerTriggerFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable CxPageEventHandlerTriggerFulfillmentMessageTextArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public CxPageEventHandlerTriggerFulfillmentMessageArgs build() {
            return new CxPageEventHandlerTriggerFulfillmentMessageArgs(text);
        }
    }
}