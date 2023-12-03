package com.practicalclass.OpenBlogLite.service;

import com.practicalclass.OpenBlogLite.dto.TagDTO;
import com.practicalclass.OpenBlogLite.model.Tag;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Rejuan on 12/3/23.
 */
public interface TagService {

    Tag createTag(@RequestBody TagDTO tagDTO);

    List<Tag> getAllTags();
}
