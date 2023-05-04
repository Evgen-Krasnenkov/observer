package org.three;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class TrafficUpdates implements PropertyChangeListener {

  private ArrayList<String> updates = new ArrayList<>();

  public List<String> getUpdates() {
    return updates;
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    updates.add((String) evt.getNewValue());
  }
}
