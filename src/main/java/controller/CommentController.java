package controller;

import model.Comment;
import service.CommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments") // Ensure the mapping is correct
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }
}
