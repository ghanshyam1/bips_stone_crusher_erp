
<!DOCTYPE html>
<html lang="en-us">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
  


<!-- <script type="text/javascript" src="../js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/angular.min.js"></script>
<script type="text/javascript" src="../js/jquery-birthday-picker.min.js"></script>

<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" href="../css/bootstrapValidator.min.css" />
<script type="text/javascript" src="../js/bootstrapValidator.min.js"> </script> -->
<!--  <link rel="stylesheet" href="css/bootstrap.min.css" >-->



<body style="background-color:orange">
<script>
function validate()
 {
		
		if(isNaN(  document.getElementById("no_of_holes").value )){
			alert("plese Enter Numeric value");
			no_of_holes.focus();
			
			return false;
		}
		if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("no_of_holes").value)) {
		    alert("special characters are not allowed in no of holes field");
		    return false;
		  }
		if((document.getElementById("no_of_holes").value).length<0)
		{
	        alert( "Please enter valid  no of holes  can not be less than zero!" ); 
	        return false;
	    }
	if( document.getElementById("no_of_holes").value == "" )
	     {
	         alert( "Please enter no of holes !" ); 
	         return false;
	     }
		 if( document.getElementById("feet").value == "" )
		 {
		     alert( "Please enter no of feet !" ); 
		     return false;
		 } 
		 if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("feet").value)) {
			    alert("special characters are not allowed please enter valid value in feet field");
			    return false;
			  }
			if((document.getElementById("feet").value).length<0)
			{
		        alert( "Please enter valid  no of feet  can not be less than zero!" ); 
		        return false;
		    }
		 if(isNaN(  document.getElementById("feet").value )){
				alert("plese Enter Numeric value");
				no_of_holes.focus();
				
				return false;
			}
		 if( document.getElementById("onefeetrate").value == "" )
		 {
		     alert( "Please enter one feet rate !" ); 
		     return false;
		 }
		 if(isNaN(  document.getElementById("onefeetrate").value )){
				alert("plese Enter Numeric value");
				no_of_holes.focus();
				
				return false;
			}
		 if (/[^a-zA-Z0-9\-\/]/.test(document.getElementById("onefeetrate").value)) {
			    alert("special characters are not allowed in one feet rate field please enter valid");
			    return false;
			  }
			if((document.getElementById("onefeetrate").value).length<0)
			{
		        alert( "Please enter valid  one  feet rate can not be less than zero!" ); 
		        return false;
		    }
		 if( document.getElementById("datepicker").value == "" )
		 {
		     alert( "Please enter date !" ); 
		     return false;
		 }
		 if(document.submitform.systemdate.value == "mm/dd/yyyy")
	       {
	          alert( "Please Select Date!" );
	          document.submitform.usage.focus() ;
	          return false;
	       } 
		
	       if( document.submitform.rate.value == "" || document.submitform.rate.value == "rate")
       {
	          alert( "Please Enter Rate!" );
	          document.submitform.rate.focus() ;
	          return false;
	       }
		
	       if( document.submitform.quantity.value == "" || document.submitform.quantity.value == "Quantity")   
	       {
	          alert( "Please enter Qauantity!" );
	          document.submitform.quantity.focus() ;
	          return false;
	       }
       
	       if( document.submitform.no_of_trucks.value == "-1")
       {	          alert( "Please Select No. of Trucks!" );
           return false;
	       }
	       
	       if( document.submitform.company_name.value == "" || document.submitform.company_name.value == "company_name") 
      {
	          alert( "Please Enter Company Name, where good are being Sent" );
	          document.submitform.company_name.focus() ;
	          return false;
	       }
	       
	       if( document.submitform.payment.value == "" || document.submitform.payment.value == "Enter Payment Amount") 
	       {
	          alert( "Please Enter Payment Amount" );
	          document.submitform.payment.focus() ;
	          return false;
	       }
	       
	        
	    
		  return(true);
 }

	</script>
       <form name="minning" action="MinningController" name="submitform" onsubmit="return(validate());" method="post">
       <h2 style="text-align:center;color:black">MINNING ENTERY</h2>
       <table>
       <tr>
       <td>
           <div  style="margin-top:20px">
             <label style="margin-left: 300px;">NO OF HOLES</label><br>
             <input style="margin-left: 280px;" type="text" name="no_of_holes" id="no_of_holes" maxlength="3">&nbsp;&nbsp;&nbsp;
           </div>   
           </td> 
            <td>
           <div  style="margin-top:20px">
             <label style="margin-left: 30px;">FEET </label><br>
             <input type="text" name="feet" id="feet" style="margin-left: 10px;" maxlength="4">&nbsp;&nbsp;&nbsp;
           </div>
           </td> 
            
            <td>
           <div  style="margin-top:20px">
             <label style="margin-left: 30px;">ONE FEET RATE </label><br>
             <input type="text" name="onefeetrate" id="onefeetrate" style="margin-left: 10px;" maxlength="3">&nbsp;&nbsp;&nbsp;
           </div> 
           </td>
           
          <td>
          <div  style="margin-top:20px">
             <label style="margin-left: 30px;">Date</label><br>
             <input type="text" name="date" id="datepicker" style="margin-left: 10px;">&nbsp;&nbsp;&nbsp;
          </div>  
          </td>
          <td>
          <div  style="margin-top:100px">
             <input  class="btn btn-info" type="submit" value="Submit" id="submit" size="10" style="margin-left: 10px;margin-top:7px;width:120px;height:30px" onsubmit="return (validation());">&nbsp;&nbsp;&nbsp;
          </div> 
          <div style="margin-top:45px;margin-left:45px">
          <a href="minning/findRecord.jsp" style="color:black">FindRecord</a>
          
          </div> 
          </td>
          </tr>
          
          </table>
          
          

</body>
</html>
