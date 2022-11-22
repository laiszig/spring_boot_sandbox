package com.laiszig.sat11192022_event_handling;

import org.springframework.context.ApplicationEvent;

public class SweetEvent extends ApplicationEvent {

    public SweetEvent(Object s) {
        super(s);
    }
}
