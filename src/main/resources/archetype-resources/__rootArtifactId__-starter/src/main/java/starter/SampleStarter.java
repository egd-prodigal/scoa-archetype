#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 */
@SpringBootApplication(scanBasePackages = "${package}")
public class SampleStarter {

    public static void main(String[] args) {
        SpringApplication.run(SampleStarter.class, args);
    }

}
