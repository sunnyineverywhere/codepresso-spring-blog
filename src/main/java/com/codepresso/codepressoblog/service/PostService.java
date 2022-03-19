package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;

    public PostService(PostMapper postMapper){
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost(){
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size){
        return postMapper.findByPage(size, (page-1) * size);
    }


    //  컨트롤러와 매퍼의 중계 역할
    public Post getPostById(Integer id){
        return postMapper.findOne(id);
    }
}
