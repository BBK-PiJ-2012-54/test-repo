class Rectangle
{
	Point upLeft;
	Point downRight;
}

class Point 
{
	double x;
	double y;
}

Rectangle r1 = new Rectangle()
r1.upLeft = new Point()
r1.downRight = new Point()

println("RECTANGLE 1")
print "Enter upper left x coord "
r1.upLeft.x = Double.parseDouble(System.console().readLine())
print "Enter upper left y coord "
r1.upLeft.y = Double.parseDouble(System.console().readLine())

print "Enter lower right x coord "
r1.downRight.x = Double.parseDouble(System.console().readLine())
print "Enter lower right y coord "
r1.downRight.y = Double.parseDouble(System.console().readLine())

Rectangle r2 = new Rectangle()
r2.upLeft = new Point()
r2.downRight = new Point()

println("RECTANGLE 2")
print "Enter upper left x coord "
r2.upLeft.x = Double.parseDouble(System.console().readLine())
print "Enter upper left y coord "
r2.upLeft.y = Double.parseDouble(System.console().readLine())

print "Enter lower right x coord "
r2.downRight.x = Double.parseDouble(System.console().readLine())
print "Enter lower right y coord "
r2.downRight.y = Double.parseDouble(System.console().readLine())

while(true)
{
	p = new Point()
	print "Enter point x coord "
	p.x = Double.parseDouble(System.console().readLine())
	if(p.x < 0)
		return
	print "Enter point y coord "
	p.y = Double.parseDouble(System.console().readLine())

	int ins = 0;
	if(p.x < r1.upLeft.x || p.x > r1.downRight.x || 
	   p.y > r1.upLeft.y || p.y < r1.downRight.y)
		ins++
	
	if(p.x < r2.upLeft.x || p.x > r2.downRight.x || 
	   p.y > r2.upLeft.y || p.y < r2.downRight.y)
		   ins++

	if(ins == 0)	
		println("Out of both")
	else if(ins == 1)
		println("In one")
	else
		println("In both")
}

