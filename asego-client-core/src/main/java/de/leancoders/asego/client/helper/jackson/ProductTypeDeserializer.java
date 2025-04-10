package de.leancoders.asego.client.helper.jackson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.leancoders.asego.common.model.enums.EMediaType;
import de.leancoders.asego.common.model.enums.EProductType;

import java.io.IOException;

public class ProductTypeDeserializer extends StdDeserializer<EProductType> {

    public ProductTypeDeserializer() {
        this(null);
    }

    public ProductTypeDeserializer(Class<EProductType> t) {
        super(t);
    }

    @Override
    public EProductType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        final String text = jsonParser.getText();

        return EProductType.lookupFailing(text);
    }
}