package com.practicalclass.OpenBlogLite.service.impl;

import com.practicalclass.OpenBlogLite.dto.TagDTO;
import com.practicalclass.OpenBlogLite.model.Tag;
import com.practicalclass.OpenBlogLite.repository.TagRepository;
import com.practicalclass.OpenBlogLite.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rejuan on 12/3/23.
 */
@Service
public class TagServiceImpl implements TagService {

    private TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Tag createTag(TagDTO tagDTO) {
        Tag tag = new Tag();
        tag.setName(tagDTO.getName());
        return tagRepository.save(tag);
    }

    @Override
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }
}
