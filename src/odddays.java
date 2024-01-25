public class odddays {
    public static void main(String[] args) {
        int DayInAugust = 31;
        int count = 0;
        System.out.println("The of odd days can pavan go in the month of august ");
        for (int day = 1; day < 31 ; day =day + 2 ) {
            count++;
            System.out.println("days " + day);
        }
        System.out.println("Total days can pavan go out on odd days in august: " + count);
    }
}
