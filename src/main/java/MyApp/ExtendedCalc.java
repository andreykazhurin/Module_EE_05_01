package MyApp;
import ua.com.myCalculator.SimpleCalc;

import java.util.HashMap;

/**
 * Created by andrii.kazhurin on 18.07.2016.
 */
public class ExtendedCalc extends SimpleCalc {

    private HashMap<String, String> supportOperations;

    @Override
    public void setSupportOperations() {
        super.setSupportOperations();
        this.supportOperations = getSupportOperations();
        this.supportOperations.put("*","mul");
        this.supportOperations.put("/","div");
    }

    @Override
    public int getPriority(String token) {
        if (token.equals("(")) return 1;

        if (token.equals("*") || token.equals("/")) return 3;

        if (token.equals("+") || token.equals("-")) return 2;

        return 4;
    }

    public Double mul(Double a, Double b) {
        return Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    public Double div(Double a, Double b) {
        return Double.valueOf(a.doubleValue() / b.doubleValue());
    }

}
