/*
 * package com.maybank.todo.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.maybank.todo.config.UserPrincipal; import
 * com.maybank.todo.entity.User; import com.maybank.todo.entity.UserRepository;
 * 
 * @Service public class UserDetailService implements UserDetailsService {
 * 
 * @Autowired private UserRepository repo;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { User user = repo.findUsername(username); if(user
 * == null) { throw new UsernameNotFoundException("User Not Found"); } return
 * new UserPrincipal(user); }
 * 
 * }
 */
