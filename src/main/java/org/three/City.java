package org.three;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {
  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  private String trafficUpdate = "";

  public void addObserver(PropertyChangeListener observable){
    support.addPropertyChangeListener(observable);
  }

  public void updateTraffic(String trafficUpdate) {
    support.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }

}
