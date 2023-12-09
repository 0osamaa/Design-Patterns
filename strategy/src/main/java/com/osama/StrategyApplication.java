package com.osama;

import com.osama.service.Context;
import com.osama.service.OperationAdd;
import com.osama.service.OperationMul;
import com.osama.service.OperationSub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);

        /*Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.execute(10, 5));*/

    }

}
