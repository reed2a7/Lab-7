import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.SwingConstants;

class Main {
  public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Counter();
      }
    });
  }
}