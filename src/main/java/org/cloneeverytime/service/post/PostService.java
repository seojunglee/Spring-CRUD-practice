//package org.cloneeverytime.service.post;
//
//
//import org.cloneeverytime.domain.post.Post;
//import org.cloneeverytime.domain.post.PostRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//@Transactional
//public class PostService {
//    @Autowired
//    private PostRepository userRepository;
//    public List<Post> listAllUser() {
//        return userRepository.findAll();
//    }
//
//    public void saveUser(Post user) {
//        userRepository.save(user);
//    }
//
//    public Post getUser(Integer id) {
//        return userRepository.findById(id).get();
//    }
//
//    public void deleteUser(Integer id) {
//        userRepository.deleteById(id);
//    }
//}