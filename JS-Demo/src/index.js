 function add() {
        var textInput = document.getElementById("textInput");
        var textTrim = textInput.value.trim();

        if(textTrim) {
            let taskList = document.getElementById('taskList');
            let listItem = document.createElement('li');
            listItem.innerHTML = textTrim + ' <span onClick="remove(this)"> X </span>';
            taskList.appendChild(listItem);
            textInput.value = "";
        }
    }

    function remove(element) {
        element.parentElement.remove();
    }

    document.getElementById("textInput").addEventListener('keypress', function(event) {
        if(event.key === 'Enter') {
            add();
        }
    });