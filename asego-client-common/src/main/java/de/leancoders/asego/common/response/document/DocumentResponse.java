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
public class DocumentResponse {

    @Nullable
    @JsonProperty("Data")
    private String data;

    @NonNull
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("Benutzer")
    private String user;

    @Nullable
    @JsonProperty("Quelle")
    private String source;

    @Nullable
    @JsonProperty("Bemerkung")
    private String remark;

    @Nullable
    @JsonProperty("Gruppe")
    private String group;

    @NonNull
    @JsonProperty("Dateiname")
    private String fileName;

    @Nullable
    @JsonProperty("DateiGroesse")
    private Long fileSize;

    @NonNull
    @JsonProperty("DateiTyp")
    private String fileType;

    @NonNull
    @JsonProperty("Datum")
    private Date date;

    @Nullable
    @JsonProperty("ParentUid")
    private UUID parentUid;

    @Nullable
    @JsonProperty("ART")
    private String art;

    @Nullable
    @JsonProperty("MipArt")
    private Integer mipArt;
}