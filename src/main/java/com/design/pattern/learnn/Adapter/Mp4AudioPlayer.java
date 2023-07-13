package com.design.pattern.learnn.Adapter;

public class Mp4AudioPlayer implements AdvancedMediaPlayer {
  
  @Override
  public void play(String fileName) {
    System.out.println("Play Mp4: " + fileName);
  }
}
