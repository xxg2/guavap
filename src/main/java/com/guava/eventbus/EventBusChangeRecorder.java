package com.guava.eventbus;

import com.google.common.eventbus.Subscribe;

import javax.swing.event.ChangeEvent;

/**
 * @author Tom Guan
 * @create 2020-04-05
 */
public class EventBusChangeRecorder {
    @Subscribe
    public void recordCustomerChange(ChangeEvent e) {
        recordChange(e.getChange());
    }

    public static void main(String[] args) {
        // somewhere during initialization
        eventBus.register(new EventBusChangeRecorder());
    }
}

// much later
public void changeCustomer() {
        ChangeEvent event = getChangeEvent();
        eventBus.post(event);
}
