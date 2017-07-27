package gdork;

import java.awt.Color;
import javax.swing.UIManager;

public class GDork {
    public static void main(String[] args) {
        UIManager.put("ToggleButton.select", new Color(102,102,255));
        UIManager.put("ToggleButton.bounds", new Color(102,102,255));
        splash sp = new splash();
        WorkS wk = new WorkS();        
        sp.setVisible(true);
        try {
            int tm = 0;
            while(tm <= 100)
            {
                sp.LoadTimeC.setText(String.valueOf(tm)+"%");
                sp.LoadBar.setValue(tm);
                Thread.sleep(20);
                if(tm == 99)
                {
                    sp.setVisible(false);
                    wk.setVisible(true);
                    
                }
                tm++;
            }            
        } catch (Exception e) {
        }
    }
    
}
