package com.example.musicapi.servise;

import java.util.List;

import com.example.musicapi.entity.Album;

public interface IAlbumsService {
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);

}
