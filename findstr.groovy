print "Enter some text "
String text = System.console().readLine()
int tlen = text.length()
print "Enter a string to search for "
String srch = System.console().readLine()
int slen = srch.length()

int tpos = 0, spos = 0, tsave, matches

while(tpos <= tlen)
{
	spos = 0
	while(tpos < tlen && text.charAt(tpos) != srch.charAt(spos))
		tpos++

	if(tpos >= tlen)
		break
	
	tsave = tpos + 1;

	while(tpos < tlen && spos < slen && text.charAt(tpos) == srch.charAt(spos))
	{
		tpos++
		spos++
		if(spos >= slen)
		{
			matches++
			tsave = tpos
			break
		}
	}
	if(tpos >= tlen)
		break
	
	tpos = tsave
}

println("There were " + matches + " matches in that string")




