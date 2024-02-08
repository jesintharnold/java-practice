package DesignPatterns.Factory.AbstractAudioPlayer;

import DesignPatterns.Factory.AbstractAudioPlayer.decoder.AudioDecoder;
import DesignPatterns.Factory.AbstractAudioPlayer.decoder.FLACDecoder;
import DesignPatterns.Factory.AbstractAudioPlayer.player.AudioPlayer;
import DesignPatterns.Factory.AbstractAudioPlayer.player.FLACPlayer;
import DesignPatterns.Factory.AbstractAudioPlayer.processor.AudioProcessor;
import DesignPatterns.Factory.AbstractAudioPlayer.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder createDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer createPlayer(int volume, double playBackRate) {
        return new FLACPlayer(volume,playBackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }
}
