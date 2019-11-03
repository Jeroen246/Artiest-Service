package com.thomasmore.ArtiestService.repository;

import com.thomasmore.ArtiestService.entity.Artiest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ArtiestRepository {
    Artiest findArtiestById(@Param("title") int id);
}
