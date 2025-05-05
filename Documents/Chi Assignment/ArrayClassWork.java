public class ArrayClassWork {
public static void main(String[] args) {


int number = 5;

int[] score = new int [5];
score[0] = 22;
score[1] = 51;
score[2] = 38;
score[3] = 23;
score[4] = 48;
int sum1 = score[0] + score[1] + score[2] + score[3] + score[4];
int sum2 = score[0] + score[1] + score[2] + score[3] + score[4];

for (int counter = 0; counter < score.length; counter++) {
System.out.println(score[counter]);

}
System.out.println(sum1);
System.out.println();

for (int counter = 0; counter < score.length; counter++) {
System.out.print(score[counter] + "  " );

}
System.out.println(sum2);
System.out.println();

}
}