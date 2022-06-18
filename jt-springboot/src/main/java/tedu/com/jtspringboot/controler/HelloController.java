package tedu.com.jtspringboot.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *    封装
 *    懒
 * @author Administrator
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/say")  //处理器映射器
	public String say() {
		
		return "你好SprignBoot!!!!!";
	}
}
