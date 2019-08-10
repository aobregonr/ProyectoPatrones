// Using APIs to check the Data

var resul = {
    message : "",
    flag : true
}

function ValidSignIn(username, password)
{
    // HERE send the AJAX request and send the resul

    if (username == "admin" && password == "123")
    {
        resul.message = "User valid";
        resul.flag = true;
    }else{
        resul.message = "User Invalid";
        resul.flag = false;
    }

    return resul;
}