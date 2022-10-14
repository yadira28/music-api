package com.example.musicapi.servise.jpa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.musicapi.entity.Album;
import com.example.musicapi.repository.AlbumsRepository;
import com.example.musicapi.servise.IAlbumsService;


@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}

	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
		
	}

}