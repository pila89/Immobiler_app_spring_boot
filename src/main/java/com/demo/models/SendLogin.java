package com.demo.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SendLogin {
    String email;
    String password;
}
