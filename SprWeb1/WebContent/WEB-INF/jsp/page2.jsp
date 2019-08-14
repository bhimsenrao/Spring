<%! 
int x=1;
%>

<%
out.print("Visit Count: ");
if(x==1){
out.print("First Time");
}
else{
out.print(x+" times");
}
x++;
%>