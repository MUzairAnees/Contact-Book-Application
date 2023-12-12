public class Contact {      //this class can be accessed by other classes (ex. Main())

    //-----------Privately Accessed Fields------------//
    private String name;            //this field/variable(same thing) can only be accessed within this class
    private String phoneNumber;     //this field can only be accessed within this class
    private String email;           //this field can only be accessed within this class

    //------------Constructor------------//
    /*
    A constructor is a special "method" which serves as a "recipe" to creating an object;
    -It has the same name as the class.
    -It does not have a return type. You don't even specify void.
    -It is used to initialize a new object 
    */
    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //------------Getters and Setters------------//
    /*
    * Getters and Setters are public methods that can be accessed from other areas.
    * These methods, once called from the main or anywhere else, can access data of each object.
    * You typically write them as "getSomething" or "setSomething" (replace "...Something" with
    * whatever it is you're getting or setting (setName or getAge)).
    */

    //methods for getting and setting name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //methods for getting and setting phoneNumber
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //methods for getting and setting email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //-------------@Overriding the default toString method with our own toString method"-------------//
    /*
    * @Override is used to print out the string representation of the object. It is a STRING
    * representation of the object that we are making. When you print out an object that you
    * create maybe in "Main()" or anywhere else, without the @Override, it will print a jibberish
    * number value. When you @Override and invoke a toString() method with a set way of returning
    * the printed statement describing your specific object, it will print that instead of the
    * numbered jibberish.
    */

    @Override
    public String toString(){
        return "Contact -\n" +
                "Name: " + name + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email;
    }
}
