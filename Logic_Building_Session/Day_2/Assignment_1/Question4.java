class Greetings{
    public static void main(String[] args) {
        int time=6;
        String meridiem="AM";

        if (time>=5 && time<12 && "AM".equals(meridiem)){
            System.out.println("Good Morning");
        }
    }
}