package de.leancoders.asego.common.model.audiogram;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EEarType {

    LEFT(0),
    RIGHT(1),
    NONE(2),
    BOTH(3);

    private final int value;

    EEarType(final int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
    
    public static EEarType fromValue(int value) {
        for (EEarType type : EEarType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown EEarType value: " + value);
    }
    
}
