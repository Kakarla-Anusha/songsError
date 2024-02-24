/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.service.SongH2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.song.model.Song;

@RestController
public class SongController {
    @Autowired
    private SongH2Service songh2service;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songh2service.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song songById(@PathVariable("songId") int songId) {
        return songh2service.songById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songh2service.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songh2service.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId) {
        songh2service.deleteSong(songId);
    }
}