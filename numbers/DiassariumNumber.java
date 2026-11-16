public class DiassariumNumber{
public static int exponent(int base, int power){
int res=1;
for(int i=1;i<=poweri++){
res=res*base;
}
return res;
}
public static void main(String[] args){ 
int n=153;
int count=0;
int temp=n;
int sum=0;
while(n!=0){
count++;
n=n/10;
}
n=temp;
while(n!=0){
int last=n%10;
sum=sum+exponent(last,count);
n=n/10;
count--;
}
if(temp==sum){
System.out.println("Diassarium number");
} 
else{
System.out.println("Not an Diassarium number");
}
}
}