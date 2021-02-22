package org.cloneeverytime.service.post;

import lombok.RequiredArgsConstructor;
import org.cloneeverytime.domain.post.PostRepository;
import org.cloneeverytime.web.dto.PostSaveRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long save(PostSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getId();
    }
}
