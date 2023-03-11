package com.social.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadFileResponse {

    private String status;
    private Object data;
}
