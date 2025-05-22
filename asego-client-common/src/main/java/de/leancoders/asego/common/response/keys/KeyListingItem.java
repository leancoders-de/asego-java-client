package de.leancoders.asego.common.response.keys;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class KeyListingItem {
    
    @JsonProperty("Id")
    private String id;

    @JsonProperty("AnzeigeText")
    private String displayText;
}
