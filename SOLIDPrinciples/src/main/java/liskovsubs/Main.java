package liskovsubs;

import liskovsubs.baddesign.MediaPlayer;
import liskovsubs.baddesign.VlcMediaPlayer;
import liskovsubs.baddesign.WinMediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer vlc = new VlcMediaPlayer();
        MediaPlayer win = new WinMediaPlayer();

        vlc.playAudio();
        vlc.playVideo();

        win.playVideo();
        win.playAudio();
    }
}
