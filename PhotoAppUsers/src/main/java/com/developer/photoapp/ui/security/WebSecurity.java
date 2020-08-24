/*
 * package com.developer.photoapp.ui.security;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * import com.developer.photoapp.ui.service.UserService;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurity extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired UserService userService;
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable();
 * http.authorizeRequests().antMatchers("/users/**").permitAll().and().addFilter
 * (getAuthenticationFilter()); http.headers().frameOptions().disable(); }
 * 
 * private AuthenticationFilter getAuthenticationFilter() throws Exception {
 * AuthenticationFilter authenticationFilter = new AuthenticationFilter();
 * authenticationFilter.setAuthenticationManager(authenticationManager());
 * return authenticationFilter; }
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.userDetailsService(userService); } }
 */