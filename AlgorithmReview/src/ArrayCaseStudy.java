public class ArrayCaseStudy {

    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int total = 0;
        int max = scores[0];
        int min = scores[0];
        int pass = 0;

        for (int score : scores) {
            total += score;

            if (score > max)
                max = score;

            if (score < min)
                min = score;

            if (score >= 7)
                pass++;
        }

        double average = (double) total / scores.length;

        System.out.println("คะแนนรวม = " + total);
        System.out.println("คะแนนเฉลี่ย = " + average);
        System.out.println("คะแนนสูงสุด = " + max);
        System.out.println("คะแนนต่ำสุด = " + min);
        System.out.println("นักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป = " + pass);

        System.out.println("\nนักศึกษาที่ควรได้รับการทบทวน");

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("นักศึกษาคนที่ " + (i + 1) + " ได้ " + scores[i] + " คะแนน");
            }
        }

        System.out.println("\nTime Complexity : O(n)");
    }
}