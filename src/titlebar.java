import javax.swing.*;
import java.awt.*;

public class titlebar extends JFrame {

    titlebar(){
        this.setPreferredSize(new Dimension(400,50));
        this.setBackground(Color.RED);

        JLabel titleText = new JLabel("ToDO List");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("sens-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
