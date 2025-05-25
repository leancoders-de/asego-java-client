package de.leancoders.asego.client.model.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nonnull;

@AllArgsConstructor(staticName = "of")
@Data
public class AsegoConfig {

    @NonNull
    private final String baseUrl;
    private final int port;

    @Nonnull
    public static AsegoConfig empty() {
        return AsegoConfig.of("", 0);
    }

}
