public class Main {

    public static void main(String[] args) {
	    double val1 = 100.0d;
        double val2 = 343.2d;
        double result;
        char opCode = 'd';

        if (opCode == 'a') {
            result = val1 + val2;
        }
        else if (opCode == 's') {
            result = val1 - val2;
        }
        else if (opCode == 'm') {
            result = val1 * val2;
        }
        else if (opCode == 'd') {
            result = val1 / val2;
        }
        else {
            result = 0.0d;
        }

        System.out.println(result);

    }
}