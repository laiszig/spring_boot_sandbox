package com.laiszig.sat11192022_event_handling;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppListener {

    @EventListener
    public void onApplicationEvent(ContextStartedEvent cse){
        System.out.println("Context started !!!!");
    }

    @EventListener
    public void onApplicationEvent1(ContextStartedEvent cse){
        System.out.println("Context started $$$$");
    }

    @EventListener
    public void onContextStopped(ContextStoppedEvent cse){
        System.out.println("Context started &&&&");
    }

}
