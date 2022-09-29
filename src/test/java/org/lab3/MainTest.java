package org.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MainTest {

    PermissionManager permissionManager;

    HashMap<PermissionLevel, String> permissions = new HashMap<>();

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
        permissions.put(PermissionLevel.ADMIN, "Admin");
        permissions.put(PermissionLevel.USER, "User");  
        permissions.put(PermissionLevel.DEVELOPER, "Developer");
    }

    @Test
    @DisplayName("Testing get current level")
    void testGetCurrentLevel() {
        for (PermissionLevel permissionLevel: permissions.keySet()){
            permissionManager.setLevel(permissionLevel);
            assertEquals(permissions.get(permissionLevel), permissionManager.getLevel());
        }
    }
}