
$(document).ready(function(){
    Login();
});


function Login(){
    $("#loginBtn").on("click", function(){
        
    	message = this.data-user;
    	validate();
    	
    	if(isValid)
        {
        	$(".card-body, .login-card-body").prepend("<p class=\"login-box-msg\">User not found, try again.</p>");
        } else{
        	$(".card-body, .login-card-body").prepend("<p class=\"login-box-msg\">Empty fields, try again.</p>");
        }
    });
}

function validate(){
    isValid = true;
    username = $("#usernameIpt").val();
    password = $("#passwordIpt").val();
    
    
    if (username == "" || password == ""){
        isValid = false;
    }
    
    return isValid;
}

