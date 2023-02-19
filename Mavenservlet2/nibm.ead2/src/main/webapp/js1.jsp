



<% private static final String COUNTER_KEY = "COUNTER_KEY"; %>
<html>
 <body>
<%
Integer counter = 0;
if(session.getAttribute(COUNTER_KEY)==null){

	%>
	Session created: counter = <%= counter %>
	<%
	
}
else{
counter = (Integer)session.getAttribute(COUNTER_KEY);
counter++
%>
counter = <%= counter %>
}

</body>
</html>
