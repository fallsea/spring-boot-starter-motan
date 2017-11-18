package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Description: 启动类
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:25:11
 */
@ComponentScan(basePackages={"com.fallsea"})
@SpringBootApplication
public class MotanClientWeb
{
    public static void main(String[] args)
    {
        SpringApplication.run(MotanClientWeb.class, args);
    }
    
}
