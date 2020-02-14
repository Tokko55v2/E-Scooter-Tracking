package com.escooter.michael.kroneder.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
