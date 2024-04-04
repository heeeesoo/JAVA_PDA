package day0403;

public class EX01 {
    // 점수를 받는 변수, 점수가 87점
    // 90점 이상이면 A
    // 80점 이상이면 B
    // 70점 이상이면 C
    // 그 아래면 D
    public static void main(String[] args) {
        int score = 87;
        if(score >= 90){
            System.out.println('A');
        }else if(90>score && score>=80){
            System.out.println('B');
        }else if(80>score && score>=70){
            System.out.println('C');
        }else if(70> score){
            System.out.println('F');
        }
    }
}
