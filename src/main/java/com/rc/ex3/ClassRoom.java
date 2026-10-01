package com.rc.ex3;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassRoom {

    private Speaker speaker;

    public void setSpeaker(@Autowired   Speaker speaker) {
        this.speaker = speaker;
    }

    public Speaker getSpeaker() {
        return speaker;
    }
}