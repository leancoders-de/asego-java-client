package de.leancoders.asego.common.response.audiogram;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AudiogramSpeechResponse extends ArrayList<AudiogramBaseResponse> {
}