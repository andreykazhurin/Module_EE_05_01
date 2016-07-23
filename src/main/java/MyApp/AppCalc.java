package MyApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.myCalculator.Calculator;
import ua.com.myCalculator.FailedExpression;

/**
 * Created by Andrey on 23.07.2016.
 */
public class AppCalc {

    private Calculator calculator;
    private ConsoleHelper consoleHelper;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AppCalc appCalc = applicationContext.getBean("appCalc", AppCalc.class);
        appCalc.execute();
    }


    public void setConsoleHelper(ConsoleHelper consoleHelper) {
        this.consoleHelper = consoleHelper;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    private void execute() {
        while (true) {
            String input = consoleHelper.inputStringFromConsole();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                String result = calculator.calculate(input);
                consoleHelper.printToConsole(input, result);
            }
            catch (FailedExpression  | RuntimeException e) {
                consoleHelper.printErrorToConsole(input, e.getMessage());
            }
        }
    }


}
