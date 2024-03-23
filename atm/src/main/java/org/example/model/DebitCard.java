package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@Builder
@EqualsAndHashCode
public class DebitCard {
    @NonNull
    String cardNo;
    @NonNull
    String validTill;
    String pin;

}
