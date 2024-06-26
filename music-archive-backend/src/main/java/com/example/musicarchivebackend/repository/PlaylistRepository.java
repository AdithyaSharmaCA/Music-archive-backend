package com.example.musicarchivebackend.repository;

import com.example.musicarchivebackend.model.Playlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepository extends MongoRepository<Playlist, String> {
    //this will give me access to .save(), .findAll(), .findById and a host of other
    //CRUD operations without me writing the mongodb query
    //cool stuff
    List<Playlist> findAllByUserID(String userID);
}
