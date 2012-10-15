print "Enter some text "
String text = System.console().readLine()
int tlen = text.length()

String charsent = ""
int clen = 0

while(true)
{
	print "Enter a char "
	char ch = System.console().readLine().charAt(0)

	for(int i; i < clen; i++)
	{
		if(charsent.charAt(i) == ch)
		{
			println("Repeated char - bye")
			return
		}
	}
	
	int chcount = 0
	for(int i; i < tlen; i++)
	{
		if(text.charAt(i) == ch)
			chcount++;
	}

	println("There were " + chcount + " '" + ch + "'s in that string")
        
	charsent = charsent + ch
	clen++
}




