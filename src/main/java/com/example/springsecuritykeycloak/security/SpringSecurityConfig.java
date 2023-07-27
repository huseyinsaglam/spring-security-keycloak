package com.example.springsecuritykeycloak.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/login").permitAll()
		.antMatchers("/home").authenticated()
		.and().csrf().disable()
		.formLogin().loginPage("/login")
		.defaultSuccessUrl("/home")
		.usernameParameter("username")
		.passwordParameter("password");
	}
}


/*
*
* WebSecurityConfigurerAdapter` sınıfını genişterek, Spring Security'nin HTTP güvenlik ayarlarını yapılandırmak için kullanılır.
1. `@Configuration`: Bu sınıfın configuratif sınıfı olduğunu belirtir. Spring tarafından tespit edilmesini sağlar.

2. `@EnableWebSecurity`: Spring Security'nin etkinleştirilmesini sağlar ve security ayarlarının yapılmasına izin verir.

3. `configure(HttpSecurity http)`: Bu metot, `WebSecurityConfigurerAdapter` sınıfından extend yoluyla türetilir ve
	 HTTP güvenlik ayarlarını configure için kullanılır.

4. `http.authorizeRequests()`: HTTP isteklerinin nasıl yetkilendirileceğini belirler.

5. `antMatchers()`: Belirli URL kalıplarını tanımlayarak erişim kurallarını belirler.
	Örneğin, `/` ve `/login` URL'lerine herkesin erişebilmesine izin verilirken, `/home` URL'ine sadece kimlik doğrulanmış kullanıcılara izin verilir.

6. `http.csrf().disable()`: CSRF saldırılarına karşı korumayı devre dışı bırakır.
    Bu tür koruma, varsayılan olarak etkin olacaktır, ancak bazı durumlarda devre dışı bırakılabilir (örneğin, bazı API tabanlı uygulamalarda).

7. `formLogin()`: Form tabanlı kimlik doğrulamayı yapılandırır.
   `loginPage("/login")` ile kullanıcıların giriş yapacakları özel bir giriş sayfası belirtilir ve
   `defaultSuccessUrl("/home")` ile başarılı giriş yaptıktan sonra yönlendirilecekleri URL belirtilir.

8. `usernameParameter()` ve `passwordParameter()`: Giriş formunda kullanılacak olan kullanıcı adı ve şifre parametrelerini belirtir.
*/
