package org.cloneeverytime.domain.post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스임을 나타냄
//@Table(name="post")
public class Post {
    @Id //해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //PK의 생성 규칙을 나타냄. GenerationType.IDENTITY 옵션을 추가해야 auto_increment 됨
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private java.time.LocalDateTime created_date;

    @Column(nullable = false)
    private Integer view_count;

    @Column(nullable = false)
    private Long user_id; //엔티티 상의 타입이랑 같게..

    @Column(nullable = false)
    private java.time.LocalDateTime modified_date;

    @Column(nullable = false)
    private Long board_id;

    @Column(nullable = false)
    private Boolean anonymous;


}
