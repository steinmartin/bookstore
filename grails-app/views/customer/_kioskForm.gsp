<div class="container" xmlns:g="http://www.w3.org/1999/html"
     xmlns:action="http://www.w3.org/1999/xhtml">
     <div class ="row">
             <div class="col-sm-12">
                 <img src="../src/main/webapp/images/bookstore1.png"  alt="bookstoreimage">
             </div>
     </div>
  <div class ="row">
    <div class="col-sm-5 col-sm-offset-1">
      <h4>${welcomeMessage}</h4>


    </div>
    <div class="col-sm-6">
      <g:textField name="phone" class="form-control" placeholder="Enter your ID to checkin" value="${customerInstance?.phone}"/> <!-- ? ->bedeutet if dont null print out the ID else dont  -->

      <div class="row"><!--First Button Row spacer -->
         <h4></h4>
      </div>
      <div class="row"><!--First Button Row  -->
         <div class="col-sm-4">
           <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="1" onclick="padkey(this.value)"/>
         </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="2" onclick="padkey(this.value)" />
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="3" onclick="padkey(this.value)"  />
        </div>
      </div>

      <div class="row"><!--Second Button Row spacer -->
        <h4></h4>
      </div>
      <div class="row"><!--Second Button Row  -->
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="4" onclick="padkey(this.value)" />
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="5" onclick="padkey(this.value)" />
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="6" onclick="padkey(this.value)" />
        </div>
      </div>

      <div class="row"><!--Third Button Row spacer -->
        <h4></h4>
      </div>
      <div class="row"><!--Third Button Row  -->
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="7" onclick="padkey(this.value)" />
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="8" onclick="padkey(this.value)"  />
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="9" onclick="padkey(this.value)"  />
        </div>
      </div>

      <div class="row"><!--Fourth Button Row spacer -->
        <h4></h4>
      </div>
      <div class="row"><!--Third Button Row  -->
        <div class="col-sm-4">
          <g:link class="btn btn-danger btn-lg btn-block" type="button" name="pad" action="checkin"> Del</g:link>
        </div>
        <div class="col-sm-4">
          <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="0" onclick="padkey(this.value)" />
        </div>
        <div class="col-sm-4">
          <g:submitButton class="btn btn-success btn-lg btn-block" type="button" name="pad" value="Go" onclick="padkey(this.value)" />
        </div>
      </div>

    </div>
  </div>
</div>

<!-- pad button script -->
<script type="text/javascript" > function padkey(num) {
	var txt=document.getElementById("phone").value;
	txt=txt + num;
	document.getElementById("phone").value=txt;
	}
</script>
