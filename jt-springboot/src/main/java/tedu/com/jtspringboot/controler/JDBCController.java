package tedu.com.jtspringboot.controler;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@ConfigurationProperties(prefix = "jdbc")
public class JDBCController {
	
	//向spring容器利用spel表达式动态获取数据,
	
	//@Value("${jdbc.usernameaaaa}")
	private String username;
	//@Value("${jdbc.password}")
	private String password;
	
	
	//注意事项：使用方式时，切记使用set方法。
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		
		return username+":"+password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
