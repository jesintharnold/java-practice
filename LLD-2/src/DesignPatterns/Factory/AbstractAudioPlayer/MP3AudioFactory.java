package DesignPatterns.Factory.AbstractAudioPlayer;

import DesignPatterns.Factory.AbstractAudioPlayer.decoder.AudioDecoder;
import DesignPatterns.Factory.AbstractAudioPlayer.decoder.MP3Decoder;
import DesignPatterns.Factory.AbstractAudioPlayer.processor.AudioProcessor;
import DesignPatterns.Factory.AbstractAudioPlayer.processor.MP3AudioProcessor;
import DesignPatterns.Factory.AbstractAudioPlayer.player.AudioPlayer;
import DesignPatterns.Factory.AbstractAudioPlayer.player.MP3Player;

public class MP3AudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder createDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer createPlayer(int volume, double playBackRate) {
        return new MP3Player(volume,playBackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}
