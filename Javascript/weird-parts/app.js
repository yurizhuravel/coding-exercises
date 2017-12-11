function b() {
  var myConst;
  console.log(myConst);
}

function a() {
  let myConst = 2;
  console.log(myConst);
  b();
}

const myConst = 1;
console.log(myConst);
a();

// if (a === undefined) {
//   console.log('a is undefined');
// } else {
//   console.log('a is defined');
// }