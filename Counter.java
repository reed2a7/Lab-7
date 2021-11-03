import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    int countLeft = 0;
    int countRight = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count " + countLeft);
    rightLabel = new JLabel("Count " + countRight);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");

    reset.addActionListener(this);
    frame.add(reset);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) { 
    int countLeft = 0; 

    if (ae.getActionCommand().equals("Left")) {
      countLeft++;
      leftLabel.setText("Left " + countLeft);

    }
    if (ae.getActionCommand().equals("Right")) {
      rightLabel.setText("Right");
    }
    if (ae.getActionCommand().equals("Reset")) {
      countLeft = 0;
    }
  }
}
