package service;

import model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private final RestTemplate restTemplate;

    public CommentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Comment> getAllComments() {
        String apiUrl = "https://jsonplaceholder.typicode.com/comments";
        Comment[] comments = restTemplate.getForObject(apiUrl, Comment[].class);
        return Arrays.asList(comments);
    }
}
