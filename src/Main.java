import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String lastName;
        String input;
        int counter = 1;
        String relationship;
        Scanner key = new Scanner(System.in);

//        String userInput = key.nextLine();

        ArrayList<Person> person1 = new ArrayList<>();
        ArrayList<Sibling> sibling1 = new ArrayList<>();


        Person person = new Person();
        System.out.println("Enter the name of a person: ");
        name = key.nextLine();
        person.setName(name);

        System.out.println("Enter the last name of the person: ");
        lastName = key.nextLine();
        person.setLastName(lastName);

        while (true){
            Sibling sibling = new Sibling();
            System.out.println("Add a sibling: " + counter);

            name = key.nextLine();
            sibling.setName(name);


            System.out.println("Is the sibling a brother or sister? " + counter);
            relationship = key.nextLine();
            sibling.setRelationship(relationship);


            sibling1.add(sibling);

            System.out.println("If you want to add another sibling, type any key, other wise type none");
            input = key.nextLine();
            if (input.equalsIgnoreCase("none")) {
                System.out.println("Thanks for adding this sibling");
                break;

            }
                counter = counter + 1;
        }


        person.displaytext();
        System.out.println(" ");
        counter =1;
        for(Sibling sibling : sibling1){
            System.out.println("Sibling " + counter);
            sibling.displaytext1();

            counter = counter + 1;

        }
    }

}

// while(true){
//        System.out.println("Please enter your name: ");
//        name.add(scanner.next());
//        System.out.println("Please enter your number: ");
//        phone.add(scanner.nextInt());
//
//        System.out.println("Do you want to add a directory yes/no?");
//        String answer = scanner.next();
//
//        if (answer.equals("no")){
//        System.out.println("Thanks for adding to the directory");
//        System.out.println(answer());
//        break; //
//        }
//
//        }