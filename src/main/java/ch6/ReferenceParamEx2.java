package ch6;

class ReferenceParamEx2 {
    public static void main(String[] args)
    {
        int[] x = {10};  // 크기가 1인 배열. x[0] = 10;
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) { // 참조형 매개변수 2
        x[0] = 1000;
        System.out.println("change() 2 : x = " + x[0]);
    }
}