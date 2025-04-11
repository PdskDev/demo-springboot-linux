package me.nadetdev.msvideo.domaine.video.service;

import me.nadetdev.msvideo.domaine.video.model.Video;

import java.util.List;

public interface VideoService {
  List<Video> getAll();

  Video getByid(Long id);

  Video add(Video video);

  Video update(Video video);

  Boolean deleteById(Long id);
}
