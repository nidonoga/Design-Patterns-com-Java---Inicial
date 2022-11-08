package br.com.nidonoga.designpattern.bridge.transmissions;

import br.com.nidonoga.designpattern.bridge.platforms.IPlatform;

public class RecordedLive extends Live {

    public RecordedLive(IPlatform platform){
        super.platform = platform;
    }

    public void record(){
        System.out.println("Gravando Live!");
    }
}
