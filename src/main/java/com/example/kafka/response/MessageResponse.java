package com.example.kafka.response;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Yash Patel
 * @since 27/08/25 04:28 PM
 */
@Getter
@Setter
public class MessageResponse {
    private String name;
    private String description;
    private Boolean isNPC;

    @Override
    public String toString() {
        return "MessageResponse{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isNPC=" + isNPC +
                '}';
    }
}
