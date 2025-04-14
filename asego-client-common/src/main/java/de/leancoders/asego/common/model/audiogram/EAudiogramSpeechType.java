package de.leancoders.asego.common.model.audiogram;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EAudiogramSpeechType {

    DV_FF(0),
    DV_FF1(1),
    DV_FF2(2),
    DV_KL(3),
    DV_LL(4),
    HV_FF(5),
    HV_FF1(6),
    HV_FF2(7),
    HV_KL(8),
    HV_LL(9),
    MCL_FF(10),
    MCL_FF1(11),
    MCL_FF2(12),
    MCL_KL(13),
    MCL_LL(14),
    UCL_FF(15),
    UCL_FF1(16),
    UCL_FF2(17),
    UCL_KL(18),
    UCL_LL(19);


    private final int value;

    EAudiogramSpeechType(final int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    public static EAudiogramSpeechType fromValue(int value) {
        for (EAudiogramSpeechType type : EAudiogramSpeechType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown EAudiogramSpeechType value: " + value);
    }
}
