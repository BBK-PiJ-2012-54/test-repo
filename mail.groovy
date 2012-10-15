String text
int state = 0
String expect
String quit = "QUIT"
int qlen = quit.length()

while(true)
{
	text = System.console().readLine()
	int tlen = text.length()
	
	int pos = 0
	
	while(pos < qlen && text.charAt(pos) == quit.charAt(pos))
		pos++
	
	if(pos == qlen)
	{
		println("Bye!")
		return
	}
	
	pos = 0
	
	if(state == 0)
		expect = "MAIL FROM: "
	else if(state == 1)
		expect = "RCPT TO: "
	else if(state == 2)
		expect = "DATA"
	else if(state == 3)
		continue; // anything goes in data
	
	int elen = expect.length()
	
	if(state < 2 && tlen <= elen)
	{
		println("Invalid command (short)")
		continue;
	}		
	while(pos < elen && text.charAt(pos) == expect.charAt(pos))
		pos++
	
	if(pos == elen)
	{
		println("DIAG got " + text)
		if(state == 0 || state == 1)
		{
			// expect e-mail address to follow
			// for this purpose I'm saying an e-mail address is
			// <letters>@<letters-or-dots>
			while(pos < tlen && text.charAt(pos).isLetter())
				pos++
			if(text.charAt(pos) != '@')
			{
				println("Invalid e-mail address")
				continue
			}
			pos++
			while(pos < tlen && (text.charAt(pos).isLetter() || text.charAt(pos) == '.'))
				pos++
			if(pos != tlen)
			{
				println("Invalid e-mail address")
				continue				
			}
		}
		state++
	}
	else
		println("Invalid command")
}



