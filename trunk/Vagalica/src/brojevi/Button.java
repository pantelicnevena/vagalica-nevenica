/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brojevi;

import javax.swing.JButton;

/**
 *
 * @author Nevena i Milena
 */
public class Button {
    
    int mValue;
    JButton mButton;

    public Button() {
    }

    public Button(int mValue, JButton mButton) {
        this.mValue = mValue;
        this.mButton = mButton;
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
    
    
    
}
