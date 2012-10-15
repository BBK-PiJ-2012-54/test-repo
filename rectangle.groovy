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

int height = r.upLeft.x - r.downRight.x
int width = r.upLeft.y - r.downRight.y

println("Perimeter is " + 2 * (height + width) + ", area is " + (height * width))

