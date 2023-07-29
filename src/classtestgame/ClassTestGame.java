/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtestgame;

import java.util.Scanner;

/**
 *
 * @author qlarineter
 */
public class ClassTestGame {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Party mParty = new Party(new Member("あいうえお"),new Member("かきくけこ"),new Member("さしすせそ"),new Member("たちつてと"),new Member("なにぬねの"));
        //mParty.printPartyList();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("名前を入れる(半角英数のみ)\n>");
        Member player = new Member(sc.nextLine());
        Member enemy = new Member("モンスター");
        System.out.println("** "+enemy.name+" が あらわれた！ **\n");
        boolean firstTime = true;
        
        while(true){
            boolean cont = true;
            boolean cont2 = true;
            int power;
            if(firstTime){
                firstTime = false;
                while(cont){
                    System.out.println(player.name+" は どうする？");
                    System.out.println("1:たたかう\n2:にげる");
                    System.out.print(">");
                    String s = sc.nextLine();
                    switch(s){
                        case "1":
                            cont = false;
                            break;
                        case "2":
                            System.out.println("しかし まわりかこまれてしまった！\n");
                            break;
                        default:
                            System.err.println(s+" は "+player.name+" には できない！\n");
                            break;
                    }
                }
            }
            cont = true;
            
            while(cont){
                System.out.println(player.name+"(HP:"+player.nowHp+") は どうする？");
                System.out.println("1:こうげき\n2:とくぎ\n3:じゅもん");
                System.out.print(">");
                String s = sc.nextLine();
                
                switch(s){
                    case "1":
                        System.out.println(player.name+" は "+enemy.name+"を きりつけた！");
                        power = ((int)(Math.random()*8-4))+player.power;
                        if((int)(Math.random()*100) > 80){
                            System.out.println("かいしん の いちげき！！");
                            power *= 2;
                        }
                        enemy.nowHp -= power;
                        System.out.println(enemy.name+" に "+power+"の ダメージ！");
                        
                        cont = false;
                        break;
                    case "2":
                        cont2 = true;
                        while(cont2){
                            System.out.println("とくぎ を せんたく(MP:"+player.nowMp+")");
                            System.out.println("1:かえんぎり:MP3");
                            System.out.println("2:ひょうけつぎり:MP3");
                            System.out.println("0:やめる");
                            System.out.print(">");
                            String s2 = sc.nextLine();
                            switch(s2){
                                case "1":
                                    if(0 <= player.nowMp - 3){
                                        player.nowMp -= 3;
                                        System.out.println("ほのお を まとった いちげき が "+enemy.name+" を おそう！");
                                        power = ((int)(Math.random()*10-2))+player.power;
                                        if((int)(Math.random()*100) > 80){
                                            System.out.println("かいしん の いちげき！！");
                                            power *= 2;
                                        }
                                        enemy.nowHp -= power;
                                        System.out.println(enemy.name+" に "+power+"の ダメージ！");
                                        cont = false;
                                        cont2 = false;
                                    }else{
                                        System.err.println("しかし MP が たりない！");
                                    }
                                    break;
                                case "2":
                                    if(0 <= player.nowMp - 3){
                                        player.nowMp -= 3;
                                        System.out.println("こおり を まとった いちげき が "+enemy.name+" を おそう！");
                                        power = ((int)(Math.random()*10-2))+player.power;
                                        if((int)(Math.random()*100) > 80){
                                            System.out.println("かいしん の いちげき！！");
                                            power *= 2;
                                        }
                                        enemy.nowHp -= power;
                                        System.out.println(enemy.name+" に "+power+"の ダメージ！");
                                        cont = false;
                                        cont2 = false;
                                    }else{
                                        System.err.println("しかし MP が たりない！");
                                    }
                                    break;
                                case "0":
                                    System.out.println();
                                    cont2 = false;
                                    break;
                                default:
                                    System.out.println(player.name+" には "+s2+" することは できない！\n");
                                    break;
                            }
                        }
                        break;
                    case "3":
                        System.out.println("しかし "+player.name+" には つかえる じゅもん が ない！\n");
                        break;
                    default:
                        System.err.println(s+" は "+player.name+" には できない！\n");
                        break;
                }
            }
            
            if(enemy.nowHp <= 0){
                System.out.println(enemy.name+" は たおれた。");
                break;
            }
            System.out.print("\n");
            
            System.out.println(enemy.name+" は "+player.name+"を するどいつめ で ひっかいた！");
            power = ((int)(Math.random()*8-4))+player.power;
            if((int)(Math.random()*100) > 80){
                System.out.println("つうこん の いちげき！！");
                power *= 2;
            }
            player.nowHp -= power;
            System.out.println(player.name+" に "+power+"の ダメージ！");
                        
            if(player.nowHp <= 0){
                System.out.println(player.name+" は たおれた。");
                break;
            }
            
            System.out.print("\n");
        }
        
    }
    
}
