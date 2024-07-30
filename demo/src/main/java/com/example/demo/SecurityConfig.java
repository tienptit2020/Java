//package com.example.demo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true,
//        prePostEnabled = true, jsr250Enabled = true)//bao mat trên hàm ítdungfg
//public class SecurityConfig {
//
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Autowired
//    JwtTokenFilter tokenFilter;
//    @Autowired
//    public void config(AuthenticationManagerBuilder auth)
//            throws Exception{
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(new BCryptPasswordEncoder());
//    }
//    @Bean  // check xac thuc
//    public AuthenticationManager authenticationManager(
//            AuthenticationConfiguration authenticationConfiguration)
//            throws Exception {
//
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean
//    public SecurityFilterChain config(HttpSecurity http) throws Exception {
//    http.authorizeRequests()
//            .antMatchers("/admin/**")
//            .hasAnyAuthority("ADMIN")
//            .antMatchers("/department/**")
//            .authenticated()
//            .anyRequest().permitAll()
//            .and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//            .and().httpBasic()// thay vì sử dung basic mỗi lần đăng nhập ử dụng username password
//            // khi gửi viết API sau khi đăng nhập sẽ gửi lên thì sẽ cấp cho 1 cái string được encode là các dữ liệu , lần sau gửi lên thì sẽ gửi lên thay vì username password
//            .and().csrf().disable();
//        //apply filter
//        http.addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
//    return http.build();
//}
//}
