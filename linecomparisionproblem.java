import java.util.Scanner;

public class linecomparisionproblem {
	public static void main(String[] args) {
		System.out.println("To Check Comparison of Two Lines: ");
		Scanner line = new Scanner(System.in);

		// Take Input From User For Line1
		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		int x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		int y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		int x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		int y2 = line.nextInt();

		// Take Input From User For Line2
		System.out.println("Enter the Value of x Co-ordinate 3rd point: ");
		int a1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 3rd point: ");
		int b1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 4th point: ");
		int a2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 4th point: ");
		int b2 = line.nextInt();

		// Calculate length of line1
		Double length_1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length_1 = " + length_1);

		// Calculate length of line2
		Double length_2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length_2 = " + length_2);

		// By Using if_elseif_else Condition to check Comparison of lines
		if (length_1 > length_2) {
			System.out.println("line_1 Greater Than line_2");
		} else if (length_1 < length_2) {
			System.out.println("line_1 Less Than line_2");
		} else
			System.out.println("Both lines are Equal");

	}
