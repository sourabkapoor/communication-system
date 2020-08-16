var button = document.getElementById("button");
var text = document.getElementById("text");
var ul = document.querySelector("ul");
var name = document.getElementById('name').innerHTML;
console.log(name)

function inputSize() {
	return text.value.length;
}

function append() {
	var li = document.createElement("li");
		li.appendChild(document.createTextNode(name + ": "))
		li.appendChild(document.createTextNode(text.value));
		ul.appendChild(li);
		text.value = "";
}

button.addEventListener("click", function() {
	if(inputSize() >0) {
		append(); 
	}
});

text.addEventListener("keypress", function(event) {
	if(inputSize() >0 && event.keyCode=== 13) {
		append();
	}
});


