package com.eltornillofeliz.backend.security.jwt;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eltornillofeliz.backend.security.user.Role;
import com.eltornillofeliz.backend.security.user.User;

class JwtServiceTest {

    private JwtService jwtService;

    @BeforeEach
    void setUp() {
        jwtService = new JwtService("EstaEsMiClaveSuperSecretaParaElTornilloFeliz123!", 3600000L);
    }

    @Test
    void generateToken_shouldReturnValidToken() {
        User dummy = new User();
        dummy.setUsername("admin");
        dummy.setRole(Role.ADMIN);

        String token = jwtService.generateToken(dummy);

        assertNotNull(token);
        assertTrue(jwtService.isTokenValid(token, dummy));
    }
}



