public class Main {
    public static void main(String[] args) {

        int[] score = new int[] {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        char[] grade = new char[score.length];
        int max = score[0], min = score[0]; // max는 최댓값, min은 최솟값
        double avg = 0, total = 0; // avg는 평균값

        for (int i = 0; i < score.length; i++) {

            if (score[i] >= 90) {
                grade[i] = 'A';
            } else if (score[i] >= 80) {
                grade[i] = 'B';
            } else if (score[i] >= 70) {
                grade[i] = 'C';
            } else if (score[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
            if(score[i] < 0 || score[i] > 100) {
                System.out.println("오류입니다");
                continue;
            }


            String passfail = score[i] >= 60 ? " 합격" : " 불합격";
            System.out.println("학생 " + (i + 1) + ": 성적은 " + score[i] + "점, 평가 = " + grade[i] + "," + passfail);


            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }

            total += score[i];
            avg = total / score.length;

            if (score[i] == 100) {
                System.out.println("최고점수 100점! 더 이상 최고점수를 찾지 않습니다.");
                break;
            }
        }

        // 평균 출력
        System.out.printf("평균값: %.2f\n", avg);
        System.out.println("최고점수: " + max);
        System.out.println("최저점수: " + min);
    }
}
