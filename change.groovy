print "Enter amount to pay ";
String snum = System.console().readLine();
int slen = snum.length()
int inum = 0; place = 0; dotpos = -1;
char char0 = '0'

for(int i = 0; i < slen; i++)
{
   char numCh = snum.charAt(i)
   if(numCh >= '0' && numCh <= '9')
   {
      inum *= 10
      inum += (numCh - char0)
      place++
   }
   else if(numCh == '.')
   {
      if(dotpos != -1)
      {
          println("Invalid input (two decimal points)")
          return
      }
      dotpos = place;
   }
   else if(numCh != ',')
   {
       println("Invalid input (unexpected char)")
       return
   }
}

if(dotpos == -1) // no d.p, assume pounds
   inum *= 100;
else if(dotpos != (place - 2))
{
   println "Invalid input (decimal point in wrong place)"
   return
}

print "Now enter tender amount ";
snum = System.console().readLine();
slen = snum.length()
tnum = 0
place = 0
dotpos = -1;

for(int i = 0; i < slen; i++)
{
   char numCh = snum.charAt(i)
   if(numCh >= '0' && numCh <= '9')
   {
      tnum *= 10
      tnum += (numCh - char0)
      place++
   }
   else if(numCh == '.')
   {
      if(dotpos != -1)
      {
          println("Invalid input (two decimal points)")
          return
      }
      dotpos = place;
   }
   else if(numCh != ',')
   {
       println("Invalid input (unexpected char)")
       return
   }
}

if(dotpos == -1) // no d.p, assume pounds
   tnum *= 100;
else if(dotpos != (place - 2))
{
   println "Invalid input (decimal point in wrong place)"
   return
}

// calc change
int cnum = tnum - inum
// There will be max one of the 1.. and 5.. notes and coins 
// as there are notes and coins that are double that.
// But max two of 2.. coins and notes as (2 * 2 < 5!)
// So an unrolled loop is easiest
// As £50 is the max note we assume the change won't be > £50

int pounds20 = 0; pounds2 = 0; pence20 = 0; pence2 = 0
if(cnum > 5000)
{
   println("1 x £50")
   cnum -= 5000
}
if(cnum >= 2000)
{
   pounds20++;
   cnum -= 2000
}
if(cnum >= 2000)
{
   pounds20++;
   cnum -= 2000
}
if(pounds20 > 0)
   println(pounds20 + " x £20")
if(cnum >= 1000)
{
   println("1 x £10")
   cnum -= 1000
}
if(cnum >= 500)
{
   println("1 x £5")
   cnum -= 500
}
if(cnum >= 200)
{
   pounds2++;
   cnum -= 200
}
if(cnum >= 200)
{
   pounds2++;
   cnum -= 200
}
if(pounds2 >= 0)
   println(pounds2 + " x £2")
if(cnum > 100)
{
   println("1 x £1")
   cnum -= 100
}
if(cnum > 50)
{
   println("1 x 50p")
   cnum -= 50
}
if(cnum >= 20)
{
   pence20++;
   cnum -= 20
}
if(cnum >= 20)
{
   pence20++;
   cnum -= 20
}
if(pence20 > 0)
   println(pence20 + " x 20p")
if(cnum > 10)
{
   println("1 x 10p")
   cnum -= 10
}
if(cnum >= 5)
{
   println("1 x 5p")
   cnum -= 5
}
if(cnum > 2)
{
   pence2++;
   cnum -= 2
}
if(cnum >= 2)
{
   pence2++;
   cnum -= 2
}
if(pence2 > 0)
   println(pence2 + " x 2p")
if(cnum >= 1)
{
   println("1 x 1p")
   cnum -= 1
}
if(cnum != 0)
   println("Something's gone wrong: cnum is " + cnum)

