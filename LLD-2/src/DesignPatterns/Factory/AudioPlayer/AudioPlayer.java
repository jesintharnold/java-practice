package DesignPatterns.Factory.AudioPlayer;

public abstract class AudioPlayer {

    protected  int volume;
    protected  double playBackRate;
    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }
    public abstract MediaFormat supportsType();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract int getVolume();
    public abstract void setVolume(int volume);
    public abstract double getPlayBackRate();


}
