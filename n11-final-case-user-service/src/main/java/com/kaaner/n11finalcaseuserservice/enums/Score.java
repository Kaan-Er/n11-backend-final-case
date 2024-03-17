package com.kaaner.n11finalcaseuserservice.enums;

import lombok.Getter;

@Getter
public enum Score {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int rate;

    Score(int rate) {
        this.rate = rate;
    }
}
