package br.com.nidonoga.designpattern.bridge;

import br.com.nidonoga.designpattern.bridge.platforms.Facebook;
import br.com.nidonoga.designpattern.bridge.platforms.IPlatform;
import br.com.nidonoga.designpattern.bridge.platforms.TwitchTV;
import br.com.nidonoga.designpattern.bridge.platforms.YouTube;
import br.com.nidonoga.designpattern.bridge.transmissions.AdvancedLive;
import br.com.nidonoga.designpattern.bridge.transmissions.Live;
import br.com.nidonoga.designpattern.bridge.transmissions.RecordedLive;

public class Main {
    public static void main(String[] args) {

        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());

    }

    private static void startLive(IPlatform platform){
        System.out.println("Aguarde ...");

        /*
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
        */

        /*
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.subtitles();
        advancedLive.comments();
        advancedLive.result();
        */

        RecordedLive recordedLive = new RecordedLive(platform);
        recordedLive.broadcasting();
        recordedLive.result();
        recordedLive.record();

    }
}