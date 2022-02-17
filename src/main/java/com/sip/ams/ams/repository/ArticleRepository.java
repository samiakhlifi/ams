package com.sip.ams.ams.repository;

import com.sip.ams.ams.entities.Article;
import com.sip.ams.ams.entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
