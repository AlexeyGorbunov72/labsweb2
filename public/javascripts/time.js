function parseHttpHeaders(httpHeaders) {
    return httpHeaders.split("\n")
     .map(x=>x.split(/: */,2))
     .filter(x=>x[0])
     .reduce((ac, x)=>{ac[x[0]] = x[1];return ac;}, {});
}

var req = new XMLHttpRequest();
req.open('GET', document.location, false);
req.send(null);
var headers = parseHttpHeaders(req.getAllResponseHeaders());
var startTime = 0;

(function() {
    startTime = (new Date).getTime();
})();

window.onload = function() {
    var endTime = (new Date).getTime();
    var footer = document.querySelector('footer');
    let serverHandleTime = Number(headers["request-time"])
    console.log(endTime - startTime)
    console.log(serverHandleTime)
    footer.firstElementChild.textContent += ' ';
    footer.firstElementChild.textContent += endTime - startTime + serverHandleTime  + 'ms.';
}