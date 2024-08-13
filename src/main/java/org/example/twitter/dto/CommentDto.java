package org.example.twitter.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    @NotEmpty(message = "The username is required.")
    private String userId;

    @NotEmpty(message = "The content is required.")
    @Size(min = 2, max = 255, message = "The length of content must be between 2 and 255 characters.")
    private String content;
}
