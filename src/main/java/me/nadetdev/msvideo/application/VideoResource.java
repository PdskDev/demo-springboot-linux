package me.nadetdev.msvideo.application;

import me.nadetdev.msvideo.domaine.video.model.Video;
import me.nadetdev.msvideo.domaine.video.service.VideoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoResource {

    private final VideoService videoService;

    public VideoResource(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping()
    public List<Video> getAllVideos(){
        return this.videoService.getAll();
    }

    @GetMapping("/{id}")
    public Video getById(@PathVariable Long id) {
        return this.videoService.getByid(id);
    }

    @PostMapping()
    public Video add(@RequestBody Video video){
        return this.videoService.add(video);
    }

    @PutMapping("/{id}")
    public Video update(@RequestBody Video videoToUpdate){
        return this.videoService.update(videoToUpdate);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id) {
        return this.videoService.deleteById(id);
    }
}
