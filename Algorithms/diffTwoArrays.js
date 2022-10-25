// Compare two arrays and return a new array with any items only found in one of the two given arrays, but not both. In other words, return the symmetric difference of the two arrays.

function diffArray(arr1, arr2) {
  return arr1
    .concat(arr2)
    .filter((item) => !arr1.includes(item) || !arr2.includes(item));
}
console.log(diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]));

// .concat merges arr1 and arr2
// .filter then will create a shallow copy of the two and then will take the test passed into the () to produce the result of the test.
// (item) => !arr1.includes(item) || !arr2.includes(item) = will check for the unique item if it's included in arr1 and arr2