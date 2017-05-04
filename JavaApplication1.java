public class JavaApplication1 {
    public static void main(String[] args) {
        for (String arg:args){
            long num = Long.parseLong(arg);
            String res = String.valueOf(num).concat(" - long");
            if (num>=-2147483648 && num<=2147483647) res = String.valueOf(num).concat(" - int");
            if (num>=-32768 && num<=32767) res = String.valueOf(num).concat(" - short");
            if (num>=-128 && num<=127) res = String.valueOf(num).concat(" - byte");
            System.out.println(res);
        }
    }
    
}