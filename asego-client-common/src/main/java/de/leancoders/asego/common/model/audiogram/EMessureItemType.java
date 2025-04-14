package de.leancoders.asego.common.model.audiogram;

public enum EMessureItemType {

    NONE(0),
    NO_ANSWER(1),
    NOT_MEASURABLE(2),
    DEAFNESS(3),
    DEAFNESS_NO_ANSWER(4),
    DEAFNESS_NOT_MEASURABLE(5);

    private final int value;

    EMessureItemType(int value) {
        this.value = value;
    }

}
