/*
 * The original code is Plethora. The initial developer of the original
 * code is the Plethora Group at The American University in Cairo.
 *
 * http://www.cs.aucegypt.edu/
 *
 * Color3fPropertyEditor.java
 * Created on November 15, 2006
 */

package org.netbeans.modules.plethora.properties;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import javax.vecmath.Color3f;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 * Property editor for properties of type javax.vecmath.Color3f
 *
 * @author Mohamed El-Geish
 * @version 1.00
 */
public class Color3fPropertyEditor extends PropertyEditorSupport {
    
    public String getAsText() {
        Color3f color = (Color3f) getValue();
        
        if (color == null) {
            return "";
        }
        
        return "[" + color.x + ", " + color.y + ", " + color.z + "]";
    }
    
    public void setAsText(String s) {
        try {
            setValue(parseColor3f(s));
        } catch (Exception ex) {
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message(
                    "Can NOT parse Color3f", NotifyDescriptor.INFORMATION_MESSAGE));
        }
        
    }
    
    public static Color3f parseColor3f(String s) {
        if(s.charAt(0) == '[' && s.charAt(s.length() - 1) == ']') {
            s = s.substring(1, s.length() - 1);
        }
        
        String[] array = s.split(",");
        
        return new Color3f(
                Float.parseFloat(array[0]),
                Float.parseFloat(array[1]),
                Float.parseFloat(array[2]));
    }
    
    public boolean supportsCustomEditor() {
        return true;
    }
    
    public Component getCustomEditor() {
        return new Color3fCustomEditor(this);
    }
    
}