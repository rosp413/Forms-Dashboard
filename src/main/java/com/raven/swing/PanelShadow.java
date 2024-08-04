package com.raven.swing;

import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class PanelShadow extends javax.swing.JPanel {
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int radius = 20;
    public PanelShadow() {
        setBackground(new Color(242, 246, 253));
        setBorder(new EmptyBorder(16, 16, 16, 16));
        setOpaque(false);
    }
}

