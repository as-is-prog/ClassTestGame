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
public class Party {
    private Member[] partyMember = new Member[4];
    
    Party(Member... member){
        for(int i = 0;i < member.length && i < 4;i++){
            partyMember[i] = member[i];
        }
    }
    
    public void printPartyList(){
        for(Member member : partyMember){
            if(member != null)System.out.println(member.name);
        }
    }
    
    public void partyAct(){
        for(Member m : partyMember){
            if(m.nowHp>0){
                
            }
        }
    }
    
}
