package br.com.nidonoga.designpattern.bridge.transmissions;

import br.com.nidonoga.designpattern.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas!");
    }

    public void comments(){
        System.out.println("Comentarios liberados!");
    }
}
