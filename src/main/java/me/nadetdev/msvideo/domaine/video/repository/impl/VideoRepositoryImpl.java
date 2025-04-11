package me.nadetdev.msvideo.domaine.video.repository.impl;

import me.nadetdev.msvideo.domaine.video.model.Video;
import me.nadetdev.msvideo.domaine.video.repository.VideoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoRepositoryImpl implements VideoRepository {

  private final List<Video> videoData;

  public VideoRepositoryImpl(List<Video> videoData) {
    this.videoData = generateDummyVideoList();
  }

  @Override
  public List<Video> getAll() {
    return this.videoData;
  }

  @Override
  public Video add(Video video) {
    video.setId(Long.valueOf(String.valueOf(videoData.size() + 1)));
    this.videoData.add(video);
    return video;
  }

  @Override
  public Video getById(Long id) {
    for (Video video : videoData) {
      if (video.getId().equals(id)) {
        return video;
      }
    }
    return null;
  }

  @Override
  public Video update(Video videoToUpdate) {
    for (Video videoExist : videoData) {
      if (videoExist.getId().equals(videoToUpdate.getId())) {
        this.videoData.remove(videoExist);
        this.videoData.add(videoToUpdate);
        return videoToUpdate;
      }
    }
    return null;
  }

  @Override
  public Boolean delete(Long id) {
    for (Video videoToDelete : videoData) {
      if (videoToDelete.getId().equals(id)) {
        this.videoData.remove(videoToDelete);
        return true;
      }
    }
    return false;
  }

  private List<Video> generateDummyVideoList() {
    List<Video> videoList = new ArrayList<>();
    videoList.add(
        new Video()
            .setId(1L)
            .setTitle("Video 1")
            .setRuntime(90)
            .setCategory("action")
            .setYear(2025));
    videoList.add(
        new Video()
            .setId(2L)
            .setTitle("Video 2")
            .setRuntime(60)
            .setCategory("drame")
            .setYear(2001));
    videoList.add(
        new Video()
            .setId(3L)
            .setTitle("Video 3")
            .setRuntime(130)
            .setCategory("comedie")
            .setYear(1978));
    videoList.add(
        new Video()
            .setId(4L)
            .setTitle("Video 4")
            .setRuntime(75)
            .setCategory("science-fiction")
            .setYear(1995));
    videoList.add(
        new Video()
            .setId(5L)
            .setTitle("Video 5")
            .setRuntime(90)
            .setCategory("biopic")
            .setYear(2010));

    return videoList;
  }
}
