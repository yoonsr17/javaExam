package ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum =0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length ; i++ ) {        // 반복문을 이용해서 배열에 있는 값 전부를 더한다.
            sum += score[i];
        }

        average = sum / (float)score.length ; // 계산결과를 float로 형변환.

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}

