public class Calc {
    public static void main(String[] args) {
        long operand1 = Long.parseLong(args[0]);
        String operType = args[1];
        long operand2 = Long.parseLong(args[2]);
        double result=0;
        switch (operType){
            case "+": result = operand1+operand2;break;
            case "-": result = operand1-operand2;break;
            case "x": result = operand1*operand2;break;
            case "/": result = operand1/operand2;break;
            default :operType=null;break;
        }
        System.out.println(args);
        if (operType!=null) System.out.println(result);
        else System.out.println("Неизвестная операция");
    }
    
}