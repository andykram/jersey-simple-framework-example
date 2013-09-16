package com.github.andykram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MessageEntity {
    @JsonProperty
    private final String message;
}
