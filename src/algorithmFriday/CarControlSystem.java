package algorithmFriday;

import java.util.Scanner;

public class CarControlSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String command;

        boolean isStarted = false;
        while (true){
            command = scan.nextLine();

            if(command.equalsIgnoreCase("start")){

                if(isStarted){
                    System.out.println("The car is already started");
                    continue;
                }else {
                    isStarted = true;
                }

                System.out.println("The car has started");

            }else if(command.equalsIgnoreCase("stop")) {

                if (!isStarted) {
                    System.out.println("The car is already stopped");
                    continue;
                } else {
                    isStarted = false;
                }

                System.out.println("The car has stopped");

            }else if(command.equalsIgnoreCase("help")){

                System.out.println("""
                        press START: to start car
                         press STOP: to stop car
                         press QUIT: to quit program""");

            }else if(command.equalsIgnoreCase("quit")){
                break;

            }else System.out.println("I don't understand the command");

        }
    }
}
