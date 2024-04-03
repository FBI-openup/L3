package Controller;

import Model.*;
import View.*;

import java.awt.event.*;
import java.util.Random;

/*
    * CornMouseListener class
    * It listens for mouse events on the corn panel
*/
public class CornMouseListener implements MouseListener {
    // Instance variables
    private final Corn corn;
    private final CornStateView cornStateView;
    private final int REVENU_GROWING = 1;
    private final int REVENU_READY_TO_HARVEST = 5;
    private final int REVENU_WILTED = 0;


    // Constructor
    public CornMouseListener(Corn corn, CornStateView cornStateView) {
        this.corn = corn;
        this.cornStateView = cornStateView;
        this.cornStateView.addMouseListener(this); // Add this controller as the mouse listener for the panel
    }

    // Set the revenue generated by the corn when the panel is clicked
    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        if (corn.getState() == CornState.GROWING) {
            corn.setRevenue(REVENU_GROWING); // Set the revenue directly
        } else if (corn.getState() == CornState.WILTED) {
            corn.setRevenue(REVENU_WILTED);// Set the revenue directly
        }
        else { // CornState.READY_TO_HARVEST
            corn.setRevenue(REVENU_READY_TO_HARVEST); // Set the revenue directly
        }
        System.out.println("Revenue generated: " + corn.getRevenue());*/
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Do nothing
    }
}