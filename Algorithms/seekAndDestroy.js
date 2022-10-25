// You will be provided with an initial array (the first argument in the destroyer function), followed by one or more arguments. Remove all elements from the initial array that are of the same value as these arguments.

function destroyer(arr, ...removeVal) {
  console.log(arr);
  console.log(...removeVal);
  return arr.filter((elem) => !removeVal.includes(elem));
}

console.log(destroyer([1, 2, 3, 1, 2, 3], 2, 3));

/* Spread operator
const array = [1, 2, 3];
const obj = { ...array }; // { 0: 1, 1: 2, 2: 3 }
*/
