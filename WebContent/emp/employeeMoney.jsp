<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="https://code.jquery.com/resource/demos/style.css"> 
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
  
    <script>
function validate()
 {
	 if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("employee_name").value)) {
	    alert("name can only contain  characters,special characters are not allowed");
	    return false;
	  }
	if((document.getElementById("employee_name").value).length<3)
	{
        alert( "Please enter valid employee name !" ); 
        return false;
    }
		
	if( document.getElementById("employee_name").value == "" )
	     {
	         alert( "Please enter employee name !" ); 
	         return false;
	     }
	if(!isNaN(  document.getElementById("employee_name").value )){
		alert("plese Enter name in character");
		employee_name.focus();
		
		return false;
	}
		 if( document.getElementById("address").value == "" )
		 {
		     alert( "Please enter no of address !" ); 
		     return false;
		 } 
		 
		 if((document.getElementById("address").value).length<8)
			{
		        alert( "Please enter valid address  !" ); 
		        return false;
		    }
		 if(isNaN(  document.getElementById("paymentrs").value )){
				alert("plese Enter Numeric value");
				paymentrs.focus();
				
				return false;
			}
		 if( document.getElementById("paymentrs").value == "" )
		 {
		     alert( "Please enter rs !" ); 
		     return false;
		 } 
		 if((document.getElementById("paymentrs").value).length<0)
			{
		        alert( "Please enter valid  payment rs can not be less than zero!" ); 
		        return false;
		    }
		 
		 if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("paymentrs").value)) {
			    alert("special characters are not allowed in payment field");
			    return false;
			  }
		 
		 if( document.getElementById("datepicker").value == "" )
		 {
		     alert( "Please enter date !" ); 
		     return false;
		 }
		 
		 if( document.getElementById("owner").value == "" )
		 {
		     alert( "Please enter owner name !" ); 
		     return false;
		 }
		 if(!isNaN(  document.getElementById("owner").value )){
				alert("plese Enter owner name in character");
				owner.focus();
				
				return false;
			}
		 if((document.getElementById("owner").value).length<3)
			{
		        alert( "Please enter valid  owner name !" ); 
		        return false;
		    }
		 if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("owner").value)) {
			    alert("special characters are not allowed in owner name");
			    return false;
			  }
        return(true);
 }

	</script>
</head>
<body style="background-color:orange">
<form action="../EmployeeMoneyController" method="post" onsubmit="return(validate());">
       <h2 style="text-align:center;color:black">EMPLOYEE MANAGEMENT</h2>
       <table>
       <tr>
       <td>
           <div  style="margin-top:100px">
             <label style="margin-left: 120px;">Employee Name</label><br>
             <input style="margin-left: 95px;" type="text" name="employee_name" id="employee_name" maxlength="25">&nbsp;&nbsp;&nbsp;
           </div>   
           </td> 
            <td>
           <div  style="margin-top:100px">
             <label style="margin-left: 30px;">Address</label><br>
             <input type="text" name="address"  id="address" style="margin-left: 10px;" maxlength="100">&nbsp;&nbsp;&nbsp;
           </div>
           </td> 
            
            <td>
           <div  style="margin-top:100px">
             <label style="margin-left: 30px;">Payment RS</label><br>
             <input type="text" name="paymentrs"  id="paymentrs" style="margin-left: 10px;" maxlength="10">&nbsp;&nbsp;&nbsp;
           </div> 
           </td>
            
          <td>
          <div  style="margin-top:100px">
             <label style="margin-left: 30px;">Date</label><br>
             <input type="text" name="date" id="datepicker" style="margin-left: 10px;">&nbsp;&nbsp;&nbsp;
          </div>  
          </td>
          
          <td>
           <div  style="margin-top:100px">
             <label style="margin-left: 30px;">Owner</label><br>
             <input type="text" name="owner"  id="owner" style="margin-left: 10px;"  maxlength="25">&nbsp;&nbsp;&nbsp;
           </div> 
           </td>
           <td>
          <div  style="margin-top:163px">
             <input  class="btn btn-info" type="submit" value="Submit" id="submit" size="10" style="margin-left: 10px;margin-top:23px;width:120px;height:30px">&nbsp;&nbsp;&nbsp;
          </div> 
           <div style="margin-top:45px;margin-left:45px">
          <a href="employeeFindRecord.jsp" style="color:black">FindRecord</a>
           
          </div>
          </td>
          </tr>
          
          </table>
</body>
</html>