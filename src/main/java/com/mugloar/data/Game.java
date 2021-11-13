package com.mugloar.data;

import io.micronaut.core.annotation.Introspected;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Introspected
public class Game {
    // Maybe UUID would be better
    private String gameId;

    private Integer lives;

    private Integer gold;

    private Integer level;

    private Integer score;

    private Integer highScore;

    private Integer turn;
}
