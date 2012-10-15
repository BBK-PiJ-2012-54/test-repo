print "Enter some text "
String text = System.console().readLine()
int slen = text.length()
print "Enter a char "
char ch = System.console().readLine().charAt(0)

int chcount = 0
for(int i; i < slen; i++)
{
   if(text.charAt(i) == ch)
       chcount++;
}

println("There were " + chcount + " '" + ch + "'s in that string")




