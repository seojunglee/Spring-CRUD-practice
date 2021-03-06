package org.cloneeverytime.web.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cloneeverytime.domain.post.Post;

import java.time.LocalTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostSaveRequestDto {

    private String title;
    private String content;
    private java.time.LocalDateTime created_date;
    private int view_count;
    private Long user_id;
    private java.time.LocalDateTime modified_date;
    private Long board_id;
    private Boolean anonymous;


    public Post toEntity(){
        return Post.builder()
                .title(title)
                .content(content)
                .created_date(created_date)
                .view_count(view_count)
                .user_id(user_id)
                .modified_date(modified_date)
                .board_id(board_id)
                .anonymous(anonymous)
                .build();
    }
}
