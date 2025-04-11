package me.nadetdev.msvideo.domaine.video.repository;

import me.nadetdev.msvideo.domaine.video.model.Video;

import java.util.List;

public interface VideoRepository {
  List<Video> getAll();

  Video add(Video video);

  Video getById(Long id);

  Video update(Video video);

  Boolean delete(Long id);
}
