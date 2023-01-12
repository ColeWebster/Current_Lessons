class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(i);
    }
  }
}
