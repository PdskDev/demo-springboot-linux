package me.nadetdev.msvideo.domaine.video.model;

import java.util.Objects;

public class Video {
  private Long id;
  private String title;
  private Integer year;
  private Integer runtime;
  private String category;

  public Video(String title, Integer year, Integer runtime, String category) {
    this.title = title;
    this.year = year;
    this.runtime = runtime;
    this.category = category;
  }

  public Video() {}

  public Long getId() {
    return id;
  }

  public Video setId(Long id) {
    this.id = id;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Video setTitle(String title) {
    this.title = title;
    return this;
  }

  public Integer getYear() {
    return year;
  }

  public Video setYear(Integer year) {
    this.year = year;
    return this;
  }

  public Integer getRuntime() {
    return runtime;
  }

  public Video setRuntime(Integer runtime) {
    this.runtime = runtime;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public Video setCategory(String category) {
    this.category = category;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Video video = (Video) o;
    return Objects.equals(title, video.title)
        && Objects.equals(year, video.year)
        && Objects.equals(runtime, video.runtime)
        && Objects.equals(category, video.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, year, runtime, category);
  }

  @Override
  public String toString() {
    return "Video{"
        + "id="
        + id
        + ", title='"
        + title
        + '\''
        + ", year="
        + year
        + ", runtime="
        + runtime
        + ", category='"
        + category
        + '\''
        + '}';
  }
}
