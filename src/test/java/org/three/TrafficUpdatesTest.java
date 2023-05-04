package org.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrafficUpdatesTest {

    @Test
    void testTrafficUpdate() {
        City sunnyville = new City();
        City springfield = new City();
        TrafficUpdates trafficUpdates = new TrafficUpdates();

        sunnyville.addObserver(trafficUpdates);
        springfield.addObserver(trafficUpdates);
        sunnyville.updateTraffic("Congestion in town center");
        springfield.updateTraffic("Accident on the highway");

        Assertions.assertEquals("Congestion in town center", trafficUpdates.getUpdates().get(0));
        Assertions.assertEquals("Accident on the highway", trafficUpdates.getUpdates().get(1));
    }

}