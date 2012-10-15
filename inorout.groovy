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

Rectangle r = new Rectangle()
r.upLeft = new Point()
r.downRight = new Point()

print "Enter upper left x coord "
r.upLeft.x = Double.parseDouble(System.console().readLine())
print "Enter upper left y coord "
r.upLeft.y = Double.parseDouble(System.console().readLine())

print "Enter lower right x coord "
r.downRight.x = Double.parseDouble(System.console().readLine())
print "Enter lower right y coord "
r.downRight.y = Double.parseDouble(System.console().readLine())

p = new Point()
print "Enter point x coord "
p.x = Double.parseDouble(System.console().readLine())
print "Enter point y coord "
p.y = Double.parseDouble(System.console().readLine())

if(p.x < r.upLeft.x || p.x > r.downRight.x || 
   p.y > r.upLeft.y || p.y < r.downRight.y)
	println("Out")
else
	println("In")

