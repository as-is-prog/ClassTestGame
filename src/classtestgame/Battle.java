/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtestgame;

/**
 *
 * @author qlarineter
 */
public class Battle {

    Party playerParty;
    Member player;
    Party enemyParty;
    Member enemy;

    boolean isSingle = true;
    
    public Battle(Party player,Party enemy) {
        playerParty = player;
        enemyParty = enemy;
        isSingle = false;
    }
    
    public Battle(Member player,Member enemy){
        this.player = player;
        this.enemy = enemy;
        isSingle = true;
    }
    
    public void printStatus(){
       
    }
    
    public boolean startBattle(){
        if(isSingle){
            return singleBattle();
        }else{
            return partyBattle();
        }
    }
    
    private boolean singleBattle(){
        boolean win = true;
        return win;
    }
    
    private boolean partyBattle(){
        boolean win = true;
        return win;
    }
    
}
