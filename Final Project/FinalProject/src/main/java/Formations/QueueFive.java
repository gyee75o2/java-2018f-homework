package Formations;

import Source.Global;

public class QueueFive extends Formation {

    //MARK:Initialize
    public QueueFive(boolean isBro){

        if(isBro == true){

            /*calabash queue5*/

            map.clearCalabash();

            map.setPosition(4,1, Global.calabashBrother.getCalabash(1));
            map.setPosition(3,3, Global.calabashBrother.getCalabash(2));
            map.setPosition(5,3, Global.calabashBrother.getCalabash(3));
            map.setPosition(2,5, Global.calabashBrother.getCalabash(4));
            map.setPosition(4,5, Global.calabashBrother.getCalabash(5));
            map.setPosition(6,5, Global.calabashBrother.getCalabash(6));
            map.setPosition(4,7, Global.calabashBrother.getCalabash(7));

            map.setPosition(0,4,Global.grandFather);

        }
        else{

            /*monster queue5*/

            map.clearMonster();

            map.setPosition(14,1,Global.monsters.getMonster(1));
            map.setPosition(13,3,Global.monsters.getMonster(2));
            map.setPosition(15,3,Global.monsters.getMonster(3));
            map.setPosition(12,5,Global.monsters.getMonster(4));
            map.setPosition(14,5,Global.monsters.getMonster(5));
            map.setPosition(16,5,Global.monsters.getMonster(6));
            map.setPosition(14,7,Global.monsters.getMonster(7));

            map.setPosition(18,4,Global.snake);
            map.setPosition(18,6,Global.scorpion);

        }
    }
}
