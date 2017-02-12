/*
 * License Notice
 *
 * This file is part of Plethora.
 *
 * Plethora is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * Plethora is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Plethora; if not, write to the Free Software
 *
 * The original code is Plethora. The initial developer of the original
 * code is the Plethora Group at The American University in Cairo.
 *
 * http://www.cs.aucegypt.edu/
 *
 * ZeroToOnePropertyEditor.java
 * Created on November 15, 2006
 */

package org.netbeans.modules.plethora.properties;

import java.beans.PropertyEditorSupport;
import org.openide.explorer.propertysheet.ExPropertyEditor;
import org.openide.explorer.propertysheet.InplaceEditor;
import org.openide.explorer.propertysheet.PropertyEnv;


/**
 * Property editor for float values that ranges from 0 to 1
 *
 * @see FloatInplaceSpinner
 *
 * @author Mohamed El-Geish
 * @version 1.00
 */
public class ZeroToOnePropertyEditor extends PropertyEditorSupport implements ExPropertyEditor, InplaceEditor.Factory {
    
    private InplaceEditor inplaceEditor;

    public void attachEnv(PropertyEnv env) {
        env.registerInplaceEditorFactory(this);
    }
    
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        setValue(Float.parseFloat(text));
    }
    
    public InplaceEditor getInplaceEditor() {
        if (inplaceEditor == null) {
            inplaceEditor = new FloatInplaceSpinner(0, 1, 0.1f);
        }
        
        return inplaceEditor;
    }

}