package liskovsubs.baddesign;

import liskovsubs.baddesign.MediaPlayer;

public class VlcMediaPlayer implements MediaPlayer {

    @Override
    public void playVideo() {
        System.out.println("Play Video in VLC");
    }

    @Override
    public void playAudio() {
        System.out.println("Play Audio in VLC");
    }
}
