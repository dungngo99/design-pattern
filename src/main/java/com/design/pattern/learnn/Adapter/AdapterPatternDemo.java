package com.design.pattern.learnn.Adapter;

public class AdapterPatternDemo {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer("mp3");
    audioPlayer.play("mp4", "hello");
    audioPlayer.play("mp3", "how?");

    AudioPlayer audioPlayer2 = new AudioPlayer("mp4");
    audioPlayer2.play("mp3", "hi?");
    audioPlayer2.play("vlc", "is it?");
  }
}
