/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author laurenritter
 */
public class NavigationCntl {
    private MainMenuUI theMainMenu;
    private MainTable theMainTable;
    
    public void toMainMenu(){
        theMainMenu = new MainMenuUI();
        theMainMenu.setLocationRelativeTo(null);
        theMainMenu.setVisible(true);
    }
    
    public void toMainTable(){
        theMainTable = new MainTable();
//        theMainTable.setLocationRelativeTo(null);
//        theMainTable.setVisible(true);
    }
}
