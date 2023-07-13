package com.design.pattern.learnn.Adapter;

public class AudioPlayer implements MediaPlayer {

  AudioAdapter audioAdapter;

  public AudioPlayer(String audioType) {
    if (audioType.equals("mp4") || audioType.equals("vlc")) {
      audioAdapter = new AudioAdapter(audioType);
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equals("mp3")) {
      System.out.println("Play mp3: " + fileName);
    } else {
      audioAdapter.play(audioType, fileName);
    }
  }

}
