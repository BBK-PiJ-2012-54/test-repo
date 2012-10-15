print "Enter some text ";
String text = System.console().readLine();
int slen = text.length()

int i = 0; j = 0
while(true)
{
    while(i < slen && text.charAt(i) != ' ')
        i++

    println(text.substring(j, i))

    i++
    j = i

    if(j >= slen)
        break
}




