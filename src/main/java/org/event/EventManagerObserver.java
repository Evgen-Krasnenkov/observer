package org.event;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagerObserver {
    Map<String, List<EventListener>> listenersMap = new HashMap<>();

    public EventManagerObserver(String... operations) {
        for (String operation : operations) {
            this.listenersMap.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = listenersMap.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = listenersMap.get(eventType);
        listeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> listeners = listenersMap.get(eventType);
        for (EventListener listener : listeners) {
            listener.update(eventType, file);
        }
    }
}