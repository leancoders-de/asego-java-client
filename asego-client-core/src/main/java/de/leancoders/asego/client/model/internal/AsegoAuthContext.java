package de.leancoders.asego.client.model.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import javax.annotation.Nonnull;

@AllArgsConstructor(staticName = "of")
@Data
@ToString
public class AsegoAuthContext {

    private final boolean authenticated;

    @NonNull
    private final String username;
    @NonNull
    private final String password;
    @NonNull
    private final String token;

    @Nonnull
    public static AsegoAuthContext success(@NonNull final String username,
                                           @NonNull final String password,
                                           @NonNull final String token) {
        return AsegoAuthContext.of(true, username, password, token);
    }

    @Nonnull
    public static AsegoAuthContext empty() {
        return AsegoAuthContext.of(false, "", "", "");
    }
}
