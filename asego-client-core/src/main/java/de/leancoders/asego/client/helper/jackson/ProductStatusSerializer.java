package de.leancoders.asego.client.helper.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.leancoders.asego.common.model.enums.EMediaType;
import de.leancoders.asego.common.model.enums.EProductStatus;

import java.io.IOException;

public class ProductStatusSerializer extends StdSerializer<EProductStatus> {

    public ProductStatusSerializer() {
        this(null);
    }

    public ProductStatusSerializer(Class<EProductStatus> t) {
        super(t);
    }

    @Override
    public void serialize(EProductStatus value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
        gen.writeNumber(value.getMagentoRepresentation());
    }

}