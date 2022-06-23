import javax.swing.*;
import java.awt.*;

public class task extends JPanel {

        private JLabel index;
        private JTextField taskname;
        private JButton done;


        private boolean checked;

     task()
    {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.RED);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskname = new JTextField("Vour task here");
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(Color.RED);

        this.add(taskname,BorderLayout.CENTER);

        done = new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());

        this.add(done,BorderLayout.EAST);

    }
        public void changeIndex(int num)
        {
            this.index.setText(num+"");
            this.revalidate();
        }
    }

