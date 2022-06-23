import javax.swing.*;
import java.awt.*;

public class list extends JPanel{

    list(){
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);

        this.setLayout(layout);

    }
        public void updateumbers()
        {
            Component[] listItems = this.getComponents();

            for(int i =0;1< listItems.length;i++)
            {
                if(listItems[i] instanceof task)
                {
                    ((task)listItems[i]).changeIndex(i+1);
                }
            }
        }
}

