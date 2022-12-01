package jdk19to12.switchexpression;

public class DemoSwitch {

    public static String getDayMessage(Day day){
        return switch(day){
            case SUNDAY, MONDAY, TUESDAY -> "Have a beautiful day";
            case WEDNESDAY, THURSDAY -> "Have a good day";
            case FRIDAY, SATURDAY -> "Have a party!!";
            default -> "No day ";
        };
    }

    public static String getDayMessageWithSwitchExpression(Day day){
        return switch(day){
            case SUNDAY, MONDAY, TUESDAY -> {
                yield "Have a beautiful day";
            }
            case WEDNESDAY, THURSDAY -> {
                yield "Have a good day";
            }
            case FRIDAY, SATURDAY -> {
                yield "Have a party!!";
            }
            default -> {
                throw new IllegalStateException("Invalid day: " + day);
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("Hello World here are some examples of switch Expression!!");
        System.out.println(getDayMessage(Day.FRIDAY));
        System.out.println(getDayMessageWithSwitchExpression(Day.MONDAY));
    }
}

enum Day{
    SUNDAY, MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}