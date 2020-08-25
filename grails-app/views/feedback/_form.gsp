<div class="fieldcontain">
  <label for="firstName">firstName</label>
  <g:textField name="firstName" value="${firstName}"/>

</div>
<div class="fieldcontain">
  <label for="comments">comments</label>
  <g:textArea name="comments" value="${comments}"/>

</div>
<div class="fieldcontain">
  <label for="gender">Gender:</label>
  <g:radioGroup name="gender" labels="['Male','Female']" values="['M','F']" value="${gender}">

   ${it.label} ${it.radio}
    </g:radioGroup>

</div>

