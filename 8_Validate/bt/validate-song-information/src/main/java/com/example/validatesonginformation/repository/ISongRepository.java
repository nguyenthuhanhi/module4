package com.example.validatesonginformation.repository;

import com.example.validatesonginformation.entity.Song;
import org.springframework.data.repository.CrudRepository;

public interface ISongRepository  extends CrudRepository<Song,Integer> {

}
