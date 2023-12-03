package com.practicalclass.OpenBlogLite.controller;

import com.practicalclass.OpenBlogLite.dto.TagDTO;
import com.practicalclass.OpenBlogLite.model.Tag;
import com.practicalclass.OpenBlogLite.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Rejuan on 12/3/23.
 */
@RestController
@RequestMapping("/api/")
public class TagController {

    private TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping("/tags")
    public TagDTO createTag(@RequestBody TagDTO tagDTO) {
        Tag savedTag = tagService.createTag(tagDTO);
        return new TagDTO(savedTag.getId(), savedTag.getName());
    }

    @GetMapping("/tags")
    public List<TagDTO> getAllTags() {
        List<Tag> tags = tagService.getAllTags();
        return tags.stream()
                .map(tag -> new TagDTO(tag.getId(), tag.getName()))
                .collect(Collectors.toList());
    }
}
