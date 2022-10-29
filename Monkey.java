public class Monkey extends RescueAnimal{

    // private for monkey class variables
    private String monkeyTailLength;
    private String monkeyHeight;
    private String monkeyBodyLength;
    private String monkeySpecies;

    // monkey constructor
    public Monkey(String animalType, String name, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, String monkeySpecies,
                  String monkeyTailLength, String monkeyHeight, String monkeyBodyLength) {

        // add constructor values from parent class rescue animal
        super(name, animalType, gender, age, weight, acquisitionDate,
            acquisitionCountry, trainingStatus, reserved,
            inServiceCountry);

        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setMonkeyTailLength(monkeyTailLength);
        setMonkeyHeight(monkeyHeight);
        setMonkeyBodyLength(monkeyBodyLength);
        setMonkeySpecies(monkeySpecies);


        // adds tail length value to monkey object
        this.monkeyTailLength = monkeyTailLength;

        // adds body length value to monkey object
        this.monkeyBodyLength = monkeyBodyLength;

        // adds height value to monkey object
        this.monkeyHeight = monkeyHeight;

        // adds monkey species to monkey object
        this.monkeySpecies = monkeySpecies;
    }

    // default monkey constructor
    public Monkey() {

        // call super constructor extended from rescue animal class
        super();

        // initialize private monkey variables
        monkeySpecies = null;
        monkeyTailLength = null;
        monkeyBodyLength =  null;
        monkeyHeight = null;
    }

    // method for retrieving monkey breed
    public String getMonkeySpecies() {
        return monkeySpecies;
    }

    // method for updating monkey breed
    private void setMonkeySpecies(String monkeySpecies) {
        this.monkeySpecies = monkeySpecies;
    }

    // method for retrieving monkey tail length
    public String getMonkeyTailLength() {
        return monkeyTailLength;
    }

    // method for updating monkey tail length
    public void setMonkeyTailLength(String monkeyTailLength) {
        this.monkeyTailLength = monkeyTailLength;
    }

    // method for retrieving monkey height
    public String getMonkeyHeight() {
        return monkeyHeight;
    }

    // method for updating monkey height
    public void setMonkeyHeight(String monkeyHeight) {
        this.monkeyHeight = monkeyHeight;
    }

    // method for retrieving monkey body length
    public String getMonkeyBodyLength() {
        return monkeyBodyLength;
    }

    // method for updating monkey body length
    public void setMonkeyBodyLength(String monkeyBodyLength) {
        this.monkeyBodyLength = monkeyBodyLength;
    }
}
