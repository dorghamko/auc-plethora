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
 * SimpleProperty.java
 * Created on November 24, 2006
 */

package org.netbeans.modules.plethora.model;

/**
 * Decription wrapper for the simple properties of the Shape3D, Container3D and Component3D
 *
 * @see Property
 * @see ComplexProperty
 *
 * @author Ismail El-Helw
 * @version 1.00
 */
class SimpleProperty extends Property {
    
    private String value;
    
    public SimpleProperty() {
    }
    
    public SimpleProperty(String name, String type, String value) {
        super(name, type);
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

}