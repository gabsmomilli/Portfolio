package com.tecnocode.payload;

import lombok.*;
import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BenefitDTO implements Serializable {
    private String benefit;
}
