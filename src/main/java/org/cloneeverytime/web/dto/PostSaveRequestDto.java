package org.cloneeverytime.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cloneeverytime.domain.post.Post;

import java.time.LocalTime;


@Getter
@NoArgsConstructor
public class PostSaveRequestDto {

    private String title;
    private String content;
    private java.time.LocalTime created_date;
    private int view_count;
    private int user_id;
    private java.time.LocalTime modified_date;
    private int board_id;
    private int anonymous;

    @Builder
    public PostSaveRequestDto(String title, String content, java.time.LocalTime created_date,
                int view_count, int user_id,
                java.time.LocalTime modified_date, int board_id, int anonymous){
        this.title = title;
        this.content = content;
        this.created_date = created_date;
        this.view_count = view_count;
        this.modified_date = modified_date;
        this.board_id = board_id;
        this.anonymous = anonymous;
    }

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
