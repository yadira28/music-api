package com.example.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.musicapi.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}