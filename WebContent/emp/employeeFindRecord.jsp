<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

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
  $( function() {
    $( "#datepicker1" ).datepicker();
  } );
  </script>
  <script>
function validate()
 {
if( document.getElementById("datepicker").value == "" )
		 {
		     alert( "Please enter from date !" ); 
		     return false;
		 }
		 if( document.getElementById("datepicker1").value == "" )
		 {
		     alert( "Please enter to date !" ); 
		     return false;
		 }
	
 return(true);
 }

	</script>

<title>FindRecord</title>
</head>
<body style="background-color:orange">
<form action="../EmployeeRecordFindingController" method="post" onsubmit="return(validate());">
       
       <table>
       <tr>
     
          <td>
          <div  style="margin-top:20px">
             <label style="margin-left: 425px;">Select From Date</label><br>
             <input type="text" name="fromdate" id="datepicker" style="margin-left: 400px;">&nbsp;&nbsp;&nbsp;
          </div>  
          </td>
          <td>
          <div  style="margin-top:20px">
             <label style="margin-left: 30px;">Select To Date</label><br>
             <input type="text" name="todate" id="datepicker1" style="margin-left: 10px;">&nbsp;&nbsp;&nbsp;
          </div>  
          </td>
          <td>
          <div  style="margin-top:38px">
             <input type="submit" value="Submit" id="submit" size="10" style="margin-left: 10px;">&nbsp;&nbsp;&nbsp;
          </div> 
           
          </td>
          </tr>
          
          </table>
          
</body>
</html>