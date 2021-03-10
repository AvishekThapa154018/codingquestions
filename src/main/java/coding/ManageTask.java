package coding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Data");
        try {
            int totalNoOfTask = Integer.parseInt(input.nextLine());
            int noOfTaskForEachMember = Integer.parseInt(input.nextLine());
            int daysAllocated = Integer.parseInt(input.nextLine()); // 20 1 4
            if (totalNoOfTask <= 0 || noOfTaskForEachMember <= 0 || daysAllocated <= 0) {
                System.out.println("INVALID INPUT");
            } else {
                int res = canBeCompleted(totalNoOfTask, noOfTaskForEachMember, daysAllocated);
                System.out.println(res);
            }
        } catch (InputMismatchException ie) {
            System.out.println("INVALID INPUT");
        }
    }

    private static int canBeCompleted(int totalNoOfTask, int noOfTaskForEachMember, int daysAllocated) {
        int maxNoOfTask = daysAllocated * (5 * noOfTaskForEachMember);
        return totalNoOfTask <= maxNoOfTask ? 1 : 0;
    }
}
