package DesignPatterns.Factory.AbstractAudioPlayer;

import DesignPatterns.Factory.AbstractAudioPlayer.decoder.AudioDecoder;
import DesignPatterns.Factory.AbstractAudioPlayer.processor.AudioProcessor;
import DesignPatterns.Factory.AbstractAudioPlayer.player.AudioPlayer;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();
    public abstract AudioDecoder createDecoder(byte[] audioData);

    public abstract AudioPlayer createPlayer(int volume, double playBackRate);
    public abstract AudioProcessor createProcessor(byte[] audioData);
}