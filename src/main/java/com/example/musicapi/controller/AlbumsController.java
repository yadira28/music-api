package com.example.musicapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.musicapi.entity.Album;
import com.example.musicapi.servise.IAlbumsService;


@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbums;

	@GetMapping("/albums")
	public List<Album> buscarTodos() {
		return serviceAlbums.buscarTodos();
	}

}