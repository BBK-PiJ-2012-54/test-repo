print "Enter some text "
String text = System.console().readLine()
int tlen = text.length()

int front = 0, back = (tlen - 1)

while(front < back) // no need to test when equal
{
	while(text.charAt(front).isLetter() == false)
		front++
	while(text.charAt(back).isLetter() == false)
		back--

	if(front >= back)
		break
	
	if(text.charAt(front).toLowerCase() != text.charAt(back).toLowerCase())
	{
		println("That was not a palindrome")
		return
	}
	
	front++
	back--
}
println("That was a palindrome")





