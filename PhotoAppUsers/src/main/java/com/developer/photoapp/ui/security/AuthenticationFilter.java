/*
 * package com.developer.photoapp.ui.security;
 * 
 * import java.io.IOException; import java.util.ArrayList;
 * 
 * import javax.servlet.FilterChain; import javax.servlet.ServletException;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.Authentication; import
 * org.springframework.security.core.AuthenticationException; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * import com.developer.photoapp.ui.model.LoginRequestModal; import
 * com.fasterxml.jackson.databind.ObjectMapper;
 * 
 * public class AuthenticationFilter extends
 * UsernamePasswordAuthenticationFilter {
 * 
 * @Override public Authentication attemptAuthentication(HttpServletRequest
 * request, HttpServletResponse response) throws AuthenticationException {
 * 
 * try { LoginRequestModal creds = new
 * ObjectMapper().readValue(request.getInputStream(), LoginRequestModal.class);
 * return this.getAuthenticationManager().authenticate(new
 * UsernamePasswordAuthenticationToken(creds.getEmail(), creds.getPassword(),
 * new ArrayList<>())); } catch (IOException e) { throw new RuntimeException();
 * }
 * 
 * }
 * 
 * @Override protected void successfulAuthentication(HttpServletRequest request,
 * HttpServletResponse response, FilterChain chain, Authentication authResult)
 * throws IOException, ServletException {
 * 
 * String username = ((User) authResult.getPrincipal()).getUsername(); }
 * 
 * }
 */