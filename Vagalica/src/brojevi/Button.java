/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brojevi;

import java.util.Objects;
import javax.swing.JButton;

/**
 *
 * @author Nevena i Milena
 */
public class Button {
    
    private int mValue;
    private JButton mButton;

    public Button() {
    }

    public Button(int mValue) {
        this.mValue = mValue;
        this.mButton = new JButton();        
        this.mButton.setText(Integer.toString(mValue));
    }

    public int getmValue() {
        return mValue;
    }

    public void setmValue(int mValue) {
        this.mValue = mValue;
    }

    public JButton getmButton() {
        return mButton;
    }

    public void setmButton(JButton mButton) {
        this.mButton = mButton;
    }

    @Override
    public String toString() {
        return "Button{" + "mValue=" + mValue + ", mButton=" + mButton + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Button other = (Button) obj;
        if (this.mValue != other.mValue) {
            return false;
        }
        if (!Objects.equals(this.mButton, other.mButton)) {
            return false;
        }
        return true;
    }
    
    
    
}
