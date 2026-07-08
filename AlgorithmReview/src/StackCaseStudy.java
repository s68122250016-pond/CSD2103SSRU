import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("พิมพ์ Data");
        stack.push("พิมพ์ Structure");
        stack.push("ลบ Structure");
        stack.push("พิมพ์ Algorithm");
        stack.push("พิมพ์ Java");

        System.out.println("===== ข้อมูลใน Stack =====");
        System.out.println(stack);

        System.out.println("\nทำการ Undo 2 ครั้ง");

        for (int i = 0; i < 2; i++) {

            if (!stack.isEmpty()) {
                System.out.println("Undo : " + stack.pop());
            } else {
                System.out.println("Stack ว่าง");
            }
        }

        System.out.println("\nStack หลังจาก Undo");
        System.out.println(stack);

        System.out.println("\nหลักการทำงานของ Stack");
        System.out.println("LIFO (Last In First Out)");
        System.out.println("ข้อมูลที่เข้ามาล่าสุด จะถูกนำออกก่อน");

        System.out.println("\nTime Complexity");
        System.out.println("push() = O(1)");
        System.out.println("pop() = O(1)");
        System.out.println("peek() = O(1)");
    }
}