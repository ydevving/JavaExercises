package Day26;

import Day26.DOOR_STATE;

import java.util.Scanner;

public class Door {
    private DOOR_STATE state = DOOR_STATE.LOCKED;
    private int passcode;

    public Door(int passcode) {
        this.passcode = passcode;
    }

    public boolean unlock(int passcode) {
        if (!(this.state == DOOR_STATE.LOCKED) || passcode != this.passcode)
            return false;

        this.state = DOOR_STATE.CLOSED;

        return true;
    }

    public boolean lock() {
        if (!(this.state == DOOR_STATE.CLOSED))
            return false;

        this.state = DOOR_STATE.LOCKED;

        return true;
    }

    public boolean close() {
        if (!(this.state == DOOR_STATE.OPEN))
            return false;

        this.state = DOOR_STATE.CLOSED;

        return true;
    }

    public boolean open() {
        if (!(this.state == DOOR_STATE.CLOSED))
            return false;

        this.state = DOOR_STATE.OPEN;

        return true;
    }

    public boolean change_code(int current_passcode, int new_passcode) {
        if (!(this.passcode == current_passcode))
            return false;

        this.passcode = new_passcode;

        return true;
    }

    public DOOR_STATE get_state() {
        return this.state;
    }

    public static void body() {
        Scanner sc = new Scanner(System.in);

        Door door = new Door(1234);

        boolean finished = false;
        while (!finished) {
            System.out.println("Current state: " + door.get_state() + "\n");
            System.out.println("Choose an option:\n");
            System.out.println("1. Open\n2. Close\n3. Lock\n4. Unlock\n5. Exit Program\n");
            System.out.println("Enter option:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    door.open();
                    break;
                case 2:
                    door.close();
                    break;
                case 3:
                    door.lock();
                    break;
                case 4:
                    if (!(door.get_state() == DOOR_STATE.LOCKED))
                        break;

                    System.out.println("Enter passcode croski!");
                    int entered_passcode = sc.nextInt();

                    if (entered_passcode < 0) {
                        System.out.println("Entered wrong type of passcode!");
                        break;
                    }

                    door.unlock(entered_passcode);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    finished = true;
            }
        }
    }
}
