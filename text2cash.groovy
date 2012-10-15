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

println "That is " + inum + " pence";


