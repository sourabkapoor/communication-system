var button = document.getElementById("button");
var text = document.getElementById("text");
var ul = document.querySelector("ul");

function inputSize() {
	return text.value.length;
}

function append() {
	var li = document.createElement("li");
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


