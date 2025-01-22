var ws;

function connect() {
    var username = document.getElementById("username").value;

    var host = document.location.host;
    var pathname = document.location.pathname;

    ws = new WebSocket("ws://" + host + pathname + "chat/" + username);
    ws.onmessage = function (event) {
        //alert(event.data);
        var log = document.getElementById("log");
        console.log(event.data);
        var message = JSON.parse(event.data);
        log.innerHTML += message.from + " : " + message.content + "\n";
    };
}

function send() {
    var content = document.getElementById("msg").value;
    var to = document.getElementById("recipient").value;
    var json;
    if (to) {
        json = JSON.stringify({
            "content": content,
            "to": to
        });
    } else {
        json = JSON.stringify({
            "content": content
        });
    }
    ws.send(json);
}


//function send() {
//    var content = document.getElementById("msg").value;
//    var json = JSON.stringify({
//        "content": content
//    });
//
//    ws.send(json);
//}


