package com.ahmet.chat.Controller;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageTypeEnum type;
    private String content;
    private String sender;

}
