package de.leancoders.asego.common.response.doctor;

public enum EDoctorType {

    UNKNOWN(0),
    EAR_NOSE_AND_THROAT_SPECIALIST(1),
    EYE_SPECIALIST(2),
    FAMILY_DOCTOR(4);

    private final int value;

    EDoctorType(final int value) {
        this.value = value;
    }
}
