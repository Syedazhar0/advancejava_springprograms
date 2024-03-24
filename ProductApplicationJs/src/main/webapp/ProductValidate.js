function valildation(){
    // read the form data
    var proid = document.getElementById("proid").value;
    var pname = document.getElementById("pname").value;
    var pprice = document.getElementById("pprice").value;
    var pbrand = document.getElementById("pbrand").value;
    var pMadeIn = document.getElementById("pMadeIn").value;

    if(proid.trim()===""||pname.trim()===""||pprice.trim()===""||pbrand.trim()===""||pMadeIn.trim()===""){
        alert("all fields must be filled out");
        return false;
    }

    if (parseFloat(pprice)<0) {
        alert("price must be a nonnegative value");
        return false;
    }

   if (pname.length>50) {
       alert("product name and product brand must be lessthan 50 characters");
       return false;
   }

    //get the dates
    var pmfd = document.getElementById("pmfd").value;
    var pexpdate = document.getElementById("pexpdate").value;

    // pmfd and pexpdate convert string type to date format

    var manufacdate = new Date(pmfd);
    var proexpdate = new Date(pexpdate);

    // check the validations of dates

    if(manufacdate>proexpdate){
        alert("manufacturing date cannot be greater than expiry date");
        return false;
    }
    return true;
}