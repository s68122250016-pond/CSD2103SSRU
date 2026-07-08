import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("P001");
        queue.add("P002");
        queue.add("P003");
        queue.add("P004");
        queue.add("P005");

        System.out.println("===== คิวผู้ป่วยเริ่มต้น =====");
        System.out.println(queue);

        System.out.println("\nเรียกผู้ป่วยเข้ารับบริการ");

        for (int i = 0; i < 2; i++) {

            if (!queue.isEmpty()) {
                System.out.println("รับบริการ : " + queue.remove());
            } else {
                System.out.println("ไม่มีผู้ป่วยในคิว");
            }
        }

        queue.add("P006");
        queue.add("P007");

        System.out.println("\nผู้ป่วยคนถัดไป : " + queue.peek());

        System.out.println("จำนวนผู้ป่วยที่รอ : " + queue.size());

        System.out.println("\nสถานะของ Queue");
        System.out.println(queue);

        System.out.println("\nหลักการทำงานของ Queue");
        System.out.println("FIFO (First In First Out)");
        System.out.println("ผู้ที่เข้าคิวก่อน จะได้รับบริการก่อน");

        System.out.println("\nTime Complexity");
        System.out.println("add() = O(1)");
        System.out.println("remove() = O(1)");
        System.out.println("peek() = O(1)");
    }
}