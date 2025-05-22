package de.leancoders.asego.common.request.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor(staticName = "of")
@Data
public class DocumentSearchFilter {

    @Nullable
    @JsonProperty("Benutzer")
    private String user;

    @Nullable
    @JsonProperty("Quelle")
    private String source;

    @Nullable
    @JsonProperty("Datum")
    private Date date;

    @Nullable
    @JsonProperty("MipArt")
    private Integer mipArt;

    @Nullable
    @JsonProperty("ParentUid")
    private UUID parentUid;

    @Nullable
    @JsonProperty("ART")
    private String art;

    @Nullable
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("Dateiname")
    private String fileName;

    @Nullable
    @JsonProperty("DateiGroesse")
    private Long fileSize;

    @Nullable
    @JsonProperty("DateiTyp")
    private String fileType;
}