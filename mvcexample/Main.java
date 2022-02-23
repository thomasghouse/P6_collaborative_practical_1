package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {

    public static void main(String args[]) {

        Model model = new Model();               // Create shared database
        Controller1 c1a = new Controller1(model, "Controller1 A", 40, 40); // Create first controller A
        Controller1 c1b = new Controller1(model, "Controller1 B", 400, 40); // Create first controller B
        Controller1 c1c = new Controller1(model, "Controller1 C", 760, 40); // Create first controller C
        Controller2 c2a = new Controller2(model, "Controller2 A", 40, 200); // Create second controller A
        Controller2 c2b = new Controller2(model, "Controller2 B", 400, 200); // Create second controller B
        Controller2 c2c = new Controller2(model, "Controller2 C", 760, 200); // Create second controller C

    } // main

} // Main
