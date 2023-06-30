package com.example.update_photo1.repository;

import com.example.update_photo1.entity.Picture;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPictureReposirory extends JpaRepository<Picture,Integer> {
    @Query(value = "select p from Picture p  where p.date = :date")
    List<Picture> findAllToday(@Param("date") String date);
}
