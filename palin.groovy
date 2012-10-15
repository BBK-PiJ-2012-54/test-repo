print "Enter some text "
String text = System.console().readLine()
int tlen = text.length()

int front = 0, back = (tlen - 1)

while(front < back) // no need to test when equal
{
	if(text.charAt(front) != text.charAt(back))
	{
		println("That was not a palindrome")
		return
	}
	front++
	back--
}
println("That was a palindrome")





