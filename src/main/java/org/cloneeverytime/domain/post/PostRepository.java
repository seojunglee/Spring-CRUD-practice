package org.cloneeverytime.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

//기본적인 CRUD 메소드가 자동으로 생성됨
public interface PostRepository extends JpaRepository<Post, Long> {
}
