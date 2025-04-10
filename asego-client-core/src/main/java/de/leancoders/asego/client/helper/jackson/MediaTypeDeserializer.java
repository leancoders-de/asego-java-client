package de.leancoders.asego.client.helper.jackson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.leancoders.asego.common.model.enums.EMediaType;

import java.io.IOException;

public class MediaTypeDeserializer extends StdDeserializer<EMediaType> {

    public MediaTypeDeserializer() {
        this(null);
    }

    public MediaTypeDeserializer(Class<EMediaType> t) {
        super(t);
    }

    @Override
    public EMediaType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        final String text = jsonParser.getText();

        return EMediaType.lookupFailing(text);
    }
}