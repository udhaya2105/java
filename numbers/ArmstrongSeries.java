class ArmstrongSeries{
public static boolean isArmstrong(int num){
int temp=num;
int sum=0;
int count=0;
int n=num;
while(n>0){
count++;
n=n/10;
}
n=num;
while(n>0){
int digit=n%10;
int power=1;
for (int i=1;i<=count;i++){
power=power*digit;
}
sum=sum+power;
n=n/10;
}
return sum==temp;
}
public static void main(String[] args){
for(int i=1;i<=9999;i++){
if(isArmstrong(i)){
System.out.println(i);
}
}
}
}