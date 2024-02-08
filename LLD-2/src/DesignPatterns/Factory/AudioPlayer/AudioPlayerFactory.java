package DesignPatterns.Factory.AudioPlayer;

public class AudioPlayerFactory {
    public static AudioPlayer getPlayer(MediaFormat fmt,int vol,double play){
        switch (fmt){
            case  MP3 -> new MP3Player(vol,play);
            case FLAC -> new FLACPlayer(vol,play);
            case WAV -> new WAVPlayer(vol,play);
        };
        return null;
    };
}
