## Classes: Constructors
- In order to create an object(an instance of a class), we need a constructor method.

- The constructor is defined within the class.

<pre><code>
public class Car {
    public Car() {

    }
    public static void main(String[] args) {

    }
} 
</code></pre>
- In this block the constructor, Car(), shares the same name as the class. 

- To create an instance, we need to call or invoke the constructo within main().

- THe following example assigns a Car instance to the variable ferrari:

<pre><code>
public class Car {
    public Car() {

    }
    public static void main(String[] args) {
        Car ferrari = new Car();
    }
}
</code></pre>

- In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type.
- This means that the value of our variable is a reference to an instaces memory address.
- During its declaration, the class name is used as the variables type, in this case, the type is Car.
- After the assignment operator, (=) we invoke the constructor method: Car(), and use the keyword new to indicate that we're creating an instance. Omitting new causes an error.
- If we were to output the value of ferrari, we would see its memory address: car@76ed5528

