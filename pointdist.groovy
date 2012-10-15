class Point 
{
	double x;
	double y;
}

Point p1 = new Point()
print "Enter a point 1's x coord "
p1.x = Double.parseDouble(System.console().readLine())
print "Enter a point 1's y coord "
p1.y = Double.parseDouble(System.console().readLine())

Point p2 = new Point()
print "Enter a point 2's x coord "
p2.x = Double.parseDouble(System.console().readLine())
print "Enter a point 2's y coord "
p2.y = Double.parseDouble(System.console().readLine())

Point p3 = new Point()
print "Enter a point 3's x coord "
p3.x = Double.parseDouble(System.console().readLine())
print "Enter a point 3's y coord "
p3.y = Double.parseDouble(System.console().readLine())

d12 = (p1.x - p2.x) ** 2
d13 = (p1.x - p3.x) ** 2
d23 = (p2.x - p3.x) ** 2

if(d12 < d13)
{
	if(d12 < d23)
		println("1 and 2 are nearer")
	else
		println("2 and 3 are nearer")
}
else
{
	if(d13 < d23)
		println("1 and 3 are nearer")
	else
		println("2 and 3 are nearer")
}




