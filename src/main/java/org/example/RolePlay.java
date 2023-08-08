package org.example;

public class RolePlay implements Genre {
    private RolePlay(){}
    public static RolePlay getRole(){
        return new RolePlay();
    }
    public void roleInit(){
        System.out.println("start role game");
    }

    public void roleDestroy(){
        System.out.println("exit role game");
    }

    @Override
    public String getGame(){
        return "Divinity Original Sin 2";
    }
}
