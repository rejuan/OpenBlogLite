package com.practicalclass.OpenBlogLite.repository;

import com.practicalclass.OpenBlogLite.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rejuan on 12/3/23.
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
