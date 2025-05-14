package com.projeto.engenharia.esiv_fatec.controller;

import com.projeto.engenharia.esiv_fatec.security.JwtUtil;
import com.projeto.engenharia.esiv_fatec.dto.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtUtil jwtUtil;

  @Autowired
  private UserDetailsService userDetailsService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody AuthRequest request) {
    try {
      Authentication authentication = authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
      );

      UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUserName());

      String token = jwtUtil.generateToken(userDetails);

      return ResponseEntity.ok().body(token);

    } catch (AuthenticationException e) {
      return ResponseEntity.status(401).body("Usuário ou senha inválidos");
    }
  }
}
