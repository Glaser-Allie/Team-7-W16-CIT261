/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exception.MapException;
import model.Location;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MapControl {

    private int row;
    private int col;
    private Location[][] locations;
    
    public static MainMap createMap(Player player) {
        
        MainMap map = new MainMap(3, 4);
        
        map.initialize();
        
        player.setLocation(map.getLocations()[1][1]);
        
        return map;
        
        Location location = createLocation();
        
        //Scene[] scenes = createScenes();
        GameControl gameControl = new GameControl();
        gameControl.assignNamesToLocations(map);
        return map;
    }

    
    private static Location createLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*public Map() {
        
    }
    //public MainMap (int row, int col) {
    
        
    }*/
    
        
//    public void move(Location l){
//    
//       System.out.println(l);
//     
//    }
}

  