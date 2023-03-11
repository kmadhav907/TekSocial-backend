package com.social.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequest {
    private String userName;
    private String userEmail;
    private String firstName;
    private String lastName;
    private String userContact;
    private String userAbout;
    private Long userId;
    private String age;
    private String city;
    private String state;
}
