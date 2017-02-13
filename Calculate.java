public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate..");
		int numOper  = Integer.valueOf(arg[0]);
		int first = Integer.valueOf(arg[1]);
		int second = Integer.valueOf(arg[2]);
        int res = 1;

        switch (numOper) {
            case 0:
                res = first + second;
                System.out.print("Addition ");
                    break;
            case 1:
                res = first - second;
                System.out.print("Subtraction ");
                break;
        }
        System.out.println(res);
	}
}