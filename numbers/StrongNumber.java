public class StrongNumber{
public static int factorial(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
return fact;
}
public static void main(String[] args){
int n=145;
int temp=n;
int sum=0;
while(n!=0){
int last=n%10;
sum=sum+factorial(last);
n=n/10;
}
if(sum==temp){
System.out.println("Strong Number");
}
else{
System.out.println("Not a Strong Number");
}
}
}