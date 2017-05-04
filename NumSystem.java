public class NumSystem {

    public static void main(String[] args) {
        String number = args[0];
        String baseOld = args[1];
        String baseNew = args[2];
        System.out.println(number);
        long num=Long.parseLong(number,Byte.parseByte(baseOld));
        System.out.println(num);
        System.out.println(Long.toString(num,Byte.parseByte(baseNew)));
        

    }
    
}