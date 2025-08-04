package de.leancoders.asego.common.request.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;
import java.util.UUID;

/**
 * In the (official) Asego Client UI the "Bermerkung" field is used to store the file name and gets 
 * used when opening the file.
 * So a pdf without it would be opened with the name ".pdf" 
 * Therefore this abomination is needed to allow easy use for the user.
 * */
@NoArgsConstructor
@Data
public class DocumentUpdateRequest {

    @Nonnull
    public static DocumentUpdateRequest of(@NonNull final String fileName, @NonNull final String fileType, @NonNull final String data) {
        final DocumentUpdateRequest request = new DocumentUpdateRequest();
        request.setFullFileName(fileName);
        request.setFileType(fileType);
        request.setFileName(fileName);
        request.setData(data);
        return request;
    }

    @Nullable
    @JsonProperty("uid")
    private UUID uid;

    @Nullable
    @JsonProperty("ART")
    private String art;

    @Nullable
    @JsonProperty("Benutzer")
    private String user;

    @Nullable
    @JsonProperty("DateiGroesse")
    private Long fileSize;

    @Nullable
    @JsonProperty("ParentUid")
    private UUID parentUid;

    @Nullable
    @JsonProperty("MipArt")
    private Integer mipArt;

    @Nullable
    @JsonProperty("Quelle")
    private String source;

    @Nullable
    @JsonProperty("Bemerkung")
    private String fileName;

    @Nullable
    @JsonProperty("Gruppe")
    private String group;

    @NonNull
    @JsonProperty("Dateiname")
    private String fullFileName;

    @NonNull
    @JsonProperty("DateiTyp")
    private String fileType;

    @NonNull
    @JsonProperty("Data")
    private String data;

    @Nullable
    @JsonProperty("Datum")
    private Date date;
}