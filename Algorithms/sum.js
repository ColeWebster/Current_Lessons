function sumAll(arr) {
    let max = Math.max(arr[0], arr[1]);
    let min = Math.min(arr[0], arr[1]);
    let inBetween = 0;
    for (let i = min; i <= max; i++) {
      inBetween += i;
    }
    return inBetween;
  }
  
  console.log(sumAll([1, 4]));

/*   
We'll pass you an array of two numbers. Return the sum of those two numbers plus the sum of all the numbers between them. The lowest number will not always come first.
*/