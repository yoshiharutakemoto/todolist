import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class appframe extends JFrame{
    private titlebar title;
    private list list;
    private button btnpanel;

    private JButton addTask;
    private JButton clear;

    appframe()
    {
    this.setSize(400,700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

    title = new titlebar();
    list = new list();
        this.add(title, BorderLayout.NORTH);
        this.add(btnpanel,BorderLayout.SOUTH);

        this.add(list,BorderLayout.CENTER);

        addTask = btnpanel.getAddTask();
        clear= btnpanel.getClear();

        addListeners();
    }

        public void addListeners()
        {
            addTask.addMouseListener(new MouseAdapter()
            {
                @Override
                public void mousePressed(MouseEvent e)
                {
                    task task = new task();
                    list.add(task);
                    list.updateumbers();
                    revalidate();
                }
            });


        }

}
