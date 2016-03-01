function ajax_get_json(){
    var hr = new XMLHttpRequest();
    hr.open("GET", "list.json", true);
    hr.setRequestHeader("Content-type", "application/json", true);
    hr.onreadystatechange = function() {
	    if(hr.readyState == 4 && hr.status == 200) {
                var data = JSON.parse(hr.responseText);
                var results = document.getElementById("results");
                results.innerHTML= "";
                for(var obj in data) {
                    results.innerHTML += data[obj].user+" is "+data[obj].age+" and lives in "+data[obj].country+"<hr/>";
            }
        }
    }
    hr.send(null); 
    results.innerHTML = "requesting...";
}

{
var sandwiches = ["pb&j","ham & cheese","BLT", "Turkey Wrap", "grilled cheese"];
var fruits = ["apple","plumb","grape", "orange", "banana", "grapes","cherries","kiwi"];
var treats = ["cookie","candy","chips","fruit roll up","goldfish","cheese","fruit snacks"]
var drinks = ["milk","water","apple juice","kool-aid","soda","tang"]
var obj5 = { arr1:sandwiches, arr2:fruits, arr3:treats, arr4:drinks };

function pickasandwhich() {
    var sandwich = sandwiches[Math.floor(Math.random() * sandwiches.length)];
    return sandwich;
    document.getElementById("sandwich").innerHTML = sandwich;} 
}

function pickafruit() {
    var fruit = fruits[Math.floor(Math.random() * fruits.length)];
    return sandwich;
    document.getElementById("fruit").innerHTML = fruit;} 

function pickatreat() {
    var treat = sandwiches[Math.floor(Math.random() * treats.length)];
    return treat;
    document.getElementById("treat").innerHTML = treat;} 

function pickadrink() {
    var drink = drinks[Math.floor(Math.random() * drinks.length)];
    return drink;
    document.getElementById("sandwich").innerHTML = drink;} 

