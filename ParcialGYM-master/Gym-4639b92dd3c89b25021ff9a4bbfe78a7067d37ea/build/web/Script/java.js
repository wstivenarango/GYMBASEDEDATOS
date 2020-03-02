function validar() {

    var a1 = document.getElementsByName("nombre")[0].value;
    var a2 = document.getElementsByName("peso")[0].value;
    var a3 = document.getElementsByName("estatura")[0].value;


    var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if (a1.length == 0 || a2.length == 0 || a3.length == 0 ) {  //COMPRUEBA CAMPOS VACIOS
        alert("Los campos no pueden quedar vacios");

        return false;
    }
    return true;
    }
//    if (isNaN(a9) || isNaN(a0) || isNaN(a3)) {
//        alert("Revise los campos que son caracteres numericos")
//
//        return false;
//    }
//
//}
//
//function getVarsUrl() {
//    var url = location.search.replace("?", "");
//    var arrUrl = url.split("&");
//    var urlObj = {};
//    for (var i = 0; i < arrUrl.length; i++) {
//        var x = arrUrl[i].split("=");
//        urlObj[x[0]] = x[1]
//    }
//    return urlObj;
//}
//var misVariablesGet = getVarsUrl();
//
//
//function imprimir() {
//    var misvariablesGet = getVarsUrl();
//    for (var el in misVariablesGet) {
//        document.getElementById(el).innerHTML = misVariablesGet[el]
//    }
//
//}