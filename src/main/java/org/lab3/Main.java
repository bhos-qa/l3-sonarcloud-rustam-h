package org.lab3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

enum PermissionLevel{
    ADMIN, DEVELOPER, USER
}

class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel setLevel(PermissionLevel level){
        this.mCurrentLevel = level;
        return this.mCurrentLevel;
    }

    public String getLevel() {
        return switch (this.mCurrentLevel) {
            case USER -> "User";
            case DEVELOPER -> "Developer";
            case ADMIN -> "Admin";
        };
    }
}

