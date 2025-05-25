package de.leancoders.asego.common.model.doctor;

public enum EDoctorType {

    UNKNOWN(0),
    EAR_NOSE_AND_THROAT_SPECIALIST(1),
    EYE_SPECIALIST(2),
    PRIMARY_DOCTOR(4);

    private final int value;

    EDoctorType(final int value) {
        this.value = value;
    }

    public static EDoctorType fromValue(int value) {
        for (EDoctorType type : EDoctorType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown EDoctorType value: " + value);
    }
}
