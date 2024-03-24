// console.log("hello azhar welcome to javascript");
// console.log("i love javaScript");
// alert("hello danger ahead");
// name= "syed azhar";
// age=20;
// rollno=101;
// marks=450;
// console.log(name,age,rollno,marks);
// let a =10;
// let b =20;
// console.log("sum = :",a + b);

// let a1 =10;
// let b1 =20;
// console.log("substration = :",a - b);

// /* new code. java script is used for validation purpose and it is used at client side or browser side */
// // declaration
// let name1 = "syed_azhar";
// var age = 20;
// const phnum= 8790416521;
// document.writeln(name1);
// document.writeln(age);
// document.writeln(phnum);
// /* is used for popup messages in browseer*/
// alert("welcome to javascript examples");
// document.writeln("javascript by ratan sir");
// console.log("javascript by ratan sir");

// // here it will take the inpute value as string ex:10+20 input and output is 1020
// let num1=prompt("Enter first Number");
// let num2=prompt("Enter second Number");
// let result= num1+num2;
// alert("addition of two numbers is "+result);

// // here converting string into integer or float

// let num3=parseInt(prompt("Enter first Number"));
// let num4=parseInt(prompt("Enter second Number"));
// let result1= num3+num4;
// alert("addition of two numbers is "+result1);

// // floating
// let num5=parseFloat(prompt("Enter first Number"));
// let num6=parseFloat(prompt("Enter second Number"));
// let result2= num5+num6;
// alert("addition of two numbers is "+result2);

// // script code using if else statements find the biggest number

// let num7=parseInt(prompt("Enter first Number"));
// let num8=parseInt(prompt("Enter second Number"));
// if(num7>num8){
//     alert(num7+" is greater than :"+num8);
// }else{
//     alert(num8+" is greater than :"+num7);
// }

// positive and negative number using if else statement

// let num9=parseInt(prompt("Enter first Number"));
// if(num9>=0){
//     alert(num9+"number is positive number");
// }else{
//     alert(num9+"number is negative number");
// }

// check user name and password

// let name = prompt("enter your name");
// let password = prompt("enter your password");
// if(name==="syed_azhar"&& password==="4321"){
//     alert("Login Successful");
// }else{
//     alert("Login failed please try again later");
// }

// type of function to check the data use typeof() function
// example

// let username="azhar";
// let age =20;
// let height =5.7;
// let isRaining=true;
// const dob="15-03-2003";
// const mobile = 8790416521;
// const aadhar = 959536451346n;
// var company;
// // goto webpage right click select inspect goto console and check the typeof variable
// console.log("username"+username+"type is"+typeof(username));
// console.log("age"+age+"type is"+typeof(age));
// console.log("height"+height+"type is"+typeof(height));
// console.log("isRaining"+isRaining+"type is"+typeof(isRaining));
// console.log("dob"+dob+"type is"+typeof(dob));
// console.log("mobile"+mobile+"type is"+typeof(mobile));
// console.log("aadhar"+aadhar+"type is"+typeof(aadhar));
// console.log("company"+company+"type is"+typeof(company));

// another way expression syntax check the console in browser
// console.log(`age ${age} type is ${typeof(age)}`);

// assignment 1: write a program to print 1 to 100 numbers but for multiple of 3 or num divided by 3 =0 then print "fizz"
// insted of the number ,and for multiple of 5 or num divided by 5 =0 then print "buzz" for numbers that multiple of both 
// 3 and 5 print "fizzbuzz"?

// let num11=parseInt(prompt("Enter first Number"));
// let num12=parseInt(prompt("Enter second Number"));

// for(i=num11;i<=num12;i++){
//     if(i%3===0){
//         document.writeln("fizz");
//         document.write("<br>");
//     }else if(i%5===0){
//         document.write("buzz");
//     }else if(i%3===0 && i%5===0){
//         document.writeln("fizzbuzz");
//         document.write("<br>");
//     }else{
//         document.writeln(i);
//     }
// }

// assignment 1: ratan and anu are trying to compare their  BMI  (BODY MASS INDEX),
// WHICH IS CALCULATED USING THE FOLLOWING FORMULA :BMI =MAS/(HEIGHT*HEIGHT)
//1.STORE RATAN AND ANU MASS AND HEIGHT IN VARIABLES CALLED MASSRATAN HEIGHTRATAN MASSANU HEIGHTANU.
// CALCULATE BOTH THEIR BMIS USING THE FORMULA, AND STORE THE RESULT IN THE VARIABLES CALLED BMISRATAN AND BMISANU.
//LOG THE VALUE OF BMIRATAN AND BMIVALUE  TO THE CONSOLE.
// WRITE THE VALUE OF BMIRATAN  AND BMIANU TO THE BROWSER DOCUMENT.WRITE
// CREATE BOOLEAN VARIABLE RATANHEIGHTBMI CONTAINING THE INFORMATION ABOUT WHETHER RATAN HAS A HEIGER BMI THAN ANU.LOG IT TO THE
//CONSOLE TOO AND PRINT IN BROWSER. 

    // let rmass = parseInt(prompt("enter your body mass index or weight"));
    // let rheight = parseInt(prompt("enter your height"));
    // let amass = parseInt(prompt("enter your body mass index or weight"));
    // let aheight = parseInt(prompt("enter your height"));

    // let rbmi = rmass/(rheight*rheight);
    // var result = rbmi;
    // let abmi = amass/(aheight*aheight);
    // var result1 = abmi;

    // console.log("ratan bmi calculation is :"+result);
    // console.log("anu bmi calculation is :"+result1);

    // document.write("ratan bmi calculation result is :"+result);
    // document.write("<br>");
    // document.write("anu bmi calculation result  is :"+result1);

    // if(result>result1){
    //    console.log(true);
    // }else{
    //     console.log(false);
    // }

    // if(result>result1){
    //     document.write("<br>");
    //    document.write(true);

    //  }else{
    //     document.write("<br>");
    //     document.write(false);
    //  }

    // for(i=0;i<5;i++){
    //     for(j=0;j<=i;j++){
    //         document.write("*");
    //     }
    //     document.write("<br>");
    // }

    // object 

//     const studennt={
//         name:'azhar',
//          age:20,
//          qualification:"bcom computer applications",
//          isPassed:true,
//          grade:'A+'
//     };

//    console.log(studennt);

// take the day from end user 
// let day = prompt("enter the day");

// switch(day){
//     case "monday" :
//     document.writeln("monday are bad");
//     break;

//     case "tuesday" :
//     case "wednesday" :
//     case "thrusday" :
//     document.writeln("mid days are bad");
//     break;

//     case "monday" :
//     document.writeln("monday are ok ok ");
//     break;

//     case "friday" :
//     document.writeln("friday are better");
//     break;

//     case "saturday" :
//     case "sunday" :
//     document.writeln("weekends  are party day's");
//     break;
// }

// javascript functions 
// functions are used to write the logics

// examples of simple functions

// function add(num1,num2){
//     let res;
//     res=num1+num2;
//     document.write("addition of two numbers is :"+res+"<br>");
// }
// add(100,200);

// function greet(){
//     document.writeln("good morning sathya"+"<br>");
// }
// greet();

// function billcalc(name , price,qnty){

//     let totalbill;
//     totalbill=price*qnty;
//    return totalbill;
// }
// let bill=billcalc("sugar",100,1.2);
// document.writeln("your total bill is "+bill+"<br>");

// function dummy(){

// }

// let dum = dummy();
// document.write("value is "+dum)

// function with default values

// function add(num1=10,num2=20){
    // default values are 10and 20 // while calling method we have invocked new values so the output will be of new values
    // let res;
//     res=num1+num2;
//     document.write("addition of two numbers is :"+res+"<br>");
// }
// add();
// add(100,200);

//anonymous function means the function without name
// declaration 
// let code=function(num1, num2){
//     return num1+num2;
// }
// console.log(code(10,20));// calling function

// lambda expression or arrow function this will reduce the line of code and improve the code readability
//syntax (argument)=>expression
// arrow function can take number of arguments

// let res =(num1,num2)=>{return num1+num2};
// console.log(res(10,20));

// let sum=(a,b)=>a+b;
// console.log(sum(10,40));

// let square=num1=>num1*num1;
// console.log(square(10));

// recursion function
// the function calling it self is called recursion function

// function factorial(n){
//     if(n===0||n===1){
//         return 1;
//     }else{
//         return n*factorial(n-1);
//     }
// }
// console.log(factorial(5));

// function converToFahrenheit(){
//     // read the Fahrenheit and store into variable
//     const Fahrenheit=document.getElementById("Fahrenheit").value;
//     // convert the Fahrenheit to celcius
//     const celcius=(parseInt(Fahrenheit)-32)*5/9;
//     // set the out put to celcius field
//     document.getElementById("celcius").value=celcius.toFixed(2);
// }

//Assignment 1 convert dollar to INR

// function convertToInr(){// html form method
//         // read the dollar and store into variable
//         const Dollar=document.getElementById("dollar").value;
//         // convert the dollar to INR
//         const INR=(parseFloat(Dollar))*82.91;
//         // set the out put to celcius field
//         document.getElementById("INR").value=INR.toFixed(2);
//     }

// ASSIGNMENT 2 STRING TO REVERSE STRING

// function convertToReverseStr(){// html form method
//             // read the string and store into variable
//             const s=document.getElementById("string").value;
//             // convert the string to in reverse order
//              const s1=s.split('').reverse().join('');
//             // set the out put to revstring field
//             document.getElementById("reverstring").value=s1;
//         }

// Assignment one function calling another function
 
// function cutFruitPieces(fruit){
//     function fruitProcesses(apples, oranges){
           
//     }

// }

// assignment fruitprocessor function taking the two arguments(apples,oranges)return the message "juice prepareing with"
// 8 apples and 6 oranges
    
// function fruitProcessor (oranges,apples){
    
//     return "juice prepareing with "+oranges +" oranges "+" and " +apples+" apples ";

// }
// document.write(fruitProcessor(8,6));

// assignment there are two teams :dolphins and koalas. they completed against each other 3 tiers. the winner with the heighest average 
//score wins a trophy! 1. calculate the average score for each team using the test data located below the average score for dolphins should be
// assigned to the scoredolphins variable and the average score for koalas should be assigned to scorekolas variable
//2.compare the teams average scores to determine the winner of the compitition and the average must be >=100 and print the console:
//"dolphins win the trophy" if dolphins win, or "koalas win the trophy" if koalas win, or "both win the trophy if there average scores are erquals"
//test data:dolphins scored 96,108,and 89.koalas scored 88,91,and 118.

// function test(){
//     let mathes =parseInt(prompt("enter the matches played against each other"));
//     let dolphins = parseInt(prompt("enter the scores of dolphins"));
//     let dolphins1 =parseInt( prompt("enter the scores of dolphins"));
//     let dolphins2 =parseInt( prompt("enter the scores of dolphins"));

//     let koalas =parseInt( prompt("enter the scores of koalas"));
//     let koalas1 = parseInt(prompt("enter the scores of koalas"));
//     let koalas2 = parseInt(prompt("enter the scores of koalas"));

//     let dolphinsscr = dolphins+dolphins1+dolphins2;
//     let dolphinsavg =dolphinsscr/3;
//     let koalasscr =koalas+koalas1+koalas2;
//     let koalasavg =koalasscr/3;

//     if(dolphinsavg>koalasavg && dolphinsscr>=100 ){
//         document.writeln("dolphins won the trophy and total average  is :"+dolphinsavg+" scored "+dolphinsscr);
//     }else if(koalasavg>dolphinsavg && koalasscr>=100){
//         document.writeln("koalas won the trophy and total average  is :"+koalasavg+" scored "+koalasscr);
//     }else{
//         document.writeln("koalas scores in three mathes :"+koalas+" "+koalas1+" "+koalas2);
//         document.writeln("dolphins scores in three mathes :"+dolphins+" "+dolphins1+" "+dolphins2);
//     }
// }
// test();

// assignment palindeom or not string and number

function palindrome(){
    const palindeomornot =document.getElementById("string").value; 
    let p1=palindeomornot;
    let p2=p1.split('').reverse().join('');
    if(p2==palindeomornot){
    document.getElementById("palindrome").value="palindrome"; 
}else if(p2!==palindeomornot){
    document.getElementById("palindrome").value="not palindrome"; 
}else{
    document.getElementById("palindrome").value=" "; 
}
}

// javascript ternary operators
let age =12;
let category = (age<18)?"child" : "adult";
console.log(category);

let age1 =25;
let category1 = (age1<18)?"water" : "wine";
console.log(category1);

// type conversion converting one data type to another data type

// functions used to convert
// 1.Number() 2.parseInt() 3.parseFloat() 4.toString() 5.string()

// string to number
 
let num1=Number("42");
let num2=Number("3.14");
let num3=Number("3.12 is fun");
console.log(num1);
console.log(num2);
console.log(num3);

// parseInt
let num4=parseInt("42");
let num5=parseInt("3.14");
let num6=parseInt("3.12 is fun");
console.log(num4);
console.log(num5);
console.log(num6);

// parsefloat
let num7=parseFloat("42");
let num8=parseFloat("3.14");
let num9=parseFloat("3.12 is fun");
console.log(num7);
console.log(num8);
console.log(num9);

// note if the convertion is not possible we will get nan not a number data

//convertion of number to string

let num10 = 42;
let num11 = 45;
console.log(num10+num11);
// using string constructure
let n10 = String(num10);
let n11 = String(num11);
console.log(n10+n11);
// using tostring function
let n12 =num10.toString();
let n13 =num11.toString();
console.log(n12+n13);
// note both string() and tostring are used for conversion of a number to a string but string() is a constructor that can be used independently while
// tostring() is a meathod that needs to be called on a number object.

// to convert any data to boolean fromat use boolean() constructor

let data1=Boolean("hello");
let data2=Boolean(" ");
let data3=Boolean(100);
let data4=Boolean(10.0);
let data5=Boolean(0);
let data6=Boolean(1);
let data7=Boolean("true");
let data8=Boolean("false");
let data9=Boolean(NaN);
let data10=Boolean(undefined);
console.log(data1);
console.log(data2);
console.log(data3);
console.log(data4);
console.log(data5);
console.log(data6);
console.log(data7);
console.log(data8);
console.log(data9);
console.log(data10);

// equal = double equals == triple equals 
//1. = is used to assign the data ex:let age=25 2. == is used for normal comparision ex:"5" ==5 return true 
//3. === is used for strict comparision ex:"5"===e return false

let num=5;
let num0="5";
if(num==num0){
    console.log("num is equal to num0");
}else{
    console.log("num is not equal to num0");
}

// logical operators AND (&) OR (||)

let isSunny = true;
let isWorm = false;
if(isSunny && isWorm){
    console.log("it's sunny and worm!");
}else{
    console.log("it's either sunny or not worm!");
}

let isSunny1 = true;
let isWorm1 = false;
if(isSunny1 || isWorm1){
    console.log("it's sunny and worm!");
}else{
    console.log("it's either sunny or not worm!");
}

// javascript arrays used to store the group of elements of same data type

const friends =["ratan","anu","sathya"];
console.log(friends);
console.log(friends[0]);
console.log(friends[1]);
console.log(friends[2]);
console.log(friends.length);
console.log(friends[friends.length-1]);
// replace
friends[2]="sathyatech";
console.log(friends[2]);

//arrays functions
// javascript provieds various functions to manipulate arrays, such as push(),pop(), shift(),unshift(),slice(),concat(),join(),
//indexof(), forEach(), map(), filter()..etc;

let colors =["red","green","blue"];
colors.push("yellow");// add yellow to the end
console.log(colors);

colors.unshift('orange');// add first
console.log(colors);

colors.pop();// remove the last element
console.log(colors);

colors.shift();// remove the first element
console.log(colors);

// adding multiple elements
let numbers =[10,20,30,40,50];
numbers.push(60);
numbers.push(70,80);
console.log(numbers);
// remove the last element
numbers.pop();
console.log(numbers);
// remove the first element
numbers.shift();
console.log(numbers);
// adding multiple elements
numbers.unshift(10,1);
console.log(numbers);
// it will remove the data from specific index and add the data from specific index
numbers.splice(2,1);// 2 is index remove 1 elemet
console.log(numbers);
numbers.splice(2,0,7);// 2 is index remove 0 elemet insert number 7
console.log(numbers);

numbers.slice(1,3);// it will create a copay of array list
console.log(numbers);

// concat the two arrays and return the new array

let numberss =[1,2];
let numbersss =[3,4];
let combined = numberss.concat(numbersss);
console.log(combined);

let fruit =["apple","mango","orange"];
let final=fruit.join("/");
console.log(final);

let res1 =fruit.indexOf("orange");
console.log(res1);

// forEach used to iterate all elements from the list with lambda expression java8 feature

let fruits=["apple","mango","orange","apple","mango","orange"];
fruits.forEach((fruit ,index,array )=>{ console.log("fruit name :"+fruit+" index : "+index+" array"+array)});
//another approach

fruits.forEach((fruit ,index,array )=>{ console.log(`fruit name : ${fruit} index : "${index} array ${array}`)});

// map () used to apply the operation on all array elements

let names=["hello","hi","bye","ciao"];
let finalnames=names.map(name=>name+"nice");
console.log(finalnames);

let prices=[10,56,36,56];
let finalprice=prices.map(price=>price+100);
console.log(finalprice);

// filter () filter the data names starts with "r"

var name1 =["raju","rani","roji","baji"];
var result = name1.filter(names=>names.startsWith("r"));
console.log(result);

// filter () filter the salaries >10000
var salaries=[10000,5666,12000,30000];
var result=salaries.filter(salary=>salary>10000);
console.log(result)

// filter () filter the data names starts with "r" and length ==5 and add nice

var name1 =["syed_azhar","azhar","hello","ratan"];
var result1 = name1.filter(names=>names.startsWith("r")&& name1.length===4).map(names=>names+"nice");
console.log(result1);

// reduce () it will perform the operations on all elements returns only one value\
// ex sum o all numbers sum of all marks sum of all salaries etc..
// to perform above operations we at a time we need two values so the reduce function with 2 variables.
//sum of all prices 
var price =[10,20,30,40,50];
var result =price.reduce((p1,p2)=>p1+p2);
console.log(result);

// let vs var 
//var: once declare the vaiable using var keyboard at function level , that can be used in entire function. let: once we declare the variable
// using let keyboard at if statement level that variable can be used only inside the if-statement.
function myfun(){
    var num=100;
    if(true){
        let value =10;
        console.log(num);
        console.log(value);
    }
    console.log(num);
        // console.log(value);// erroe you cant print the value cuz let used only inside the block like if {}block
}
// variable declared global level so other functions can also access the elements
myfun1();
var num00=100;
let value =10;
function myfun1(){
    if(true){
        let value =10;
        console.log(num00);
        console.log(value);
    }
}
myfun1();
function myfun2(){
if(true){
    let value =10;
    console.log(num00);
    console.log(value);
}
}
myfun2();