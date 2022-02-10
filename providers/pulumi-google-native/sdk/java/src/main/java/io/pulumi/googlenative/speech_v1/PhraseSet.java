// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.speech_v1.PhraseSetArgs;
import io.pulumi.googlenative.speech_v1.outputs.PhraseResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:speech/v1:PhraseSet")
public class PhraseSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="boost", type=Double.class, parameters={})
    private Output<Double> boost;

    public Output<Double> getBoost() {
        return this.boost;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="phrases", type=List.class, parameters={PhraseResponse.class})
    private Output<List<PhraseResponse>> phrases;

    public Output<List<PhraseResponse>> getPhrases() {
        return this.phrases;
    }

    public PhraseSet(String name, PhraseSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:PhraseSet", name, args == null ? PhraseSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PhraseSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:PhraseSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PhraseSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PhraseSet(name, id, options);
    }
}