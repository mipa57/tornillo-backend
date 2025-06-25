package com.eltornillofeliz.backend.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/publico")
    public ResponseEntity<String> publico() {
        return ResponseEntity.ok("🌍 Esta ruta es pública");
    }

    @GetMapping("/privado")
    public ResponseEntity<String> privado() {
        return ResponseEntity.ok("🔐 Acceso autorizado ✅");
    }
}
