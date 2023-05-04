package org.two;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class ObserverListener implements PropertyChangeListener {

  private ArrayList<String> statuses = new ArrayList<>();

  public List<String> printStatuses() {
    return statuses;
  }

  public void propertyChange(PropertyChangeEvent event) {
    statuses.add((String) event.getNewValue());
  }

}
