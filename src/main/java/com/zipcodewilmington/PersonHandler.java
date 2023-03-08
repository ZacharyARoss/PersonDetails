package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        int counter = 0;// create a `counter`
        while (counter < personArray.length) {
            // while `counter` is less than length of array
            // begin loop
           // Person currentPerson = personArray[counter];
            // use `counter` to identify the `current Person` in the array
           // String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            //result.append(stringRepresentation);// append `stringRepresentation` to `result` variable
            //my notes
            // could short but by taking personArray[counter] adding .toString() and append
            //reuslt would be result.append(personArray[counter]); skipping Person currentPerson and stringRepresentation
            personArray[counter].toString();
            result.append(personArray[counter]);
            counter++;


        }
            // end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].toString();
                    result.append(personArray[i]);
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        for (Person currentPerson : personArray) {
            result.append(currentPerson.toString());
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
