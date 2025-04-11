package me.nadetdev.msvideo.domaine.video.service.impl;

import me.nadetdev.msvideo.domaine.video.model.Video;
import me.nadetdev.msvideo.domaine.video.repository.VideoRepository;
import me.nadetdev.msvideo.domaine.video.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

  private final VideoRepository videoRepository;

  public VideoServiceImpl(VideoRepository videoRepository) {
    this.videoRepository = videoRepository;
  }

  @Override
  public List<Video> getAll() {
    return videoRepository.getAll();
  }

  @Override
  public Video getByid(Long id) {
    return videoRepository.getById(id);
  }

  @Override
  public Video add(Video video) {
    return videoRepository.add(video);
  }

  @Override
  public Video update(Video videoToUpdate) {
    return videoRepository.update(videoToUpdate);
  }

  @Override
  public Boolean deleteById(Long id) {
    return this.videoRepository.delete(id);
  }
}
