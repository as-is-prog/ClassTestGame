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
public class Member {
    String name;
    int level;
    int exp;
    int maxHp=100,nowHp=maxHp;
    int maxMp=20,nowMp=maxMp;
    int power = 3;
    int mPower = 3;
    int defense = 2;
    int speed = 3;

    public Member(String name) {
        this.name = name;
    }
    
    public void attack(Member enemy){
        int atp = (int)(Math.random()*power) + power;
        System.out.println(this.name+"のこうげき！");
        if(Math.random()*100 > 80){
            System.out.println("かいしんのいちげき！！");
            atp *= 2;
        }
        enemy.nowHp -= atp;
        System.out.println(enemy.name+"に"+atp+"のダメージ！");
        if(enemy.nowHp <= 0){
            System.out.println(enemy.name+"はたおれた");
            enemy.nowHp = 0;
        }
    }
    
    public void heal(Member member){
        int hep = (int)(Math.random()*15)+25;
        System.out.println(this.name+"は回復呪文をとなえた！");
        member.nowHp -= hep;
        System.out.println(member.name+"は"+hep+"回復した！");
        
    }
    
}
