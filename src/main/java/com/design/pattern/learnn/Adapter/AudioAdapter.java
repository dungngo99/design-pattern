package com.design.pattern.learnn.Adapter;

import java.util.Objects;

public class AudioAdapter implements MediaPlayer {
  
  AdvancedMediaPlayer advancedMediaPlayer;

  public AudioAdapter(String audioType) {
    if (audioType.equals("mp4")) {
      advancedMediaPlayer = new Mp4AudioPlayer();
    } else if (audioType.equals("vlc")) {
      advancedMediaPlayer = new VlcAudioPlayer();
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    if (Objects.isNull(advancedMediaPlayer)) {
      System.out.println("No available audio to play");
      return;
    }
    if (audioType.equals("mp4") || audioType.equals("vlc")) {
      advancedMediaPlayer.play(fileName);
    } else {
      System.out.println("Invalid audio player");
    }
  }
  
}
