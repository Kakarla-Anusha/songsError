// Write your code here
package com.example.song.repository;

import java.util.*;
import com.example.song.model.Song;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song songById(int songId);

    Song updateSong(int songId, Song song);

    Song addSong(Song song);

    void deleteSong(int songId);
}