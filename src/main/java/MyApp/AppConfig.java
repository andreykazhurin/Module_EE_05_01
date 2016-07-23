package MyApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.myCalculator.Calculator;

/**
 * Created by andrii.kazhurin on 18.07.2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public ExtendedCalc extendedCalc(){
        return new ExtendedCalc();
    }

    @Bean
    public AppCalc appCalc() {
        AppCalc appCalc = new AppCalc();
        appCalc.setConsoleHelper(consoleHelper());
        appCalc.setCalculator(calculator());
        return appCalc;
    }

    @Bean
    public ConsoleHelper consoleHelper() {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        return consoleHelper;
    }

    @Bean
    public Calculator calculator() {
        Calculator calculator = new ExtendedCalc();
        return calculator;
    }


}
