package liskovsubs.baddesign;

import liskovsubs.baddesign.MediaPlayer;

public class WinMediaPlayer implements MediaPlayer {
    @Override
    public void playVideo() {
        // Not Available func for video
        throw new RuntimeException();
    }

    @Override
    public void playAudio() {
        System.out.println("Play Audio in WinMediaPlayer");
    }
}
