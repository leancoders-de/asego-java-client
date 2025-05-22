package de.leancoders.asego.common.response.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@Data
public class DocumentListItem {

    @NonNull
    @JsonProperty("uid")
    private UUID uid;

    @NonNull
    @JsonProperty("Dateiname")
    private String fileName;

    @Nullable
    @JsonProperty("DateiGroesse")
    private Long fileSize;

    @Nullable
    @JsonProperty("DateiTyp")
    private String fileType;

    @NonNull
    @JsonProperty("Datum")
    private Date date;
}