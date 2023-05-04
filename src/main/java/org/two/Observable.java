package org.two;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Observable {

  private PropertyChangeSupport support = new PropertyChangeSupport(this);
  private String status = "";

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  public void setStatus(String status) {
    support.firePropertyChange("status", this.status, status);
    this.status = status;
  }

}
