import java.util.*;

public class Driver {

    // create dog array list
    private static ArrayList<Dog> dogList = new ArrayList<>();

    // create monkey array list
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();

    // main method of driver class
    public static void main(String[] args) {

        // initialize monkey array list objects
        initializeMonkeyList();

        // initialize dog array list objects
        initializeDogList();

        // prompt user with the display menu
        displayMenu();

        // declare new scanner object
        Scanner scnr = new Scanner(System.in);

        // initialize user input variable
        String userChoice;

        // loop to take and prompt user menu options and input until false
        while (true)  {

            // define variable as next user input
            userChoice = scnr.next();

            // handles user menu input branches
            switch (userChoice) {

                // when user inputs the number "1" call dog intake method
                case "1" -> intakeNewDog(scnr);

                // when user inputs the number "2" call new monkey intake method
                case "2" -> intakeNewMonkey(scnr);

                // when user inputs the number "3" call reserve animals method
                case "3" -> reserveAnimal(scnr);

                // when user inputs the number "4" print all dogs on dog list method
                case "4" -> printAllDogs();

                // when user inputs the number "5" call print all monkeys on monkey list method
                case "5" -> printAllMonkeys();

                // when user inputs the number "6" call print all available animals method
                case "6" -> printAnimals();

                // case when user inputs the letter "q"
                case "q" -> {

                    // prompt user with exit message
                    System.out.println("Have a nice day!");

                    // end the program
                    System.exit(0);
                }

                // executed branch if no handled case character provided
                default -> {

                    // prompt user with error message for unrecognized input entry
                    System.out.println("""


                            Invalid entry.
                            Please enter only a single menu key option.
                            Thank You.""");

                    // prompt user with menu options
                    displayMenu();
                }
            }
        }
    }

    // method to print out all dog object attribute information
    public static void printAllDogs() {

        // loop for each dog object in dog array list
        for (Dog dog : dogList) {

            // prompt user with list of dog object attributes
            System.out.println("\nAnimal Type: " + dog.getAnimalType() + "\nName: " + dog.getName()
                    + "\nDog Breed: " + dog.getBreed()
                    + "\nGender: " + dog.getGender()
                    + "\nAge: " + dog.getAge() + "\nWeight: " + dog.getWeight()
                    + "\nAcquisition Date: " + dog.getAcquisitionDate()
                    + "\nAcquisition Country: " + dog.getAcquisitionLocation()
                    + "\nReservation Status: " + dog.getReserved() + "\nTraining Status: "
                    + dog.getTrainingStatus() + "\nService country: " + dog.getInServiceLocation());
        }

        // prompt user with display menu options
        displayMenu();
    }

    // method to print all monkey objects with their corresponding attributes
    public static void printAllMonkeys() {

        // loop for each monkey object on monkey array list
        for (Monkey monkey : monkeyList) {

            // prompt user with list of monkey object attribute information
            System.out.println("\nAnimal Type: " + monkey.getAnimalType() + "\nName: " + monkey.getName() + "\nGender: " + monkey.getGender()
                    + "\nAge: " + monkey.getAge() + "\nWeight: " + monkey.getWeight()
                    + "\nMonkey Species: " + monkey.getMonkeySpecies() + "\nTail Length: " + monkey.getMonkeyTailLength()
                    + "\nHeight: " + monkey.getMonkeyHeight() + "\nBody Length: " + monkey.getMonkeyBodyLength()
                    + "\nAcquisition Date: " + monkey.getAcquisitionDate()
                    + "\nAcquisition Country: " + monkey.getAcquisitionLocation()
                    + "\nReservation Status: " + monkey.getReserved() + "\nTraining Status: "
                    + monkey.getTrainingStatus() + "\nService country: " + monkey.getInServiceLocation() + "\n");
        }

        // prompt user with menu options
        displayMenu();
    }

    // print all available for reservation animals method
    public static void printAnimals() {

        // check each dog in dog array list
        for(Dog dog: dogList) {

            // check if dog object training status is in service
            if(dog.getTrainingStatus().equalsIgnoreCase("in service") && (!dog.getReserved())) {

                // prompt user with dog object information
                System.out.println("\nDog " + "\n" + "Name: " + dog.getName() + "\nReserved: " + dog.getReserved()
                        + "\nTraining Status: " + dog.getTrainingStatus() +
                        "\nService country: " + dog.getInServiceLocation());
                }
        }

        // check each monkey on monkey array list
        for(Monkey monkey : monkeyList) {

            // check if dog object training status is in service
            if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && (! monkey.getReserved())) {

                // prompt user with monkey object information
                System.out.println("\nMonkey " + "\n" + "Name: " + monkey.getName() + "\nReserved: "
                        + monkey.getReserved() + "\nTraining Status: " + monkey.getTrainingStatus()
                        + "\nService country: " + monkey.getInServiceLocation());
            }
        }

        // prompt user with menu options
        displayMenu();
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals available for reservation");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // adds dog objects to array list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Dog","Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019",
                "United States", "in service", false, "Canada");
        Dog dog2 = new Dog("Dog","Rex", "Great Dane", "male", "3", "35.2", "02-03-2020",
                "Mexico", "Phase I", true, "United States");
        Dog dog3 = new Dog("Dog","Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019",
                "Canada", "in service", false, "Canada");

        // add dogs to dog list array
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // adds monkey objects to array list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Monkey", "Bobo", "male", "8",
                "44.3", "09-22-2012", "United States",
                "in service",false, "United States",
                "Marmoset","15","2","51");
        Monkey monkey2 = new Monkey("Monkey", "Pongo", "female","4",
                "50.1", "12-24-2021", "Uganda", "in service",
                true, "Canada", "Capuchin","25",
                "1", "60");
        Monkey monkey3 = new Monkey("Monkey", "Cudo", "female","6",
                "75.4", "11-24-2021", "Brazil", "in service",
                false, "United States", "Guenon","15",
                "3", "41");

        // add monkeys to monkey list array
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // new dog intake method
    public static void intakeNewDog(Scanner scanner) {

        // prompt user for dog's name
        System.out.println("What is the dog's name?");

        // compensate for additional empty line read
        scanner.nextLine();

        // store user dog name input
        String name = scanner.nextLine();

        // check each dog object on dog array list
        for (Dog dog : dogList) {

            // check if dog name input is already on dog array list
            if (dog.getName().equalsIgnoreCase(name)) {

                // prompt user that dog name input already in dog object collection
                System.out.println("\nThe dog name" + name + " is already in our system\n");

                // re-prompt user with menu options
                displayMenu();

                // exit from continuing method
                return;
            }
        }

        // prompt user for dog breed
        System.out.println("What is " + name + "'s dog breed?");

        // store user breed input
        String breed = scanner.nextLine();

        // prompt user for dog gender input
        System.out.println("What is " + name + "'s gender?");

        // store dog gender input
        String gender = scanner.nextLine();

        // prompt user for dog age input
        System.out.println("What is " + name + "'s age?");

        // store user dog age input
        String age = scanner.nextLine();

        // prompt user for dog weight input
        System.out.println("What is " + name + "'s total weight to the nearest pound?");

        // store dog weight input
        String weight = scanner.nextLine();

        // prompt user for dog's acquisition date input
        System.out.println("What is " + name + "'s acquisition date?");

        // store acquisition date input
        String acquisitionDate = scanner.nextLine();

        // prompt user for dog's acquisition country input
        System.out.println("What is " + name + "'s acquisition country?");

        // store acquisition country input
        String acquisitionCountry = scanner.nextLine();

        // prompt user for dog's training status input
        System.out.println("What is " + name + "'s training status? \nEnter only: Phase 1, Phase 2, " +
                            "Phase 3, Phase 4, Phase 5, in service, or farm");

        // store dog training status input
        String trainingStatus = scanner.nextLine();

        // prompt user for dog's reservation status input
        System.out.println("Is " + name + " already reserved? \nEnter Only: TRUE for yes or FALSE for no");

        // store reservation status input
        boolean reserved = scanner.nextBoolean();

        // prompt user for dog's service country
        System.out.println("What is " + name + "'s service country?");

        // compensate for additional empty line read
        scanner.nextLine();

        // store service country input
        String inServiceCountry = scanner.nextLine();

        // new dog input object constructor
        Dog dog = new Dog("Dog", name, breed, gender, age,
                weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry);

        // add new dog object to dog array list
        dogList.add(dog);

        // prompt user with completed registration message and select new menu option
        System.out.println("\n" + name + "'s registration is now complete. \n\nYou may now select another menu option.");

        // prompt user with menu options
        displayMenu();
    }

    // create new monkey object method
    public static void intakeNewMonkey(Scanner scanner) {

        // prompt user for monkey name
        System.out.println("What is the monkey's name?");

        // compensate for additional empty line read
        scanner.nextLine();

        // store monkey name input
        String name = scanner.nextLine();

        // check each monkey object on monkey array list
        for (Monkey monkey : monkeyList) {

            // check if monkey name input is already on monkey array list
            if (monkey.getName().equalsIgnoreCase(name)) {

                // prompt user that monkey name input already in monkey object collection
                System.out.println("\nThe monkey name " + name + " is already in our system.");

                // prompt user with menu options
                displayMenu();

                // exit from continuing method
                return;
            }
        }

        // prompt user for gender input
        System.out.println("What is " + name + "'s gender?");

        // store user monkey gender input
        String gender = scanner.nextLine();

        // prompt user for monkey age
        System.out.println("What is " + name + "'s age?");

        // store monkey age input
        String age = scanner.nextLine();

        // take monkey weight input
        System.out.println("What is " + name + "'s total weight to the nearest pound?");

        // store user monkey weight input
        String weight = scanner.nextLine();

        // prompt user for date of monkey acquisition
        System.out.println("What is " + name + "'s acquisition date?");

        // store user acquisition date input
        String acquisitionDate = scanner.nextLine();

        // prompt user for monkey acquisition country
        System.out.println("What is " + name + "'s acquisition country?");

        // store monkey acquisition country
        String acquisitionCountry = scanner.nextLine();

        // prompt user for monkey training status input
        System.out.println("What is " + name + "'s training status? \nEnter only: Phase 1, Phase 2, " +
                    "Phase 3, Phase 4, Phase 5, in service, or farm");

        // store user input training status
        String trainingStatus = scanner.nextLine();

        // prompt user for monkey reservation status
        System.out.println("Is " + name + " already reserved? \nEnter TRUE for yes or FALSE for no");

        // store reservation status input
        boolean reserved = scanner.nextBoolean();

        // prompt user for in service country input
        System.out.println("What is " + name + "'s service country?");

        // compensate for additional line input
        scanner.nextLine();

        // store service country input
        String inServiceCountry = scanner.nextLine();

        // declare monkey species variable inside scope of method
        String monkeySpecies;

        // loop till found false
        while (true) {

            // prompt user with monkey species input options
            System.out.println("What is " + name + "'s species? \nChoose Only: Capuchin, Guenon, " +
                    "Macaque, Marmoset, Squirrel Monkey, or Tamarin");

            // store user monkey species input
            monkeySpecies = scanner.nextLine();

            // check if user input is an invalid monkey species selection
            if (!(monkeySpecies.equalsIgnoreCase("Capuchin")) && !(monkeySpecies.equalsIgnoreCase("Guenon"))
                    && !(monkeySpecies.equalsIgnoreCase("Macaque")) && !(monkeySpecies.equalsIgnoreCase("Marmoset"))
                    && !(monkeySpecies.equalsIgnoreCase("Squirrel Monkey")) && !(monkeySpecies.equalsIgnoreCase("Tamarin"))) {

                // prompt user with invalid monkey species input error message
                System.out.println("Invalid monkey species.");
            }

            // branch if monkey species input is valid
            else {

                // exit the monkey species loop
                break;
            }
        }

        // prompt user for monkey tail length input
        System.out.println("What is " + name + "'s tail length to the nearest inch?");

        // store user monkey tail length input
        String monkeyTailLength = scanner.nextLine();

        // prompt user for monkey height input
        System.out.println("What is " + name + "'s height to the nearest inch?");

        // store user monkey height input
        String height = scanner.nextLine();

        // prompt user for monkey body length input
        System.out.println("What is " + name + "'s body length to the nearest inch?");

        // store monkey body length input
        String monkeyBodyLength = scanner.nextLine();

        // user input monkey constructor
        Monkey monkey = new Monkey("Monkey", name, gender, age,
                weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry, monkeySpecies, monkeyTailLength, height,
                monkeyBodyLength);

        // add monkey to array list
        monkeyList.add(monkey);

        // prompt user with completed registration and select new menu option message
        System.out.println("\n" + name + "'s registration is now complete. \n\nYou may now select another menu option.");

        // prompt user with menu options
        displayMenu();
    }

    // method for reserving animals
    public static void reserveAnimal(Scanner scanner) {

        // prompt user for animal type to reserve
        System.out.println("What type of animal would you like to reserve? Enter Only Dog or Monkey");

        // compensate for additional read line
        scanner.nextLine();

        // store user input animal type
        String listType = scanner.nextLine();

        // prompt user for service country reservation
        System.out.println("What country would you like to reserve this animal?");

        // store service country user input
        String inServiceCountry = scanner.nextLine();

        // if animal type is a dog
        if (listType.equalsIgnoreCase("Dog")) {

            // loop through each dog on dog list array
            for (Dog dog : dogList) {

                // check if dog has matching service location and available reservation status
                if ((dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) && (!dog.getReserved())) {

                    // update dog reservation status to reserved
                    dog.setReserved(true);

                    // prompt user with reservation complete message
                    System.out.println("\n" + dog.getName() + " has now been reserved for service in " + dog.getInServiceLocation());

                    // prompt user with menu options
                    displayMenu();

                    // exit method
                    break;
                }

                // branch taken if user provides non-matching service country input
                else {

                    // prompt user with message if user input does not match any handled criteria
                    System.out.println("\nNo reservations are available for the provided input.");

                    // prompt user with menu options
                    displayMenu();
                }
            }
        }

        // if user input animal type is monkey
        else if (listType.equalsIgnoreCase("Monkey")) {

            // for each monkey in monkey array list
            for (Monkey monkey : monkeyList) {

                // check if monkey has matching service location and available reservation status
                if ((monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) && (!monkey.getReserved())) {

                    // update monkey reservation status to reserved
                    monkey.setReserved(true);

                    // prompt user with reservation complete message
                    System.out.println("\n" + monkey.getName() + " has now been reserved for service in " + monkey.getInServiceLocation());

                    // prompt user with menu options
                    displayMenu();

                    // exit method
                    break;
                }

                // branch taken if user provides non-matching service country input
                else {

                // prompt user with message if user input does not match any handled criteria
                System.out.println("\nNo reservations are available for the provided input.");

                // prompt user with menu options
                displayMenu();
                }
            }
        }

        // branch if animal type input is neither dog or monkey
        else {

            // prompt user with message if user input does not match any handled criteria
            System.out.println("\nNo reservations are available for the provided input.");

            // prompt user with menu options
            displayMenu();
        }
    }
}
