
/*$(document).ready(function(){
    Login();
});


function Login(){
    $("#loginBtn").on("click", function(){
    	validate();
    	
    	if(isValid)
        {
    		$.post("../login")
        } else{
        	//$(".card-body, .login-card-body").prepend("<p class=\"login-box-msg\">Empty fields, try again.</p>");
        	
        	Swal.fire({
        	  type: 'error',
        	  title: 'Oops...',
        	  text: 'Something went wrong!',
        	  footer: '<a href>Why do I have this issue?</a>'
        	})
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
}*/

function Login(pMessage){
   
    	

        	Swal.fire({
        	  type: 'error',
        	  title: 'Oops...',
        	  text: pMessage,
        	  footer: '<a href>Why do I have this issue?</a>'
        	})
     

}

