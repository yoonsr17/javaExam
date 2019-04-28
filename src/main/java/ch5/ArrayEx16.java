package ch5;

public class ArrayEx16 {
    public static void main(String[] args) {
        if(args != null) {      // args가 null이 아닐 때만 {} 수행
            System.out.println("매개변수의 개수:" + args.length);

            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = \"" + args[i] + "\"");
            }
        }
    }
}

