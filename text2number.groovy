print "Gimme a number ";
String snum = System.console().readLine();
int slen = snum.length()
int inum = 0; place = 0; dpos = 0;
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
      if(dpos != 0)
      {
          println("Invalid input (two decimal points)")
          return
      }
      dpos = place;
   }
   else if(numCh != ',')
   {
       println("Invalid input (unexpected char)")
       return
   }
}

if(dpos == 0) // no d.p
   dpos = place;

double outNum = inum / (10 ** (place - dpos)) / 2.0;
println "Half of that is " + outNum;


