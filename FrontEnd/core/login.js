var username, password, remmeberMe;
var isValid = true;

$(document).ready(function(){
    Login();
});


function Login(){
    $("#loginBtn").on("click", function(){
        GetValues();
        if(isValid)
        {
            var resul = ValidSignIn(username, password);
            isValid = resul.flag;
            if (isValid)
                window.location.href = "../views/dashboard.html";
            else
                alert(ValidSignIn().message);
        }
    });
}

function GetValues(){
    isValid = true;
    username = $("#usernameIpt").val();
    password = $("#passwordIpt").val();
    if (username == "")
    {
        alert("Emply username");
        isValid = false;
    }

    if (password == "")
    {
        alert("Emply password");
        isValid = false;
    }
}