package com.design.pattern.learnn.Adapter;

public class VlcAudioPlayer implements AdvancedMediaPlayer {

  @Override
  public void play(String fileName) {
    System.out.println("Play Vlc" + "-" + fileName);
  }
  
}
