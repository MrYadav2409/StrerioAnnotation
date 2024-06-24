package client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.controller.ProductController;

public class SPHibClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ctx.getBean(ProductController.class).post();
	}

}
