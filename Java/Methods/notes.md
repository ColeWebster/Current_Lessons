# Methods

<strong>Method</strong>: is a task that an object of a class performs.

We mark the domain of this task using curly braces { }.

Everything inside the curly braces is part of the task.

This domain is called the scope of a method.

We can access vaiables that are declard inside a method in code that is outside the scope of that method.

```
class Car {
    String color;
    int milesDriven;

    public Car(String carColor) {
        color = carColor;
        milesDriven = 0;
    }

    public void drive() {
        String message = "Miles driven: " + milesDriven;
        System.out.println(message);
    }

    public static void main (String[] args){
        Car myFastCar = new Car("red");
        myFastCar.drive();
    }
}
```

The variable message, which is declard and initalized inside of drive, cannot be used inside of main()!

It only exists within the scope of the drive() method.

However, milesDriven, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class.

## Adding Parameters
We saw how a method's scope prevents us from using vaiables declard in one method in another method. What if we had some information in one method that we needed to pass into another method?

Similar to how we added parameters to constructors, we can customize all other methods to accept parameters. For example, in the following code, we carea a startRadio() method that accepts a Double parameter, stationNum and a String parameter called stationName:
```
class Car {
    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public void startRadio(double stationNum, String stationName)
}