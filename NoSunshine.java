public class NoSunshine {
public static void main(String[] args) {
L(2,"");
L(1,"It's not warm when she's away\n");
L(2,"");
L(1,"And she's always gone too long\n");
L(3,"");
L(1,"\n");
L(1,"Wonder this time where she's gone\nWonder if she's gone to stay\n");
L(2,"");
L(1,"And this house just ain't no home\n");
L(3,"");
L(1,"\n");
L(1,"And ");
for(int i=0;i<4;i++) {L(4,"");}
L(1,"\n");
for(int i=0;i<4;i++) {for(int e=0;e<5;e++) {L(4,"");}
L(1,"\n");}
L(4,"");
L(4,"");
L(1,"\n");
L(1,"\n");
L(1,"Hey, I ought to leave young thing alone\n");
L(1,"But ain't no sunshine when she's gone, whoa-whoa\n");
L(2,"");
L(1,"Only darkness every day\n");
L(1,"\n");
L(2,"");
L(1,"And this house just ain't no home\n");
L(1,"\n");
for(int i=0;i<4;i++) {L(3,"");}
}
static void L(int l,String n){
if(l==1){
System.out.print(n);
}
if(l==2){
System.out.println("Ain't no sunshine when she's gone");
}
if(l==3){
System.out.println("Anytime she goes away");
}
if(l==4){
System.out.print("I know, ");
}
}
}