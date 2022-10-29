public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String animalType, String name, String breed, String gender, String age,
               String weight, String acquisitionDate, String acquisitionCountry,
               String trainingStatus, boolean reserved, String inServiceCountry) {

        // add constructor values from parent class rescue animal
        super(name, animalType, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved,
                inServiceCountry);

        // add values from parent class rescue animal
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    public Dog() {
        super();
        breed = null;
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String breed) {
        this.breed = breed;
    }

}
